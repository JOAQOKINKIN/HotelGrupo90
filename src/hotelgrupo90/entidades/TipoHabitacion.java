/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelgrupo90.entidades;

import java.util.Scanner;



/**
 *
 * @author 4K
 */
public class TipoHabitacion {
    
    private int IDtipoDeHabitacion;
    private int cantidadPersonas;
    private int cantidadCamas;
    private double precio;
    private String tipoCamas;
    
    

    public TipoHabitacion() {
    }

    public TipoHabitacion(int IDtipoDeHabitacion) {
        this.IDtipoDeHabitacion = IDtipoDeHabitacion;
    }
    

    public TipoHabitacion(int IDtipoDeHabitacion, int cantidadPersonas, int cantidadCamas, double precio, String tipoCamas) {
        this.IDtipoDeHabitacion = IDtipoDeHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.precio = precio;
        this.tipoCamas = tipoCamas;
        
    }

    public TipoHabitacion(int cantidadPersonas, int cantidadCamas, double precio, String tipoCamas) {
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadCamas = cantidadCamas;
        this.precio = precio;
        this.tipoCamas = tipoCamas;
        
    }

 

  

   

    public int getIDtipoDeHabitacion() {
        return IDtipoDeHabitacion;
    }

    public void setIDtipoDeHabitacion(int IDtipoDeHabitacion) {
        this.IDtipoDeHabitacion = IDtipoDeHabitacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(String tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "IDtipoDeHabitacion=" + IDtipoDeHabitacion + ", cantidadPersonas=" + cantidadPersonas + ", cantidadCamas=" + cantidadCamas + ", precio=" + precio + ", tipoCamas=" + tipoCamas + '}';
    }
    
    public void cambiarPrecio(TipoHabitacion tdh){
       Scanner sc = new Scanner(System.in);
        System.out.println("El precio actual es de: " + tdh.getPrecio());
        double precioNuevo =0;
        System.out.println("Ingrese nuevo precio: " );
        precioNuevo = sc.nextInt();
        
        tdh.setPrecio(precioNuevo);
        
        System.out.println("El nuevo precio es de " + tdh.getPrecio());
    
    }
    
    
    
    
    
    
    
}
