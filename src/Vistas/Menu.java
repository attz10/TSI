/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

//librerias
import java.awt.Dimension;

/**
 *
 * @author atude
 */

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    //vistas para la administracion de clientes
    jiFrame_agregarCliente jiAgregar = new jiFrame_agregarCliente();
    jiFrame_borrarEditarCliente jiEditar = new jiFrame_borrarEditarCliente();
    jiFrame_listarClientes jiListar = new jiFrame_listarClientes();
    //vistas para la administracion de vehículos
    jiFrame_agregarAuto jAgregarVehiculo = new jiFrame_agregarAuto();
    jiFrame_borrarAuto jBorrarAuto = new jiFrame_borrarAuto();
    //vistas para la administracion de productos
    jiFrame_agregarProducto jiAgregarProducto = new jiFrame_agregarProducto();
    jiFrame_borrarProducto jiBorrarProducto = new jiFrame_borrarProducto();
    
    
    public Menu() {
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

        PanelDeEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuClientes = new javax.swing.JMenu();
        jmiEditDeleteCliente = new javax.swing.JMenuItem();
        jmiAgregarCliente = new javax.swing.JMenuItem();
        jmiListarClientes = new javax.swing.JMenuItem();
        jMenuVehiculos = new javax.swing.JMenu();
        jmiEditDeleteVehiculo = new javax.swing.JMenuItem();
        jmiAgregarVehiculo = new javax.swing.JMenuItem();
        jMenuBodega = new javax.swing.JMenu();
        jmiEditDeleteProducto = new javax.swing.JMenuItem();
        jmiAgregarProducto = new javax.swing.JMenuItem();
        jMenuServicios = new javax.swing.JMenu();
        jmiEditDeleteServicio = new javax.swing.JMenuItem();
        jmiAgregarServicio = new javax.swing.JMenuItem();
        jmiListarServicio = new javax.swing.JMenuItem();
        jMenuVentas = new javax.swing.JMenu();
        jmiRealizarVenta = new javax.swing.JMenuItem();
        jmiListarVentas = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        javax.swing.GroupLayout PanelDeEscritorioLayout = new javax.swing.GroupLayout(PanelDeEscritorio);
        PanelDeEscritorio.setLayout(PanelDeEscritorioLayout);
        PanelDeEscritorioLayout.setHorizontalGroup(
            PanelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        PanelDeEscritorioLayout.setVerticalGroup(
            PanelDeEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(0, 40, 0, 0));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuClientes.setText("Clientes");
        jMenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuClientes.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jMenuClientes.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClientesActionPerformed(evt);
            }
        });

        jmiEditDeleteCliente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiEditDeleteCliente.setText("Editar y Borrar Cliente");
        jmiEditDeleteCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmiEditDeleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditDeleteClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jmiEditDeleteCliente);

        jmiAgregarCliente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiAgregarCliente.setText("Agregar Cliente");
        jmiAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmiAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jmiAgregarCliente);

        jmiListarClientes.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiListarClientes.setText("Listar Clientes");
        jmiListarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmiListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jmiListarClientes);

        jMenuBar1.add(jMenuClientes);

        jMenuVehiculos.setText("Vehículos");
        jMenuVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuVehiculos.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jMenuVehiculos.setMargin(new java.awt.Insets(2, 10, 2, 10));

        jmiEditDeleteVehiculo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiEditDeleteVehiculo.setText("Editar y borrar vehículo");
        jmiEditDeleteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditDeleteVehiculoActionPerformed(evt);
            }
        });
        jMenuVehiculos.add(jmiEditDeleteVehiculo);

        jmiAgregarVehiculo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiAgregarVehiculo.setText("Agregar vehículo");
        jmiAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarVehiculoActionPerformed(evt);
            }
        });
        jMenuVehiculos.add(jmiAgregarVehiculo);

        jMenuBar1.add(jMenuVehiculos);

        jMenuBodega.setText("Bodega");
        jMenuBodega.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBodega.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jMenuBodega.setMargin(new java.awt.Insets(2, 10, 2, 10));

        jmiEditDeleteProducto.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiEditDeleteProducto.setText("Editar y borrar producto");
        jmiEditDeleteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditDeleteProductoActionPerformed(evt);
            }
        });
        jMenuBodega.add(jmiEditDeleteProducto);

        jmiAgregarProducto.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiAgregarProducto.setText("Agregar producto");
        jmiAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarProductoActionPerformed(evt);
            }
        });
        jMenuBodega.add(jmiAgregarProducto);

        jMenuBar1.add(jMenuBodega);

        jMenuServicios.setText("Servicios");
        jMenuServicios.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jMenuServicios.setMargin(new java.awt.Insets(2, 10, 2, 10));

        jmiEditDeleteServicio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiEditDeleteServicio.setText("Editar y borrar servicio");
        jMenuServicios.add(jmiEditDeleteServicio);

        jmiAgregarServicio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiAgregarServicio.setText("Agregar servicio");
        jMenuServicios.add(jmiAgregarServicio);

        jmiListarServicio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiListarServicio.setText("Listar Servicios");
        jMenuServicios.add(jmiListarServicio);

        jMenuBar1.add(jMenuServicios);

        jMenuVentas.setText("Ventas");
        jMenuVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuVentas.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jMenuVentas.setMargin(new java.awt.Insets(2, 10, 2, 10));

        jmiRealizarVenta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiRealizarVenta.setText("Realizar venta");
        jMenuVentas.add(jmiRealizarVenta);

        jmiListarVentas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jmiListarVentas.setText("Listar ventas");
        jMenuVentas.add(jmiListarVentas);

        jMenuBar1.add(jMenuVentas);

        jMenuSalir.setText("salir");
        jMenuSalir.setActionCommand("SALIR");
        jMenuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuSalir.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
        jMenuSalir.setMargin(new java.awt.Insets(2, 10, 2, 10));

        jmiSalir.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jmiSalir.setText("salir");
        jmiSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenuSalir.add(jmiSalir);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //btn agregar cliente
    private void jmiAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarClienteActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jiAgregar);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jiAgregar.getSize();
        jiAgregar.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jiAgregar.show();
    }//GEN-LAST:event_jmiAgregarClienteActionPerformed

    //btn salir
    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    //menu
    private void jMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuClientesActionPerformed

    //btn editar y eliminar cliente
    private void jmiEditDeleteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditDeleteClienteActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jiEditar);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jiEditar.getSize();
        jiEditar.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jiEditar.show();
    }//GEN-LAST:event_jmiEditDeleteClienteActionPerformed

    //btn listar clientes
    private void jmiListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarClientesActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jiListar);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jiListar.getSize();
        jiListar.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jiListar.show();
    }//GEN-LAST:event_jmiListarClientesActionPerformed

    //btn editar y borrar vehiculo
    private void jmiEditDeleteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditDeleteVehiculoActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jBorrarAuto);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jBorrarAuto.getSize();
        jBorrarAuto.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jBorrarAuto.show();
    }//GEN-LAST:event_jmiEditDeleteVehiculoActionPerformed

    //btn agregar vehiculo
    private void jmiAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarVehiculoActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jAgregarVehiculo);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jAgregarVehiculo.getSize();
        jAgregarVehiculo.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jAgregarVehiculo.show();
    }//GEN-LAST:event_jmiAgregarVehiculoActionPerformed

    private void jmiEditDeleteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditDeleteProductoActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jiBorrarProducto);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jiBorrarProducto.getSize();
        jiBorrarProducto.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jiBorrarProducto.show();
    }//GEN-LAST:event_jmiEditDeleteProductoActionPerformed

    private void jmiAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarProductoActionPerformed
        // TODO add your handling code here:
        PanelDeEscritorio.add(jiAgregarProducto);
        //centro panel
        Dimension escritorioSize = PanelDeEscritorio.getSize();
        Dimension frameSize = jiAgregarProducto.getSize();
        jiAgregarProducto.setLocation((escritorioSize.width - frameSize.width)/2, (escritorioSize.height- escritorioSize.height)/2);
        //muestro el panel
        this.jiAgregarProducto.show();
    }//GEN-LAST:event_jmiAgregarProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelDeEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBodega;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuServicios;
    private javax.swing.JMenu jMenuVehiculos;
    private javax.swing.JMenu jMenuVentas;
    private javax.swing.JMenuItem jmiAgregarCliente;
    private javax.swing.JMenuItem jmiAgregarProducto;
    private javax.swing.JMenuItem jmiAgregarServicio;
    private javax.swing.JMenuItem jmiAgregarVehiculo;
    private javax.swing.JMenuItem jmiEditDeleteCliente;
    private javax.swing.JMenuItem jmiEditDeleteProducto;
    private javax.swing.JMenuItem jmiEditDeleteServicio;
    private javax.swing.JMenuItem jmiEditDeleteVehiculo;
    private javax.swing.JMenuItem jmiListarClientes;
    private javax.swing.JMenuItem jmiListarServicio;
    private javax.swing.JMenuItem jmiListarVentas;
    private javax.swing.JMenuItem jmiRealizarVenta;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
