/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.entidades;

/**
 *
 * @author 4K
 */
public class Habitacion {
    private int idHabitacion;
    private int piso;
    private boolean estado;
    private TipoHabitacion tipo_habitacion;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int piso, boolean estado, TipoHabitacion tipo_habitacion) {
        this.idHabitacion = idHabitacion;
        this.piso = piso;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

    public Habitacion(int piso, boolean estado, TipoHabitacion tipo_habitacion) {
        this.piso = piso;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TipoHabitacion getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(TipoHabitacion tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", piso=" + piso + ", estado=" + estado + ", tipo_habitacion=" + tipo_habitacion + '}';
    }
    
    
    
}
