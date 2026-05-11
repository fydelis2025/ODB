/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odb;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author fusion
 */
public class ODB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String curDir = System.getProperty("user.dir") + "\\odb.fw.png";
        
        Login frm = new Login();
        frm.setSize(567, 350);
        frm.getContentPane().setBackground(Color.white);
        frm.setResizable(false);
        frm.setLocationRelativeTo(null);
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage(curDir));
        frm.show();
    }
    
}
