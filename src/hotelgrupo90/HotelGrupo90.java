/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelgrupo90;

import hotelgrupo90.accesoADatos.Conexion;
import hotelgrupo90.accesoADatos.HabitacionData;
import hotelgrupo90.accesoADatos.HuespedData;
import hotelgrupo90.accesoADatos.ReservaData;
import hotelgrupo90.entidades.Habitacion;
import hotelgrupo90.entidades.Huesped;
import hotelgrupo90.entidades.Reserva;
import hotelgrupo90.entidades.TipoHabitacion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author 4K
 */
public class HotelGrupo90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Huesped enz = new Huesped("Molina", "Cacho", 55165423, "Calle San Martin 122", "Cachito123@gmail.com", 267875612);
       
       HuespedData hue = new HuespedData();
       HabitacionData hd = new HabitacionData();
       ReservaData rd = new ReservaData();
       
       
       
       
       
       
//       hd.cambiarEstado(9, false);
       
//       TipoHabitacion suiteDeLujo = new TipoHabitacion(1); //id 1
//       
//       hd.cambiarPrecio(suiteDeLujo, 800);

//Reserva reserva = rd.buscarReserva(6);
//        System.out.println("" + reserva.getHabitacion());
//        System.out.println(" " + reserva.getHuesped());
//        System.out.println(" " + reserva.getFechaInicio());
//        System.out.println(" " + reserva.getFechaSalida());
//        System.out.println(" " + reserva.getPrecio());
//       
       
//        rd.cancelarReserva(1, 1);



       
       
       
       
       
       
//       
//  for(Reserva reservaE : rd.buscarReservaPorHuesped(1)){
//      System.out.println("Habitacion " + reservaE.getHabitacion());
//      System.out.println("Huesped " + reservaE.getHuesped());
//      System.out.println("Fecha Inicio " + reservaE.getFechaInicio());
//      System.out.println("PRECIO " + reservaE.getPrecio());
//  }
       
       
//       Habitacion habitacionEncontrada = hd.buscarHabitacion(3);
//        System.out.println("piso" + habitacionEncontrada.getPiso());
//        System.out.println("categoria " + habitacionEncontrada.getTipo_habitacion());
//        System.out.println("estado " + habitacionEncontrada.isEstado());

//        Huesped huespedEncontrado = hue.bucarHuesped(4);
//        System.out.println("apellido " + huespedEncontrado.getApellido());
//        System.out.println("nombre " + huespedEncontrado.getNombre());
//        System.out.println("dni " + huespedEncontrado.getDni());
//        System.out.println("celular " + huespedEncontrado.getCelular());
//        System.out.println("domicilio " + huespedEncontrado.getDomicilio());
//        System.out.println("correo " + huespedEncontrado.getCorreo());
//       TipoHabitacion suiteDeLujo = new TipoHabitacion(1);
//       
//       Habitacion hh = new Habitacion(15,1, false, suiteDeLujo);
       
//       Huesped jj = new Huesped("Videla", "Pepo", 21325652, "Calle siempre viva 426", "  ", 254551541);

//        Habitacion habitacionEnc = hd.buscarHabitacionPorTipo(1);
//       
//        Huesped huespedEnc = hue.buscarHuespedPorDni(31576831);
//       
//       Reserva rs = new Reserva(habitacionEnc, huespedEnc, LocalDate.of(2022, Month.JULY, 15), LocalDate.of(2023, Month.JULY, 20), 4500, true);
//       
//       
//       rd.confirmarReserva(rs);

        hd.cambiarEstado(1, false);
       
       
//       Habitacion habitacionEnco = hd.buscarHabitacion(9);
//       
       Huesped huespedEnc = hue.bucarHuesped(4);
//       
//       Reserva rs = new Reserva(habitacionEnco, huespedEnc, LocalDate.of(2022, Month.DECEMBER, 15), LocalDate.of(2023, Month.DECEMBER, 25), 4500, true);
//       
//       
//       rd.confirmarReserva(rs);
//       
//    

        rd.finReserva(huespedEnc);
        
       
       //hue.guardadHuesped(enz);
       
      // hue.modificarHuesped(enz);
      //hue.eliminarHuesped(5);
     
     
    
 // TipoHabitacion suiteDeLujo = new TipoHabitacion(1); //id 1
  //   TipoHabitacion triple = new TipoHabitacion(2);//id 2
  //   TipoHabitacion doble = new TipoHabitacion(3);//id 3
    // TipoHabitacion estandarSimple = new TipoHabitacion(4);//id 4
//     
//     
//          
//     
    //Habitacion habi = new Habitacion(4, false, estandarSimple);  
    
    //hd.guardarHabitacion(habi);
     // hd.modificarHabitacion(habi);
    // hd.eliminarHabitacion(9);
  //  hd.listarHabitacionPorTipo(2);
//    // habi.cambiarPrecio(habi.getTipo_habitacion());
//     
//    HabitacionData hd = new HabitacionData();
//    ReservaData rd = new ReservaData();
//    
//    
    // rd.crearReserva(3);
//       for(Habitacion habitacion : hd.listarHabitacionPorTipo(3)){
//           System.out.println("id Habitacion " + habitacion.getIdHabitacion());
//           System.out.println("piso " + habitacion.getPiso());
//          System.out.println("estado " + habitacion.isEstado());
//       }
//       
//       
//           
//       
//       }
     
     //hd.guardarHabitacion(habi);
    // hd.modificarHabitacion(habi);
    //hd.eliminarHabitacion(15);
    
 //hd.buscarHabitacion(2);
       //Materia materiaEncontrada = mat.buscarMateria(2);
       // System.out.println("nombre " + materiaEncontrada.getNombre());
       // System.out.println("año " + materiaEncontrada.getAnioMateria());
       
//       Habitacion habitacionEncontrada = hd.buscarHabitacionPorTipo(3);
//        System.out.println("id " + habitacionEncontrada.getIdHabitacion());
//        System.out.println("piso " + habitacionEncontrada.getPiso());
//        System.out.println("cantidad personas " + habitacionEncontrada.getTipo_habitacion().getCantidadPersonas());
//        System.out.println("cantidad camas " + habitacionEncontrada.getTipo_habitacion().getCantidadCamas());
//        System.out.println("tipo camas " + habitacionEncontrada.getTipo_habitacion().getTipoCamas());
//        System.out.println("Precio " + habitacionEncontrada.getTipo_habitacion().getPrecio());
//        
        
//        Huesped HuespedEncontrado = hue.buscarHuespedPorDni(30476831);
//        System.out.println("Nombre " + HuespedEncontrado.getNombre());
//        System.out.println("Apellido " + HuespedEncontrado.getApellido());
////        
//        
//

//Habitacion habitacionEncontrada = hd.buscarHabitacionPorTipo(4);
//        System.out.println("Id "+ habitacionEncontrada.getIdHabitacion());
//        System.out.println("piso " + habitacionEncontrada.getPiso());
//        System.out.println("estado " + habitacionEncontrada.isEstado());
//        System.out.println("categoria " + habitacionEncontrada.getTipo_habitacion());
        

        
        

//for(Habitacion habitacion:hd.listarHabitacionPorCategoria(4)) {
//    System.out.println("idHabitacion " + habitacion.getIdHabitacion());
//    System.out.println("piso " + habitacion.getPiso());
//    System.out.println("estado " + habitacion.isEstado());
//    System.out.println("categoria " + habitacion.getTipo_habitacion());
//    
//}

//rd.crearReserva(LocalDate.of(2020, Month.MARCH, 8), LocalDate.of(2020, Month.MARCH, 20), 1);

    






}

 
}
