package Controladores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author atude
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/tsi";
    public static final String USER = "root";
    public static final String PASS = "";
     
    public Connection conectar(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
            JOptionPane.showMessageDialog(null,"conectado con exito");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
        return con;
    }
}
