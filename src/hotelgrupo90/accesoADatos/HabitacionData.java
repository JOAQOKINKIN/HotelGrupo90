/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.accesoADatos;

import hotelgrupo90.entidades.Habitacion;

import hotelgrupo90.entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class HabitacionData {
    
           private Connection con = null;

    public HabitacionData() {
        
        con = Conexion.getConexion();
    }
    public void guardarHabitacion(Habitacion habitacion){
    
        String sql ="INSERT INTO habitacion(piso, estado, categoria)"
                + "VALUES (?,?,?)";
        
               try {
                   PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                   ps.setInt(1, habitacion.getPiso());
                   ps.setBoolean(2, habitacion.isEstado());
                   ps.setInt(3, habitacion.getTipo_habitacion().getIDtipoDeHabitacion());
                   ps.executeUpdate();
                   
                   ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    
                    habitacion.setIdHabitacion(rs.getInt(1));
                    
                    JOptionPane.showMessageDialog(null, "Habitacion Guardada.");
                }
                
                ps.close();

                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }
        
    }
    
    public void modificarHabitacion(Habitacion habitacion){
        String sql = "UPDATE habitacion SET piso = ?, estado = ?, categoria = ? WHERE idHabitacion = ?";
        
               try {
                   PreparedStatement ps = con.prepareStatement(sql);
                   ps.setInt(1, habitacion.getPiso());
                   ps.setBoolean(2, habitacion.isEstado());
                   ps.setInt(3, habitacion.getTipo_habitacion().getIDtipoDeHabitacion());
                   
                   ps.setInt(4, habitacion.getIdHabitacion());
                   int bandera = ps.executeUpdate();
                   
                   if(bandera == 1){
                       JOptionPane.showMessageDialog(null, "Habitacion Modificada");
                   }
                   
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }

    }
    
    public void eliminarHabitacion(int idHabitacion){
              String sql ="DELETE FROM habitacion WHERE idHabitacion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int exito = ps.executeUpdate();
            
                if(exito==1){
                    JOptionPane.showMessageDialog(null, "Habitacion eliminada");
                }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }
        
    }
    
    public Habitacion buscarHabitacionPorTipo(int categoria ){
        String sql = "SELECT * FROM habitacion h JOIN categoria c ON (h.categoria= c.categoria) WHERE C.categoria = ?";
        Habitacion habitacion = null;
        TipoHabitacion tipoHabitacion = null;
        
               try {
                   PreparedStatement ps = con.prepareStatement(sql);
                   ps.setInt(1, categoria);
                   
                   ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        habitacion = new Habitacion(); 
                        tipoHabitacion = new TipoHabitacion();
                        habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                        habitacion.setPiso(rs.getInt("piso"));
                        habitacion.setEstado(rs.getBoolean("estado"));
                        
                        
                            tipoHabitacion.setIDtipoDeHabitacion(rs.getInt("categoria"));
                            tipoHabitacion.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                            tipoHabitacion.setCantidadCamas(rs.getInt("cantidadCamas"));
                            tipoHabitacion.setTipoCamas(rs.getString("tipoCamas"));
                            tipoHabitacion.setPrecio(rs.getDouble("precio"));
                
                
                             habitacion.setTipo_habitacion(tipoHabitacion);
                        
                        
                        
                        
                    
                    } else{
                        JOptionPane.showMessageDialog(null, "No existe la habitacion");
                    
                    }
                    
                    ps.close();
                     
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }
        
                return habitacion;
    }
    
        public List<Habitacion> listarHabitacionPorCategoria(int tipo){
        String sql = "SELECT * FROM habitacion h JOIN categoria c ON (h.categoria= c.categoria) WHERE C.categoria = ? AND estado = 0";
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        
        Habitacion habitacion = null;
        TipoHabitacion tipoHabitacion = null;
        
        try {
            
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tipo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                habitacion = new Habitacion(); 
                tipoHabitacion = new TipoHabitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setEstado(rs.getBoolean("estado"));
                
                tipoHabitacion.setIDtipoDeHabitacion(rs.getInt("categoria"));
                tipoHabitacion.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                tipoHabitacion.setCantidadCamas(rs.getInt("cantidadCamas"));
                tipoHabitacion.setTipoCamas(rs.getString("tipoCamas"));
                tipoHabitacion.setPrecio(rs.getDouble("precio"));
                
                
                habitacion.setTipo_habitacion(tipoHabitacion);
                habitaciones.add(habitacion);

            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
        }
        
            return habitaciones;
    }
        
        
        public Habitacion buscarHabitacion (int idHabitacion){
            
            
        String sql ="SELECT piso, categoria FROM habitacion WHERE idHabitacion = ? and estado = 0 ";
        
        Habitacion habitacion = null;
        
        TipoHabitacion tipoHabitacion = null;
        
               try {
                   PreparedStatement ps = con.prepareStatement(sql);
                   ps.setInt(1, idHabitacion);
                   ResultSet rs= ps.executeQuery();
                   if(rs.next()){
                       habitacion = new Habitacion();
                       tipoHabitacion = new TipoHabitacion();
                       habitacion.setIdHabitacion(idHabitacion);
                       habitacion.setPiso(rs.getInt("piso"));
                       
                       tipoHabitacion.setIDtipoDeHabitacion(rs.getInt("categoria"));
                       habitacion.setTipo_habitacion(tipoHabitacion);
                       
                    
                       
                   
                   }else{
                   JOptionPane.showMessageDialog(null, " Habitacion no disponible");
                   
                   }
                   ps.close();
                   
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }
        
        return habitacion;
        }
             public Habitacion buscarHabitacionEstado (int idHabitacion){
            
            
        String sql ="SELECT piso, categoria,estado FROM habitacion WHERE idHabitacion = ?  ";
        
        Habitacion habitacion = null;
        
        TipoHabitacion tipoHabitacion = null;
        
               try {
                   PreparedStatement ps = con.prepareStatement(sql);
                   ps.setInt(1, idHabitacion);
                   ResultSet rs= ps.executeQuery();
                   if(rs.next()){
                       habitacion = new Habitacion();
                       tipoHabitacion = new TipoHabitacion();
                       habitacion.setIdHabitacion(idHabitacion);
                       habitacion.setPiso(rs.getInt("piso"));
                       habitacion.setEstado(rs.getBoolean("estado"));
                       tipoHabitacion.setIDtipoDeHabitacion(rs.getInt("categoria"));
                       habitacion.setTipo_habitacion(tipoHabitacion);
                       
                    
                       
                   
                   }else{
                   JOptionPane.showMessageDialog(null, " Habitacion no disponible");
                   
                   }
                   ps.close();
                   
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }
        
        return habitacion;
        }
        
        
        
        
        
        
        
        
        
        public void cambiarPrecio(TipoHabitacion tipo, double precio){
        
        String sql = "UPDATE categoria SET precio = ? WHERE categoria = ?";
        

    
               try {
                   PreparedStatement ps = con.prepareStatement(sql);
                   ps.setDouble(1, precio);
                   ps.setInt(2, tipo.getIDtipoDeHabitacion());
                   ResultSet rs= ps.executeQuery();
                   JOptionPane.showMessageDialog(null, "Precio actualizado");
                   

                   
                   
                   
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }
        
                
                
                
        }
        
        public void cambiarEstado(int idHabitacion, boolean estado){
        
        String sql="UPDATE habitacion SET estado = ? WHERE idHabitacion = ?";
        
               try {
                   PreparedStatement ps = con.prepareStatement(sql);
                   
                   ps.setBoolean(1, estado);
                   ps.setInt(2, idHabitacion);
                   
                   ResultSet rs = ps.executeQuery();
                   
                   
                   
                   
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
               }
        
        
        }
        

        

        
        
        
        
        
        
        
        
        
        
        
        
        
//        public Habitacion buscarHabitacionPorTipo(int tipo){
//        //String sql ="SELECT idHabitacion, piso FROM habitacion WHERE estado = 0 AND categoria = ?";
//        //String sql = "SELECT idHabitacion, piso  FROM habitacion JOIN tipodehabitacion ON habitacion.tipoDeHabitacion "
////                + "= tipodehabitacion.idTipoDeHabitacion";
//           String sql = "SELECT idHabitacion, piso, cantidadPersonas,cantidadCamas,tipoCamas, precio  "
//                   + "FROM habitacion JOIN categoria ON habitacion.categoria = categoria.categoria "
//                   + "WHERE estado = 0 AND habitacion.categoria = ? ";
//                   
//            Habitacion habitacion = null;
//            TipoHabitacion tipohabitacion = null;
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, tipo);
//            
//            ResultSet rs = ps.executeQuery();
//                if(rs.next()){
//                    habitacion = new Habitacion();
//                    tipohabitacion = new TipoHabitacion(tipo);
//                    
//                    
//                   habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
//                   habitacion.setPiso(rs.getInt("piso"));
//                   
//                   tipohabitacion.setCantidadPersonas(rs.getInt("cantidadPersonas"));
// //                 
// 
////                   habitacion.getTipo_habitacion().setIDtipoDeHabitacion(tipo);
////                   habitacion.getTipo_habitacion().setCantidadPersonas(rs.getInt("cantidadPersonas"));
////                   habitacion.getTipo_habitacion().setCantidadCamas(rs.getInt("cantidadCamas"));
////                   habitacion.getTipo_habitacion().setTipoCamas(rs.getString("tipoCamas"));
////                   habitacion.getTipo_habitacion().setPrecio(rs.getDouble("precio"));
//                    
//                
//                }else{
//                    JOptionPane.showMessageDialog(null, "No existe la habitacion");
//                
//                }
//                ps.close();
//            
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion");
//        }
//        return habitacion;
//    }

    public Habitacion buscarHabitacionPorTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Habitacion listarHabitacionPorCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
        
        
    
    

    }
    
    
    
    
    

