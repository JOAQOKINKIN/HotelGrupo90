/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasFinalesNO;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import hotelgrupo90.accesoADatos.Conexion;
import hotelgrupo90.accesoADatos.HabitacionData;
import hotelgrupo90.entidades.Habitacion;
import hotelgrupo90.entidades.Reserva;
import hotelgrupo90.entidades.TipoHabitacion;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class MenuHabitacion extends javax.swing.JInternalFrame {
       /*private  ArrayList<Reserva> ListaA;
       private ArrayList <TipoHabitacion> ListaB;
       
       private HabitacionData Habitacion;
      
       private DefaultTableModel modelo; */
       
     private  HabitacionData habitacionData = new HabitacionData();
    private  Habitacion habitacionActual=null;
    private  TipoHabitacion Th = null;
   
   // private  ArrayList<Habitacion> habitaciones = new ArrayList<>();
  
    
    public MenuHabitacion() {
        initComponents();
         habitacionData = new HabitacionData();
       Conexion.getConexion();
       //armarCabeceraTabla(); 
((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ImageIcon icono=new ImageIcon(getClass().getResource("/Recursos/sombra3.png"));
        Image miImage = icono.getImage();
        Escritorio1 = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(miImage,0,0,getWidth(),getHeight(),this);
            }};
            jLabel2 = new javax.swing.JLabel();
            jLabel3Piso = new javax.swing.JLabel();
            jLabel4Categoria = new javax.swing.JLabel();
            jLabel5Estado = new javax.swing.JLabel();
            jRadioButton1TipoEstado = new javax.swing.JRadioButton();
            jButton1Buscar1 = new javax.swing.JButton();
            jButton2Modificar = new javax.swing.JButton();
            jButton3Eliminar = new javax.swing.JButton();
            jButton4Guardar = new javax.swing.JButton();
            jButton5Salir = new javax.swing.JButton();
            jTextField1Piso = new javax.swing.JTextField();
            jTextField1IdBuscar = new javax.swing.JTextField();
            jTextField1Categoria = new javax.swing.JTextField();

            jLabel1.setText("jLabel1");

            Escritorio1.setBackground(new java.awt.Color(255, 255, 255));
            Escritorio1.setMaximumSize(new java.awt.Dimension(500, 500));
            Escritorio1.setMinimumSize(new java.awt.Dimension(500, 500));
            Escritorio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Registro de Habitación");
            Escritorio1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 11, -1, -1));

            jLabel3Piso.setBackground(new java.awt.Color(51, 255, 51));
            jLabel3Piso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel3Piso.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3Piso.setText("Piso:");
            Escritorio1.add(jLabel3Piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 110, -1, -1));

            jLabel4Categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel4Categoria.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4Categoria.setText("Categoría:");
            Escritorio1.add(jLabel4Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 220, -1, -1));

            jLabel5Estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel5Estado.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5Estado.setText("Estado:");
            Escritorio1.add(jLabel5Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 160, -1, -1));

            jRadioButton1TipoEstado.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jRadioButton1TipoEstadoActionPerformed(evt);
                }
            });
            Escritorio1.add(jRadioButton1TipoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 160, -1, -1));

            jButton1Buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
            jButton1Buscar1.setText("Buscar");
            jButton1Buscar1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1Buscar1ActionPerformed(evt);
                }
            });
            Escritorio1.add(jButton1Buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 108, -1, -1));

            jButton2Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editar (1).png"))); // NOI18N
            jButton2Modificar.setText("Nuevo");
            jButton2Modificar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ModificarActionPerformed(evt);
                }
            });
            Escritorio1.add(jButton2Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 445, -1, -1));

            jButton3Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/circulo-marca-x (1).png"))); // NOI18N
            jButton3Eliminar.setText("Eliminar");
            jButton3Eliminar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3EliminarActionPerformed(evt);
                }
            });
            Escritorio1.add(jButton3Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 445, -1, -1));

            jButton4Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/disco-flexible.png"))); // NOI18N
            jButton4Guardar.setText("Guardar");
            jButton4Guardar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4GuardarActionPerformed(evt);
                }
            });
            Escritorio1.add(jButton4Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 445, -1, -1));

            jButton5Salir.setText("Salir");
            jButton5Salir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5SalirActionPerformed(evt);
                }
            });
            Escritorio1.add(jButton5Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 445, -1, -1));
            Escritorio1.add(jTextField1Piso, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 110, 56, -1));
            Escritorio1.add(jTextField1IdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 110, 44, -1));
            Escritorio1.add(jTextField1Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 50, -1));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Escritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Escritorio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1TipoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1TipoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1TipoEstadoActionPerformed

    private void jButton5SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5SalirActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5SalirActionPerformed

    private void jButton1Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Buscar1ActionPerformed
        
        
         
        try {
             
            Integer id = Integer.parseInt(jTextField1IdBuscar.getText());
            
           
            //habitacionActual= habitacionData.buscarHabitacionPorTipo();
             habitacionActual = habitacionData.buscarHabitacion(id);
             
         
             if (habitacionActual!=null) {
                
                 
         
        jTextField1Categoria.setText(String.valueOf(habitacionActual.getTipo_habitacion().getIDtipoDeHabitacion()));
        jTextField1Piso.setText(String.valueOf(habitacionActual.getPiso()));
        jRadioButton1TipoEstado.setSelected(habitacionActual.isEstado());
      
      
      
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar datos validoss");
        }
        
    }//GEN-LAST:event_jButton1Buscar1ActionPerformed

    private void jButton4GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4GuardarActionPerformed
           
        
        int piso = Integer.parseInt(jTextField1Piso.getText());
        boolean estado = jRadioButton1TipoEstado.isSelected();
        TipoHabitacion Th = new TipoHabitacion(Integer.parseInt(jTextField1Categoria.getText()));
        
        if(habitacionActual== null){
        
            habitacionActual = new Habitacion(piso, estado, Th);
            
            habitacionData.guardarHabitacion(habitacionActual);
            
        }else{
            habitacionActual.setPiso(piso);
            
            habitacionActual.setTipo_habitacion(Th);
            habitacionActual.setEstado(estado);
            
            habitacionData.modificarHabitacion(habitacionActual);
        }
            
      
        
        
        
        
        
        
                
       
        
         
    }//GEN-LAST:event_jButton4GuardarActionPerformed
    
    private void jButton3EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3EliminarActionPerformed
     
        if(habitacionActual!=null){


            habitacionData.eliminarHabitacion(habitacionActual.getIdHabitacion());

            habitacionActual=null;

            limpiarCampos();

        }else{

            JOptionPane.showMessageDialog(this,"no hay Habitacion seleccionado");
}



        // TODO add your handling code here:
    }                                                

    private void limpiarCampos(){
      
        
       jTextField1Piso.setText("");
       jRadioButton1TipoEstado.setSelected(false);
       jTextField1Categoria.setText("");
      
      
      
    }//GEN-LAST:event_jButton3EliminarActionPerformed

    private void jButton2ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ModificarActionPerformed
      limpiarCampos();
    habitacionActual= null;
    }//GEN-LAST:event_jButton2ModificarActionPerformed
   /*private void armarCabeceraTabla(){
        
        ArrayList<Object> fila = new ArrayList<>();
        fila.add("id");
        fila.add("Cantidad de Personas");
        fila.add("cantidad de camas");
        fila.add("Tipo de Cama");
        fila.add("Precio");
        
        for (Object it: fila){
         modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
        
 
 }
    private void BorrarFila(){
      int indice = modelo.getRowCount() -1;
      
      for (int i = indice;i>= 0;i --){
          
          modelo.removeRow(i);
      }
        
    }-*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio1;
    private javax.swing.JButton jButton1Buscar1;
    private javax.swing.JButton jButton2Modificar;
    private javax.swing.JButton jButton3Eliminar;
    private javax.swing.JButton jButton4Guardar;
    private javax.swing.JButton jButton5Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3Piso;
    private javax.swing.JLabel jLabel4Categoria;
    private javax.swing.JLabel jLabel5Estado;
    private javax.swing.JRadioButton jRadioButton1TipoEstado;
    private javax.swing.JTextField jTextField1Categoria;
    private javax.swing.JTextField jTextField1IdBuscar;
    private javax.swing.JTextField jTextField1Piso;
    // End of variables declaration//GEN-END:variables
}
