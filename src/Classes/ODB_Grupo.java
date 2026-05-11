/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class ODB_Grupo {
    public int Codigo;
    public String Descricao;
    
    public void setCodigo(int _Codigo){
        this.Codigo = _Codigo;
    }
    
    public int getCodigo(){
        return this.Codigo;
    }
    
    public void setDescricao(String _Descricao){
        this.Descricao = _Descricao;
    }
    public String getDescricao(){
        return this.Descricao;
    }
}
