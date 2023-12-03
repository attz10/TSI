/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controladores.Conexion;
import Controladores.Servicio;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author atude
 */
public class jiFrame_modificarServicio extends javax.swing.JInternalFrame {

    /**
     * Creates new form jiFrame_modificarServicio
     */
    public jiFrame_modificarServicio() {
        initComponents();
        mostrarServicios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        txtPrecio = new javax.swing.JTextField();
        btnRellenar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Precio:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaServicios);

        btnRellenar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRellenar.setText("Rellenar Datos");
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("id: ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Tiempo de ejecucion(dias):");

        btnEditar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(224, 224, 224)))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed
    
    public void mostrarServicios(){
        try {
            //conecto a la DB y hago un query de select *
            String sql = "select * from servicios";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            ResultSet rs = Conexion.stm.executeQuery(sql);

            //añado las columnas a la tabla
            //DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("DEMORA (DIAS)");

            //añado los datos a las columnas
            Object [] fila = new Object[5];
            while(rs.next()){
                for(int i = 0; i<5;i++){
                    fila[i] = rs.getObject(i+1);
                    //modelo.addRow(fila);
                    //tabla.setModel(modelo);
                }
                modelo.addRow(fila);
                tablaServicios.setModel(modelo);
            }
            Conexion.desconectar();
        }
        //hubo un error
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        // TODO add your handling code here:
        //obtengo data
        String auxId = txtId.getText().trim();
        int id = 0;

        //erorres
        List<String> errores = new ArrayList<>();

        //valido data
        if (auxId.isEmpty()) {
            errores.add("- No deje el ID vacio");
        }
        //id numerico?
        try{
            id = Integer.parseInt(this.txtId.getText().trim());
        }
        catch(Exception ex) {
            errores.add("- Error, el ID debe ser númerico");
        }
        //hay errores?
        if (!errores.isEmpty()){
            //hay errores, creo mensaje de error
            String msgError = String.join("\n", errores);
            JOptionPane.showMessageDialog(null, msgError, "Error en rellenado de servicio", 2);
        }
        //no hay
        else {
            //hay datos para buscar
            try {
                Servicio servicio = new Servicio(id);
                servicio.existeServicio();
                //comprobarProducto(producto.getBorrado());

                if(Conexion.buscarServicio){
                    this.txtId.setText(String.valueOf(servicio.getId()));
                    this.txtTiempo.setText(String.valueOf(servicio.getTiempoEjecucion()));
                    this.txtNombre.setText(servicio.getNombre());
                    this.txtPrecio.setText(String.valueOf(servicio.getValor()));
                    this.txtDescripcion.setText(servicio.getDescripcion());
                }
                else{
                    JOptionPane.showMessageDialog(this,"servicio no existe","Buscar servicio",2);
                }
            }
            //error
            catch (Exception e) {
                //error
            }
        }
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        //obtengo datos
        String nombre = this.txtNombre.getText().trim();
        String descripcion = this.txtDescripcion.getText().trim();
        String auxPrecio = txtPrecio.getText().trim();
        String auxTiempo = txtTiempo.getText().trim();
        double precio = 0;
        int tiempo = 0;

        //erorres
        List<String> errores = new ArrayList<>();

        //valido data
        if (nombre.isEmpty() || descripcion.isEmpty() || auxPrecio.isEmpty() || auxTiempo.isEmpty()) {
            errores.add("- No deje campos vacios");
        }
        if (nombre.length() > 25) {
            errores.add("- El largo del nombre no debe ser mayor a 25");
        }
        /*if (tipo.length() > 20) {
            errores.add("- El largo del tipo no debe ser mayor a 20");
        }*/
        //datos numericos?
        try{
            precio = Double.parseDouble(this.txtPrecio.getText());
        }
        catch (Exception ex) {
            errores.add("- Error, el precio debe ser númerico");
        }
        try{
            tiempo = Integer.parseInt(this.txtTiempo.getText());
        }
        catch (Exception ex) {
            errores.add("- Error, la cantidad debe ser númerica");
        }
        //hay errores?
        if (!errores.isEmpty()) {
            //hay errores, creo mensaje de error
            String msgError = String.join("\n", errores);
            JOptionPane.showMessageDialog(null, msgError, "Error en insertado de servicio", 2);
        }
        //no hay
        else {
            try {
                int id = Integer.parseInt(this.txtId.getText().trim());
                Servicio servicio = new Servicio(id);
                servicio.existeServicio();
                //SI EXISTE, actualizo el registro
                if(Conexion.buscarServicio){
                    servicio.setNombre(nombre);
                    servicio.setValor(precio);
                    servicio.setTiempoEjecucion(tiempo);
                    servicio.setDescripcion(descripcion);
                    servicio.setId(id);
                    servicio.actualizarServicio();
                    //limpiar();
                    //mostrarProductos();
                }
                //NO EXISTE
                else{
                    JOptionPane.showMessageDialog(this,"Servicio no encontrado","Actualizar Servicio",1);
                }
            }
            //hay un error
            catch (Exception e) {
                //error
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRellenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaServicios;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
