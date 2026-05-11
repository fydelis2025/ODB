/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Conexao {
    
    static Connection conn = null;
    
    public static Connection CriarConexao() throws SQLException{
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://67.23.238.5/odborgbr_odbsistema","odborgbr_sistema","@@OdbSistemas$$");
            
            return conn;
            
        }catch(Exception ex){
            conn.close();
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return conn;
    }
}
