/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

//librerias
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author atude
 */

public class Cliente {
    //atributos del cliente
    private String rut_cliente;
    private String nombre;
    private String fono;
    
    //constructor
    public Cliente(String rut_cliente, String nombre, String fono) {
        this.rut_cliente = rut_cliente;
        this.nombre = nombre;
        this.fono = fono;
    }
    
    //gets y sets
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
    
    //insertado de un nuevo cliente
    public void insertarCliente(){
        try {
            //intento insertado del cliente
            String sql = "insert into clientes values('"+rut_cliente+"','"+nombre+"','"+fono+"')";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            Conexion.stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente", "Exito en agregar cliente", 1);
            Conexion.desconectar();
        } 
        //hay un error
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en guardar cliente", "Error en agregar cliente", 2);
        }
    }
    
    //actualizar registro de un cliente
    public void actualizarCliente(){
        try {
            //intento actualizar registro
            String sql = "update clientes set nombre='"+nombre+"',fono='"+fono+"' where rut = '"+rut_cliente+"' ";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            Conexion.stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente", "Actualizar registro de un cliente", 1);
        } 
        //hay un error
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar cliente", "Error en actualizar registro de un cliente", 2);
        }
    }
    
    //borrar un cliente
    public void borrarCliente(){
        try {
            //intento borrar cliente
            String sql = "delete from clientes where rut = '"+rut_cliente+"'";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            Conexion.stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Cliente borrado correctamente", "Borrar un cliente", 1);
        } 
        //hay un error
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en borrar cliente", "Error en borrar registro de un cliente", 2);
        }
    }
    
    //buscar un cliente
    public void existCliente(){
        try {
            //intento buscar el cliente
            Conexion.buscarCliente=false;
            String sql = "select * from clientes where rut = '"+rut_cliente+"'";
            Conexion.conectar();
            Conexion.stm = Conexion.con.prepareStatement(sql);
            ResultSet rs = Conexion.stm.executeQuery(sql);
            //existe el cliente?
            if(rs.next()){
                Conexion.buscarCliente=true;
                rut_cliente = rs.getString(1);
                nombre= rs.getString(2);
                fono = rs.getString(3);
            }
            Conexion.desconectar();
        } 
        //no existe
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no existe el cliente", "Buscar un cliente", 2);
        }
    }
}
