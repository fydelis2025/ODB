/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author detetive
 */
public class ODB_Parameter {
    
    public static Boolean UsuarioLogado = false;
    public static int CodigoDetetive;
    public static int CodigoSexo;
    public static int CodigoEstadoCivil;
    public static int CodigoTipoAssociado;
    public static int CodigoGrupo;
    public static String CaminhoFoto;
    public static String NomeDetetive = null;
    public static Statement _statement = null;
    public static ResultSet _Result = null;
    public static Connection con = null;
    public static PreparedStatement _prepare = null;
    public static ImageIcon icon;
    public static Dimension _dimensaoDefault;
    public static Webcam _Webcam;
    
    public ImageIcon getImageIcon(){
        
        // onde imageIcon é, acredite, do tipo ImageIcon :)
        icon = new ImageIcon();
        
        if(icon.getImage()!= null){            

            // só lembrando... getImagem() retorna um array de bytes
            icon  = new ImageIcon(icon.getImage()); 
        }       
               
        return icon ;
}   
}
