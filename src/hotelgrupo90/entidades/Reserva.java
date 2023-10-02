/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.entidades;

import java.time.LocalDate;

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
    
    
    
}
