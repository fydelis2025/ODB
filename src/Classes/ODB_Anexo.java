/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Administrador
 */
public class ODB_Anexo {
    
    public byte [] bytes;
    public int CodigoDetetive;
    
    public void setCodigoDetetive(int _CodigoDetetive){
        this.CodigoDetetive = _CodigoDetetive;
    }
    
    public int getCodigoDetetive(){
        return this.CodigoDetetive;
    }
    
    public boolean setArquivo( File f ){
        try {
            InputStream is = new FileInputStream( f );
            bytes = new byte[(int)f.length() ];
            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length
                   && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
                offset += numRead;
            }
            return true;

        } catch (IOException ex){
            
        }
        return false;
    }
    
    public File getArquivo( ){
        File f = null;
        try {
            f = new File( "/local_a_ser_salvo/" + "recuperado" );
            FileOutputStream fos = new FileOutputStream( f);
            fos.write( bytes );
            fos.close();
            return f;
        } catch (Exception ex) {

        }
        return null;
    }
}
