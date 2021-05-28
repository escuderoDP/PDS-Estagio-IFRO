/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Millena Bello
 */
public class Conectar {
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final String URL = "jdbc:mysql://localhost/SistemaDeEstagio";
    
    public static Connection getConectar(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }
        
        return con;
    }
}
