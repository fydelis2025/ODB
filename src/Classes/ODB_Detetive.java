/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author detetive
 */
public class ODB_Detetive {

    public int ID;
    public String Nome;
    public String CPF;
    public String RG;
    public String Titulo;
    public int Zona;
    public int Sessao;
    public int Sexo;
    public Calendar Nascimento;
    public String Naturalidade;
    public String UF;
    public int EstadoCivil;
    public String Conjuge;
    public String NomeMae;
    public String NomePai;
    public int RegistroODB;
    public Calendar  Validade;
    public int TipoCadastro;
    public String Email;
    public String Site;
    public int Grupo;
    public Boolean Ativo;
    public Boolean AvisarAniversario;
    public Calendar DataCadastro;
    public byte[] Foto;
    
    public void setID(int _ID){
        
        this.ID = _ID;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void setNome(String _Nome){
        
        this.Nome = _Nome;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setCPF(String _CPF){
        
        this.CPF = _CPF;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public void setRG(String _RG){
        
        this.RG = _RG;
    }
    
    public String getRG(){
        return this.RG;
    }
    
    public void setTitulo(String _Titulo){
        
        this.Titulo = _Titulo;
    }
    
    public String getTitulo(){
        return this.Titulo;
    }
    
    public void setZona(int _Zona){
        
        this.Zona = _Zona;
    }
    
    public int getZona(){
        return this.Zona;
    }
    
    public void setSessao(int _Sessao){
        
        this.Sessao = _Sessao;
    }
    
    public int getSessao(){
        return this.Sessao;
    }
    
    public void setSexo(int _Sexo){
        
        this.Sexo = _Sexo;
    }
    
    public int getSexo(){
        return this.Sexo;
    }
    
    public void setNascimento(Calendar  _Nascimento){
        
        this.Nascimento = _Nascimento;
    }
    
    public Calendar getNascimento(){
        return this.Nascimento;
    }
    
    public void setNaturalidade(String _Naturalidade){
        
        this.Naturalidade = _Naturalidade;
    }
    
    public String getNaturalidade(){
        return this.Naturalidade;
    }
    
    public void setUF(String _UF){
        
        this.UF = _UF;
    }
    
    public String getUF(){
        return this.UF;
    }
    
    public void setEstadoCivil(int _EstadoCivil){
        
        this.EstadoCivil = _EstadoCivil;
    }
    
    public int getEstadoCivil(){
        return this.EstadoCivil;
    }
    
    public void setConjuge(String _Conjuge){
        
        this.Conjuge = _Conjuge;
    }
    
    public String getConjuge(){
        return this.Conjuge;
    }
    
    public void setNomePai(String _NomePai){
        
        this.NomePai = _NomePai;
    }
    
    public String getNomePai(){
        return this.NomePai;
    }
    
    public void setNomeMae(String _NomeMae){
        
        this.NomeMae = _NomeMae;
    }
    
    public String getNomeMae(){
        return this.NomeMae;
    }
    
    public void setRegistroODB(int _RegistroODB){
        
        this.RegistroODB = _RegistroODB;
    }
    
    public int getRegistroODB(){
        return this.RegistroODB;
    }
    
    public void setValidade(Calendar  _Validade){
        
        this.Validade = _Validade;
    }
    
    public Calendar getValidade(){
        return this.Validade;
    }
    
    public void setTipoCadastro(int _TipoCadastro){
        
        this.TipoCadastro = _TipoCadastro;
    }
    
    public int getTipoCadastro(){
        return this.TipoCadastro;
    }
    
    public void setEmail(String _Email){
        
        this.Email = _Email;
    }
    
    public String getEmail(){
        return this.Email;
    }
    
    public void setSite(String _Site){
        
        this.Site = _Site;
    }
    
    public String getSite(){
        return this.Site;
    }
    
    public void setGrupo(int _Grupo){
        
        this.Grupo = _Grupo;
    }
    
    public int getGrupo(){
        return this.Grupo;
    }
    
   
    
    public void setAtivo(Boolean _Ativo){
        
        this.Ativo = _Ativo;
    }
    
    public Boolean getAtivo(){
        return this.Ativo;
    }
    
    public void setAvisarAniversario(Boolean _AvisarAniversario){
        
        this.AvisarAniversario = _AvisarAniversario;
    }
    
    public Boolean getAvisarAniversario(){
        return this.AvisarAniversario;
    }
    
    public void setDataCadastro(Calendar  _DataCadastro){
        
        this.DataCadastro = _DataCadastro;
    }
    
    public Calendar getDataCadastro(){
        return this.DataCadastro;
    }
    
    public void setFoto(String _Caminho){
        try{
            this.Foto = Files.readAllBytes(Paths.get(_Caminho));
            
        }catch(IOException ex){
            System.out.println("IO: " + ex + "\n\n");
        }
    }
    
    public byte[] getFoto(){
        return this.Foto;
    }
}
