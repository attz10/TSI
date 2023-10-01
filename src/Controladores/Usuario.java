/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author atude
 */
public class Usuario {
    private String rut;
    private String usuario;
    private String contrasena;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public byte validarUsuario(){
        byte index = 0;
        try {
            String sql= "select * from usuarios where usuario='"+usuario+"' and contrasena='"+contrasena+"' ";
            Conexion.conectar();
            Conexion.stm =Conexion.con.prepareStatement(sql);
            ResultSet rs = Conexion.stm.executeQuery(sql);
            if(rs.next()){
                index = 1;
                if(index==1){
                   return index;
                }
            }else{
                JOptionPane.showMessageDialog(null,"ERROR DE ACCESO, CREDENCIALES INCORRECTAS");
                return index;
            }
            Conexion.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage());
            return index;
        }
        return index;
    }
}