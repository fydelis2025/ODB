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
public class ODB_DetetiveComplemento {
    
    public int ID;
    public int CodigoDetetive;
    public int Cep;
    public String Endereco;
    public String Complemento;
    public int Numero;
    public String Bairro;
    public String UFEndereco;
    public String Cidade;
    public int DDD;
    public String Telefone;
    
    public void setID(int _ID){
        
        this.ID = _ID;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void setCodigoDetetive(int _CodigoDetetive){
        
        this.CodigoDetetive = _CodigoDetetive;
    }
    
    public int getCodigoDetetive(){
        return this.CodigoDetetive;
    }
    
    public void setCep(int _Cep){
        
        this.Cep = _Cep;
    }
    
    public int getCep(){
        return this.Cep;
    }
    
    public void setEndereco(String _Endereco){
        
        this.Endereco = _Endereco;
    }
    
    public String getEndereco(){
        return this.Endereco;
    }
    
    public void setComplemento(String _Complemento){
        
        this.Complemento = _Complemento;
    }
    
    public String getComplemento(){
        return this.Complemento;
    }
    
    public void setNumero(int _Numero){
        
        this.Numero = _Numero;
    }
    
    public int getNumero(){
        return this.Numero;
    }
    
    public void setBairro(String _Bairro){
        
        this.Bairro = _Bairro;
    }
    
    public String getBairro(){
        return this.Bairro;
    }
    
    public void setUFEndereco(String _UFEndereco){
        
        this.UFEndereco = _UFEndereco;
    }
    
    public String getUFEndereco(){
        return this.UFEndereco;
    }
    
    public void setCidade(String _Cidade){
        
        this.Cidade = _Cidade;
    }
    
    public String getCidade(){
        return this.Cidade;
    }
    
    public void setDDD(int _DDD){
        
        this.DDD = _DDD;
    }
    
    public int getDDD(){
        return this.DDD;
    }
    
    public void setTelefone(String _Telefone){
        
        this.Telefone = _Telefone;
    }
    
    public String getTelefone(){
        return this.Telefone;
    }
}
