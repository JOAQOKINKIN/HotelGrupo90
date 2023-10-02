/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.entidades;

/**
 *
 * @author 4K
 */
public class Huesped {
    private int idHuesped;
    private String nombre;
    private int dni;
    private String domicilio;
    private String correo;
    private int celular;

    public Huesped() {
    }

    public Huesped(int idHuesped, String nombre, int dni, String domicilio, String correo, int celular) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public Huesped(String nombre, int dni, String domicilio, String correo, int celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Huesped{" + "idHuesped=" + idHuesped + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", correo=" + correo + ", celular=" + celular + '}';
    }
    
    
    
    
}
