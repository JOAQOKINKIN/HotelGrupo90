/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.accesoADatos;

import hotelgrupo90.entidades.Huesped;
import hotelgrupo90.entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 4K
 */
public class HuespedData {

    public static Reserva buscarHuesped(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        private Connection con = null;

    public HuespedData() {
        
        con = Conexion.getConexion();
    }

   

   
    public void guardadHuesped(Huesped huesped){
        String sql = "INSERT INTO huesped(apellido, nombre, dni, correo, celular, domicilio)"
                + "VALUES (?,?,?,?,?,?)";
        
        
            try {
                PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1,huesped.getApellido());
                ps.setString(2, huesped.getNombre());
                ps.setInt(3, huesped.getDni());
                ps.setString(4, huesped.getCorreo());
                ps.setInt(5, huesped.getCelular());
                ps.setString(6, huesped.getDomicilio());
                ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if(rs.next()){
                    huesped.setIdHuesped(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Huesped Guardado.");
                }
                
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            }

    }
    
    public void modificarHuesped(Huesped huesped){
        
        String sql = "UPDATE huesped SET apellido = ? , nombre = ?, dni = ?, correo = ?, celular = ?, domicilio = ?"
                + "WHERE idHuesped = ?";
        
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,huesped.getApellido());
                ps.setString(2, huesped.getNombre());
                ps.setInt(3, huesped.getDni());
                ps.setString(4, huesped.getCorreo());
                ps.setInt(5, huesped.getCelular());
                ps.setString(6, huesped.getDomicilio());
                ps.setInt(7, huesped.getIdHuesped());
                int exito = ps.executeUpdate();
                
                if(exito==1){
                    JOptionPane.showMessageDialog(null, "Huesped Modificado");
                    
                } 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            }

    }
    
    public void eliminarHuesped(int idHuesped){
        String sql = "DELETE FROM huesped WHERE idHuesped = ?";
        
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idHuesped);
                int filas= ps.executeUpdate();
                
                if(filas > 0){
                    JOptionPane.showMessageDialog(null, "Huesped Eliminado");
                }
                ps.close();
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            }
    
    }
    
    public Huesped buscarHuespedPorDni(int dni){
        String sql = "SELECT idHuesped,apellido,nombre, dni, correo, celular, domicilio FROM huesped WHERE dni = ?";
        Huesped huesped = null;
        
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, dni);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    huesped = new Huesped();
                    huesped.setIdHuesped(rs.getInt("idHuesped"));
                    huesped.setApellido(rs.getString("apellido"));
                    huesped.setNombre(rs.getString("nombre"));
                    huesped.setDni(rs.getInt("dni"));
                    huesped.setCorreo(rs.getString("correo"));
                    huesped.setCelular(rs.getInt("celular"));
                    huesped.setDomicilio(rs.getString("domicilio"));
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No existe el huesped");
                
                }
                ps.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            }
    return huesped;
    
    }
    public Huesped bucarHuesped(int idHuesped){
    
        String sql = "SELECT apellido,nombre, dni, correo, celular,domicilio FROM huesped WHERE idHuesped = ?";
        Huesped huesped = null;
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idHuesped);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    huesped = new Huesped();
                    huesped.setIdHuesped(idHuesped);
                    huesped.setApellido(rs.getString("apellido"));
                    huesped.setNombre(rs.getString("nombre"));
                    huesped.setDni(rs.getInt("dni"));
                    huesped.setCorreo(rs.getString("correo"));
                    huesped.setCelular(rs.getInt("celular"));
                    huesped.setDomicilio(rs.getString("domicilio"));
                
                }else{
                    JOptionPane.showMessageDialog(null, "No existe el huesped");
                }
                ps.close();
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            }
    return huesped;
    
    }
    
    
    
}
