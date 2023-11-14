/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasFinalesNO;

import hotelgrupo90.accesoADatos.Conexion;
import hotelgrupo90.accesoADatos.HabitacionData;
import hotelgrupo90.accesoADatos.HuespedData;
import hotelgrupo90.accesoADatos.ReservaData;
import hotelgrupo90.entidades.Habitacion;
import hotelgrupo90.entidades.Huesped;
import hotelgrupo90.entidades.Reserva;
import hotelgrupo90.entidades.TipoHabitacion;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalQueries.zoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class MenuConfirmacion extends javax.swing.JInternalFrame {
private ReservaData reservaData = new ReservaData();
private HuespedData  huespedData = new HuespedData();
private  Reserva  reserva= null;
private TipoHabitacion tipoHa = null;

private  HabitacionData habitacionData = new HabitacionData();
    private  Habitacion habitacionActual=null;
    private Habitacion habitacion= null;
    private Huesped huespedActual = null;
 //private final LocalDate localDate = new LocalDate();
        
    
    public MenuConfirmacion() {
        
       // this.<> = new LocalDate();
        initComponents();
       
        Conexion.getConexion();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/Recursos/sombra1.png"));
        Image miImage = icono.getImage();
        Escritorio4 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(miImage,0,0,getWidth(),getHeight(),this);
            }};
            jLabel8 = new javax.swing.JLabel();
            jLabel1Huesped = new javax.swing.JLabel();
            jLabel2Habitacion = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jDateChooser1Entrada = new com.toedter.calendar.JDateChooser();
            jDateChooser2Salida = new com.toedter.calendar.JDateChooser();
            jButton1Salir = new javax.swing.JButton();
            jTextField2Habitacion = new javax.swing.JTextField();
            jTextField4Categoria = new javax.swing.JTextField();
            jButton1Confirmar = new javax.swing.JButton();
            jButton2Cancelar = new javax.swing.JButton();
            jLabel1Estado = new javax.swing.JLabel();
            jRadioButton1Estado = new javax.swing.JRadioButton();
            jTextField1Hues = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jTextField1IdBus = new javax.swing.JTextField();
            jButton2IdB = new javax.swing.JButton();
            jTextField1idHabi = new javax.swing.JTextField();
            jTextIDReserva = new javax.swing.JTextField();
            jButton2 = new javax.swing.JButton();

            Escritorio4.setBackground(new java.awt.Color(255, 255, 255));
            Escritorio4.setMaximumSize(new java.awt.Dimension(500, 500));
            Escritorio4.setMinimumSize(new java.awt.Dimension(500, 500));

            jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 255));
            jLabel8.setText("Confirmar Reserva");

            jLabel1Huesped.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel1Huesped.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1Huesped.setText("Huesped:");

            jLabel2Habitacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel2Habitacion.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2Habitacion.setText("Habitacion:");

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Entrada:");

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Salida:");

            jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setText("Categoria");

            jButton1Salir.setText("Salir");
            jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1SalirActionPerformed(evt);
                }
            });

            jTextField4Categoria.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField4CategoriaActionPerformed(evt);
                }
            });

            jButton1Confirmar.setText("Confirmar Reserva");
            jButton1Confirmar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ConfirmarActionPerformed(evt);
                }
            });

            jButton2Cancelar.setText("Cancelar Reserva");
            jButton2Cancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2CancelarActionPerformed(evt);
                }
            });

            jLabel1Estado.setText("Estado:");

            jButton1.setText("Buscar");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2IdB.setText("Buscar Hab");
            jButton2IdB.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2IdBActionPerformed(evt);
                }
            });

            jButton2.setText("Buscar Reserva(ID)");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            Escritorio4.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jLabel1Huesped, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jLabel2Habitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jDateChooser1Entrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jDateChooser2Salida, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jButton1Salir, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jTextField2Habitacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jTextField4Categoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jButton1Confirmar, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jButton2Cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jLabel1Estado, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jRadioButton1Estado, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jTextField1Hues, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jTextField1IdBus, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jButton2IdB, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jTextField1idHabi, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jTextIDReserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Escritorio4.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout Escritorio4Layout = new javax.swing.GroupLayout(Escritorio4);
            Escritorio4.setLayout(Escritorio4Layout);
            Escritorio4Layout.setHorizontalGroup(
                Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Escritorio4Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel1Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton1Estado)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1Salir)
                    .addGap(32, 32, 32))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Escritorio4Layout.createSequentialGroup()
                    .addGap(57, 137, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(120, 120, 120))
                .addGroup(Escritorio4Layout.createSequentialGroup()
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Escritorio4Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1Huesped)
                                .addComponent(jLabel2Habitacion)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Escritorio4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2)))
                    .addGap(18, 18, 18)
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField4Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(jDateChooser1Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jDateChooser2Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jTextField2Habitacion)
                        .addComponent(jTextField1Hues)
                        .addComponent(jTextIDReserva))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2Cancelar)
                        .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Escritorio4Layout.createSequentialGroup()
                                    .addComponent(jTextField1IdBus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1))
                                .addGroup(Escritorio4Layout.createSequentialGroup()
                                    .addComponent(jTextField1idHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2IdB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1Confirmar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addContainerGap())
            );
            Escritorio4Layout.setVerticalGroup(
                Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Escritorio4Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel8)
                    .addGap(23, 23, 23)
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextIDReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addGap(41, 41, 41)
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Escritorio4Layout.createSequentialGroup()
                            .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1Huesped)
                                .addComponent(jTextField1Hues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addComponent(jTextField1IdBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2Habitacion)
                                .addComponent(jTextField2Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2IdB)
                                .addComponent(jTextField1idHabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Escritorio4Layout.createSequentialGroup()
                                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(40, 40, 40)
                                    .addComponent(jDateChooser1Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1Confirmar)))
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser2Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Escritorio4Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(3, 3, 3)
                    .addComponent(jButton2Cancelar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                    .addGroup(Escritorio4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1Estado))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                    .addComponent(jButton1Salir)
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Escritorio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Escritorio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
dispose();    
  
      
    }//GEN-LAST:event_jButton1SalirActionPerformed

    private void jTextField4CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4CategoriaActionPerformed

    private void jButton1ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConfirmarActionPerformed
            try{
                Huesped huespedActual = huespedData.bucarHuesped(Integer.parseInt(jTextField1IdBus.getText()));
                Habitacion HabitacionActual = habitacionData.buscarHabitacion(Integer.parseInt(jTextField1idHabi.getText()));
                
                
               java.util.Date entrada = jDateChooser1Entrada.getDate();
               LocalDate llegada = entrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
               java.util.Date salida = jDateChooser2Salida.getDate();
               LocalDate finalizada = salida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
               boolean estado = jRadioButton1Estado.isSelected();
               long dias = ChronoUnit.DAYS.between(llegada, finalizada);
               double precio =0;
               if(Integer.parseInt(jTextField4Categoria.getText())==1){
                   precio =800;
               }else if(Integer.parseInt(jTextField4Categoria.getText())==2){
                   precio = 700;
               } else if(Integer.parseInt(jTextField4Categoria.getText())==3){
                   precio =500;
               } else if (Integer.parseInt(jTextField4Categoria.getText())==4){
                   precio = 300;
               }
               
               double precioF = dias * precio;
             
               
               if(reserva==null){
                  reserva = new Reserva(HabitacionActual, huespedActual, llegada, finalizada, precioF, estado);
                  reservaData.confirmarReserva(reserva);
               }
               
            
            } catch(Exception e){
             
            }
        
        
    }//GEN-LAST:event_jButton1ConfirmarActionPerformed

    private void jButton2CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CancelarActionPerformed

        if(reserva!=null){

            reservaData.cancelarReserva(reserva.getHuesped().getIdHuesped(), reserva.getHabitacion().getIdHabitacion());
            

            reserva=null;

            limpiarCampos();

        }else{

            JOptionPane.showMessageDialog(this,"no hay reserva seleccionada");
}
    

                


       
    }//GEN-LAST:event_jButton2CancelarActionPerformed

       private void limpiarCampos(){
      
        
       jTextField1Hues.setText("");
       jTextField2Habitacion.setText("");
       jTextField4Categoria.setText("");
       jRadioButton1Estado.setSelected(false);
       jDateChooser1Entrada.setDateFormatString("");
       jDateChooser2Salida.setDateFormatString("");
      
      
      
    } 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
       Integer id =Integer.parseInt(jTextField1IdBus.getText()) ;
       huespedActual = huespedData.bucarHuesped(id);
        //Integer dni = Integer.parseInt(jTextField3TextoDni.getText());
        //huespedActual= huespedData.buscarHuespedPorDni(dni);
       
        if (huespedActual!=null){
    
     
      jTextField1Hues.setText(String.valueOf(huespedActual.getDni()));
     
    
       // jTextField3Anio.setText(mat(huesped.getCelular());
        }
     } catch (NumberFormatException ex ) {
         JOptionPane.showConfirmDialog(this, "Debe ingresar numeros correctos");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2IdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2IdBActionPerformed
     
      try {
            Integer id = Integer.parseInt(jTextField1idHabi.getText());
            habitacionActual= habitacionData.buscarHabitacion(id);
            
            if (habitacionActual!=null) {
                
        jTextField2Habitacion.setText(String.valueOf(habitacionActual.getPiso()));
        
        jRadioButton1Estado.setSelected(habitacionActual.isEstado());
        
        jTextField4Categoria.setText(String.valueOf(habitacionActual.getTipo_habitacion().getIDtipoDeHabitacion()));
      
                
                
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showConfirmDialog(null, "Debe ingresar un numero valido");
        }
  
  /*  try {
             
            Integer id = Integer.parseInt(jTextField1idHabi.getText());
            
            //String tipo = jTextField1Categoria.toString();
             //habitacion= habitacionData.buscarHabitacionPorTipo();
             habitacionActual = habitacionData.buscarHabitacion(id);
             
           //  int habitacion= jComboBox1.getSelectedIndex();
           
             if (habitacionActual!=null) {

    jTextField2Habitacion.setText(String.valueOf(habitacionActual.getPiso()));
       
    jTextField4Categoria.setText(String.valueOf(habitacionActual.getTipo_habitacion())); 
      
     jRadioButton1Estado.setSelected(habitacionActual.isEstado());
     
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showConfirmDialog(null, "Debe ingresar datos validos");
        }  */
    }//GEN-LAST:event_jButton2IdBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        try {
            Integer idReserva = Integer.parseInt(jTextIDReserva.getText());
            reserva = reservaData.buscarReserva(idReserva);
            jTextField1Hues.setText(String.valueOf(reserva.getHuesped().getDni()));
            jTextField2Habitacion.setText(String.valueOf(reserva.getHabitacion().getIdHabitacion()));
            jTextField4Categoria.setText(String.valueOf(reserva.getHabitacion().getTipo_habitacion().getIDtipoDeHabitacion()));
            jRadioButton1Estado.setSelected(reserva.isEstado());
            
            LocalDate entrada = reserva.getFechaInicio();
            java.util.Date date= java.util.Date.from(entrada.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDateChooser1Entrada.setDate(date);
            
            LocalDate salida = reserva.getFechaSalida();
            java.util.Date datee= java.util.Date.from(salida.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDateChooser2Salida.setDate(datee);
            
            
            
            
            
            
            
            
            
            
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Confirmar;
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2Cancelar;
    private javax.swing.JButton jButton2IdB;
    private com.toedter.calendar.JDateChooser jDateChooser1Entrada;
    private com.toedter.calendar.JDateChooser jDateChooser2Salida;
    private javax.swing.JLabel jLabel1Estado;
    private javax.swing.JLabel jLabel1Huesped;
    private javax.swing.JLabel jLabel2Habitacion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1Estado;
    private javax.swing.JTextField jTextField1Hues;
    private javax.swing.JTextField jTextField1IdBus;
    private javax.swing.JTextField jTextField1idHabi;
    private javax.swing.JTextField jTextField2Habitacion;
    private javax.swing.JTextField jTextField4Categoria;
    private javax.swing.JTextField jTextIDReserva;
    // End of variables declaration//GEN-END:variables

    private static class zoneId {

        private static ZoneId systemDefault() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public zoneId() {
        }
    }

    

  
}
