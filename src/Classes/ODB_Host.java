/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author detetive
 */
public class ODB_Host {
    
   //static InetAddress _host;
   static String Host_ = null;
    
    public static String Pegar_Host() {

        try{
            
            Host_ = InetAddress.getLocalHost().getHostName();

            return Host_.toUpperCase();
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return Host_;
    }
    
    public static String Pegar_IP() {

        try{
            
            URL IpExterno = new URL("http://checkip.amazonaws.com");
            BufferedReader buffer_ = new BufferedReader(new InputStreamReader(
                IpExterno.openStream()));

            Host_ = buffer_.readLine();

            return Host_;
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return Host_;
    }
}
