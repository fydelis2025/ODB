/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class ODB_Login {
    
    public String Usurio;
    public String Senha;
    public String Host;
    public String IP;
    public Boolean Ativo;
    public Boolean Bloqueado;
    public Boolean Logado;
    public String Longevitude;
    public String Latitude;
    public Date Data;
    
    public void setUsuario(String _Usuario){
        
        this.Usurio = _Usuario;
    }
    
    public String getUsuario(){
        return this.Usurio;
    }
    
    public void setSenha(String _Senha){
        this.Senha = _Senha;
    }
    
    public String getSenha(){
        return  this.Senha;
    }
    
    public void setHost(String _Host){
        this.Host = _Host;
    }
    
    public String getHost(){
        return this.Host;
    }
    
    public void setIP(String _IP){
        this.IP = _IP;
    }
    
    public String getIP(){
        return this.IP;
    }
    
    public void setAtvo(Boolean _Ativo){
        this.Ativo = _Ativo;
    }
    
    public Boolean getAtivo(){
        return this.Ativo;
    }
    
     public void setBloqueado(Boolean _Bloqueado){
        this.Bloqueado = _Bloqueado;
    }
    
    public Boolean getBloqueado(){
        return this.Bloqueado;
    }
    
     public void setLogado(Boolean _Logado){
        this.Logado = _Logado;
    }
    
    public Boolean getLogado(){
        return this.Logado;
    }
    
     public void setLongevitude(String _Longevitude){
        this.Longevitude = _Longevitude;
    }
    
    public String getLongevitude(){
        return this.Longevitude;
    }
    
     public void setLatitude(String _Latitude){
        this.Latitude = _Latitude;
    }
    
    public String getLatitude(){
        return this.Latitude;
    }
    
    public void setData(Date _Data){
        this.Data = _Data;
    }
    
    public Date getData(){
        return this.Data;
    }
}
