/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.accesoADatos;


import hotelgrupo90.entidades.Habitacion;
import hotelgrupo90.entidades.Huesped;
import hotelgrupo90.entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 4K
 */
public class ReservaData {
    
    private Connection con = null;
    private HuespedData huesd = new HuespedData();
    private HabitacionData habd = new HabitacionData();
    Habitacion habi = new Habitacion ();

    public ReservaData( ) {
        this.con = Conexion.getConexion();
    }
    
    
    
                                
    
    
    public void confirmarReserva(Reserva reserva){
        
        String sql = "INSERT INTO reserva (idHabitacion,idHuesped,fechaInicio,fechaSalida,estado,precio)"
                + "VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, reserva.getHabitacion().getIdHabitacion());
            ps.setInt(2, reserva.getHuesped().getIdHuesped());
            ps.setDate(3, Date.valueOf(reserva.getFechaInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFechaSalida()));
            ps.setBoolean(5, true);
            ps.setDouble(6, reserva.getPrecio());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            habd.cambiarEstado(reserva.getHabitacion().getIdHabitacion(), true);
            if(rs.next()){
                reserva.setIdReserva(rs.getInt(1));
                
                
                JOptionPane.showMessageDialog(null, "Reserva Registrada");
            
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }

    }
    
    public List<Reserva> buscarReservaPorHuesped(int idHuesped){
        
        ArrayList<Reserva> reservas =new  ArrayList<>();
        
        String sql = "SELECT * FROM reserva WHERE idHuesped = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Reserva reserva = new Reserva();
            reserva.setIdReserva(rs.getInt("idReserva"));
            Huesped huesped = huesd.bucarHuesped(rs.getInt("idHuesped"));
            Habitacion habitacion = habd.buscarHabitacion(rs.getInt("idHabitacion"));
            reserva.setHuesped(huesped);
            reserva.setHabitacion(habitacion);
            reserva.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
            reserva.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
            reserva.setEstado(rs.getBoolean("estado"));
            reserva.setPrecio(rs.getDouble("precio"));
            
            
            reservas.add(reserva);
            
            
            
            }
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
    
    return reservas;
    
    
    
    
    }
    
    public Reserva buscarReserva(int idReserva){
        String sql = "SELECT idHabitacion, idHuesped, fechaInicio, fechaSalida,estado,precio FROM reserva WHERE idReserva = ?";
        Reserva reserva = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                reserva = new Reserva();
                
                reserva.setIdReserva(idReserva);
                Huesped huesped = huesd.bucarHuesped(rs.getInt("idHuesped"));
                Habitacion habitacion = habd.buscarHabitacionEstado(rs.getInt("idHabitacion"));
                reserva.setHabitacion(habitacion);
                reserva.setHuesped(huesped);
                reserva.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                reserva.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                reserva.setEstado(rs.getBoolean("estado"));
                reserva.setPrecio(rs.getDouble("precio"));
                
            
            }else {
                JOptionPane.showMessageDialog(null, "No existe la reserva");
            
            }
            ps.close();
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
        
            return reserva;
            }
    
    public void cancelarReserva(int idHuesped, int idHabitacion){
        String sql = "DELETE FROM reserva WHERE idHuesped = ? AND idHabitacion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);
            
             int filas= ps.executeUpdate();
             
             if(filas>0){
                JOptionPane.showMessageDialog(null, "Reserva cancelada");
                
                
            }
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
        
        
    
    
    }
    
    
    public void finReserva(Huesped huesped){
        String sql ="UPDATE reserva SET estado = 0 WHERE idHuesped = ?";
        
        

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped.getIdHuesped());
            

            int exito = ps.executeUpdate();

            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Fin reserva");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }
         
        
        
    
    
    }
                

    
        
   public void crearReserva(){
        
       LocalDate fechaEntrada;
       LocalDate fechaSalida;
       String fechaE;
       String fechaS;
        
        int cantidadPersonas=0;
        
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de personas: ");
        cantidadPersonas = sc.nextInt();
        
        System.out.println("Ingrese fecha de entrada: ");
        fechaE = sc.next();
        
        System.out.println("Ingrese fecha de salida:  ");
       fechaS = sc.next();
        
        fechaEntrada = LocalDate.parse(fechaE);
        
        fechaSalida = LocalDate.parse(fechaS);
       
   
        long dias =  ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        
        if (cantidadPersonas> 3 && cantidadPersonas < 5 ) { // id 1
            
            System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
            
            
            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(1)) {
            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
            System.out.println("piso " + habitacion.getPiso());
            System.out.println("estado " + habitacion.isEstado());
            System.out.println("categoria " + habitacion.getTipo_habitacion());
            
            }
            System.out.println();
            
            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(1).getTipo_habitacion().getPrecio();
            
            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
          
            
            
            
           
        }
      
    
    if (cantidadPersonas> 2 && cantidadPersonas < 4 ){ // id 2
         
          System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
          
           
            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(2)) {
            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
            System.out.println("piso " + habitacion.getPiso());
            System.out.println("estado " + habitacion.isEstado());
           System.out.println("categoria " + habitacion.getTipo_habitacion());
            
            }
            System.out.println();
            
            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(2).getTipo_habitacion().getPrecio();
            
            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );

           }   

    if (cantidadPersonas> 1 && cantidadPersonas < 3 ) { // id 3
            System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
          
          
            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(3)) {
            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
            System.out.println("piso " + habitacion.getPiso());
            System.out.println("estado " + habitacion.isEstado());
            System.out.println("categoria " + habitacion.getTipo_habitacion());
            
            }
            System.out.println();
            
            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(3).getTipo_habitacion().getPrecio();
            
            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
            
            
            
           
           }   
       
   if(cantidadPersonas> 0 && cantidadPersonas < 2 ){ //id 4
        System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
           
           
            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(4)) {
            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
            System.out.println("piso " + habitacion.getPiso());
            System.out.println("estado " + habitacion.isEstado());
            System.out.println("categoria " + habitacion.getTipo_habitacion());
            
            }
         System.out.println();
           
           double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(4).getTipo_habitacion().getPrecio();
           
           System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
  
   } 
  
  }

 
    
    
    
    }
    
    
    

