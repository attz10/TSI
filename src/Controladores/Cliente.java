/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author atude
 */
public class Cliente {
    private String rut_cliente;
    private String nombre;
    private String fono;

    public Cliente(String rut_cliente, String nombre, String fono) {
        this.rut_cliente = rut_cliente;
        this.nombre = nombre;
        this.fono = fono;
    }
    
    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }
    
    public void insertarCliente(){
        try {
            String sql = "insert into clientes values('"+rut_cliente+"','"+nombre+"','"+fono+"')";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            Conexion.stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Datos guardados");
            Conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en guardar cliente");
        }
    }
    
    public void actualizarCliente(){
        try {
            String sql = "update clientes set rut='"+rut_cliente+"',nombre='"+nombre+"',fono='"+fono+"'";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            Conexion.stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Cliente actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar cliente");
        }
    }
    
    public void borrarCliente(){
        try {
            String sql = "delete from clientes where rut = '"+rut_cliente+"'";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            Conexion.stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Cliente borrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en borrar cliente");
        }
    }
    
    public void existCliente(){
        try {
            Conexion.buscarCliente=false;
            String sql = "select * from clientes where rut = '"+rut_cliente+"'";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            ResultSet rs = Conexion.stm.executeQuery(sql);
            if(rs.next()){
                Conexion.buscarCliente=true;
                rut_cliente = rs.getString(1);
                nombre= rs.getString(2);
                fono = rs.getString(3);
            }
            Conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no existe cliente borrar cliente");
        }
    }
}
