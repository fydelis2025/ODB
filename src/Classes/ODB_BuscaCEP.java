/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author detetive
 */
public class ODB_BuscaCEP {
    
    static String json;
    public static String Endereco;
    public static String Bairro;
    public static String Cidade;
    public static String UF;
    public static String DDD;
    public static String _Cep_;
            
    public void BuscaCEP(String _Cep){
        try{
            URL url = new URL("http://viacep.com.br/ws/"+ _Cep +"/json");
            URLConnection BuscarURL = url.openConnection();
            InputStream inputstream = BuscarURL.getInputStream();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(inputstream));
            
            StringBuilder jsonSb = new StringBuilder();

            buffer.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            //throw new Exception(Arrays.toString(array));
            
            Endereco = array[7];            
            Bairro = array[15];
            Cidade = array[19]; 
            UF = array[23];
            DDD = array[35];
            _Cep_ = array[3];
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
