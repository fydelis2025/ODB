/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author detetive
 */
public class ODB_ESTADO {
    
    public int Codigo;
    public String Nome;
    
    public void setCodigo(int _Codigo){
        this.Codigo = _Codigo;
    }
    
    public int getCodigo(){
        return this.Codigo;
    }
    
    public void setNome(String _Nome){
        this.Nome = _Nome;
    }
    public String getNome(){
        return this.Nome;
    }
}
