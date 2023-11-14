/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.entidades;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 4K
 */
public class Reserva {
    private int idReserva;
    private Habitacion habitacion;
    private Huesped huesped;
    private LocalDate fechaInicio;
    private LocalDate fechaSalida;
    private double precio;
    private boolean estado;
    
    
    
//    public void crearReserva(){
//        
//       LocalDate fechaEntrada;
//       LocalDate fechaSalida;
//       String fechaE;
//       String fechaS;
//        
//        int cantidadPersonas=0;
//        
//        
//        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingrese cantidad de personas: ");
//        cantidadPersonas = sc.nextInt();
//        
//        System.out.println("Ingrese fecha de entrada: ");
//        fechaE = sc.next();
//        
//        System.out.println("Ingrese fecha de salida:  ");
//        fechaS = sc.next();
//        
//        fechaEntrada = LocalDate.parse(fechaE);
//        
//        fechaSalida = LocalDate.parse(fechaS);
//       
//   
//        long dias =  ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
//        
//        if (cantidadPersonas> 3 && cantidadPersonas < 5 ) { // id 1
//            
//            System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
//            
//            
//            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(1)) {
//            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
//            System.out.println("piso " + habitacion.getPiso());
//            System.out.println("estado " + habitacion.isEstado());
//            System.out.println("categoria " + habitacion.getTipo_habitacion());
//            
//            }
//            System.out.println();
//            
//            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(1).getTipo_habitacion().getPrecio();
//            
//            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
//            
//            
//            
//            
//           
//        }
//      
//    
//     if (cantidadPersonas> 2 && cantidadPersonas < 4 ){ // id 2
//         
//           System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
//           
//           
//            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(2)) {
//            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
//            System.out.println("piso " + habitacion.getPiso());
//            System.out.println("estado " + habitacion.isEstado());
//            System.out.println("categoria " + habitacion.getTipo_habitacion());
//            
//            }
//            System.out.println();
//            
//            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(2).getTipo_habitacion().getPrecio();
//            
//            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
//
//           }   
//
//    if (cantidadPersonas> 1 && cantidadPersonas < 3 ) { // id 3
//            System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
//           
//           
//            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(3)) {
//            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
//            System.out.println("piso " + habitacion.getPiso());
//            System.out.println("estado " + habitacion.isEstado());
//            System.out.println("categoria " + habitacion.getTipo_habitacion());
//            
//            }
//            System.out.println();
//            
//            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(3).getTipo_habitacion().getPrecio();
//            
//            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
//            
//            
//            
//           
//           }   
//       
//   if(cantidadPersonas> 0 && cantidadPersonas < 2 ){ //id 4
//        System.out.println("Para la cantidad de personas ingresadas tenemos disponible: ");
//           
//           
//            for(Habitacion habitacion:habd.listarHabitacionPorCategoria(4)) {
//            System.out.println("idHabitacion " + habitacion.getIdHabitacion());
//            System.out.println("piso " + habitacion.getPiso());
//            System.out.println("estado " + habitacion.isEstado());
//            System.out.println("categoria " + habitacion.getTipo_habitacion());
//            
//            }
//            System.out.println();
//            
//            double montoEstadia = dias * (double) habd.buscarHabitacionPorTipo(4).getTipo_habitacion().getPrecio();
//            
//            System.out.println("El precio para la cantidad de dias ingresados es de: " + montoEstadia );
//   
//    } 
//   
//    }

    public Reserva() {
    }

    public Reserva(int idReserva, Habitacion habitacion, Huesped huesped, LocalDate fechaInicio, LocalDate fechaSalida, double precio, boolean estado) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
        this.estado = estado;
    }

    public Reserva(Habitacion habitacion, Huesped huesped, LocalDate fechaInicio, LocalDate fechaSalida, double precio, boolean estado) {
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.fechaInicio = fechaInicio;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
        this.estado = estado;
    }

    public Reserva(String idHabitacion_idHuesped_fechaInico_fecha_S) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", habitacion=" + habitacion + ", huesped=" + huesped + ", fechaInicio=" + fechaInicio + ", fechaSalida=" + fechaSalida + ", precio=" + precio + ", estado=" + estado + '}';
    }

    public LocalDate getFechaInicio(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getDni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
