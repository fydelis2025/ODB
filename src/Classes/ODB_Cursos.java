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
public class ODB_Cursos {
    
    public int ID;
    public String Curso;
    public String CNPJ;
    public String Instituicao;
    public Boolean Concluido;
    public String CPF;
    
    public void setID(int _ID){
        
        this.ID = _ID;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void setCurso(String _Curso){
        
        this.Curso = _Curso;
    }
    
    public String getCurso(){
        return this.Curso;
    }
    
    public void setCNPJ(String _CNPJ){
        
        this.CNPJ = _CNPJ;
    }
    
    public String getCNPJ(){
        return this.CNPJ;
    }
    
    public void setInstituicao(String _Instituicao){
        
        this.Instituicao = _Instituicao;
    }
    
    public String getInstituicao(){
        return this.Instituicao;
    }
    
    public void setConcluido(Boolean _Concluido){
        
        this.Concluido = _Concluido;
    }
    
    public Boolean getConcluido(){
        return this.Concluido;
    }
    
    public void setCPF(String _CPF){
        
        this.CPF = _CPF;
    }
    
    public String getCPF(){
        return this.CPF;
    }
}
