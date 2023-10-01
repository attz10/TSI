package Controladores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author atude
 */
public class Conexion {
    public static  String URL = "jdbc:mysql://localhost:3306/tsi";
    public static  String USER = "root";
    public static  String PASS = "";
    
    public static Connection con;
    public static Statement stm;
    public static Boolean buscarCliente;
     
    public static void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
            if(con != null){
                JOptionPane.showMessageDialog(null,"conectado con exito");
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
    }
    
    public static void desconectar() throws SQLException{
        con.close();
    }
}
