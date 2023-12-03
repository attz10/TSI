/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Controladores.Conexion;
import Controladores.Producto;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author atude
 */
public class jiFrame_borrarProducto extends javax.swing.JInternalFrame {
    /**
     * Creates new form jiFrame_borrarProducto
     */
    public jiFrame_borrarProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDatos = new javax.swing.JButton();
        btnRellenar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtTipo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtComentario = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();

        btnDatos.setText("Actualizar datos");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        btnRellenar.setText("Rellenar Datos");
        btnRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRellenarActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel1.setText("INGRESE ID DE PRODUCTO:");

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txtMarca))
                .addGap(239, 239, 239))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(262, 262, 262)
                            .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(txtCantidad)
                                        .addComponent(txtNombre))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(245, 245, 245))
                                .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDatos)
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnRellenar))
                    .addGap(18, 18, 18)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrar)
                        .addComponent(btnEditar))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        try {
            //conecto a la DB y hago un query de select *
            String sql = "select * from productos";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            ResultSet rs = Conexion.stm.executeQuery(sql);

            //añado las columnas a la tabla
            //DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("CANTIDAD");
            modelo.addColumn("PRECIO_UNITARIO");
            modelo.addColumn("TIPO");
            modelo.addColumn("MARCA");

            //añado los datos a las columnas
            Object [] fila = new Object[6];
            while(rs.next()){
                for(int i = 0; i<6;i++){
                    fila[i] = rs.getObject(i+1);
                    //modelo.addRow(fila);
                    //tabla.setModel(modelo);
                }
                modelo.addRow(fila);
                tablaProductos.setModel(modelo);
            }
            Conexion.desconectar();
        }
        //hubo un error
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDatosActionPerformed

    private void btnRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRellenarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(this.txtId.getText().trim());

        //hay datos para buscar
        try {

            Producto producto = new Producto(id);
            producto.existeProducto();

            if(Conexion.buscarProducto){
                this.txtId.setText(String.valueOf(producto.getId()));
                this.txtCantidad.setText(String.valueOf(producto.getCantidad()));
                this.txtNombre.setText(producto.getNombre());
                this.txtPrecio.setText(String.valueOf(producto.getCostoUnitario()));
                this.txtTipo.setText(producto.getTipo());
            }

            else{
                JOptionPane.showMessageDialog(this,"producto no existe","Buscar producto",2);
            }
        }
        //error
        catch (Exception e) {
            //error
        }
    }//GEN-LAST:event_btnRellenarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(this.txtId.getText().trim());

        try {
            Producto producto = new Producto(id);
            producto.existeProducto();
            //SI EXISTE, lo borro
            if(Conexion.buscarProducto){
                producto.borrarProducto();
                //JOptionPane.showMessageDialog(this,"cliente eliminado","Eliminar",3);
            }
            //NO EXISTE
            else{
                JOptionPane.showMessageDialog(this,"Producto no encontrado","Eliminar producto",2);
            }
        }
        //hay un error
        catch (Exception e) {
            //error
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        //obtengo datos
        int id = Integer.parseInt(this.txtId.getText().trim());
        String nombre = this.txtNombre.getText().trim();
        int precio = Integer.parseInt(this.txtPrecio.getText().trim());
        int cantidad = Integer.parseInt(this.txtCantidad.getText().trim());
        String tipo = this.txtTipo.getText().trim();
        String marca = this.txtMarca.getText().trim();

        try {
            Producto producto = new Producto(id,nombre,cantidad,precio,tipo,marca);
            producto.existeProducto();
            //SI EXISTE, actualizo el registro
            if(Conexion.buscarProducto){
                producto.actualizarProducto();
                //JOptionPane.showMessageDialog(this,"Cliente actualizado correctamente","Actualizar",1);
            }
            //NO EXISTE
            else{
                JOptionPane.showMessageDialog(this,"Producto no encontrado","Actualizar Producto",1);
            }
        }
        //hay un error
        catch (Exception e) {
            //error
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRellenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
