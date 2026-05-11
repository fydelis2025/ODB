/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;



/**
 *
 * @author detetive
 */
public class ODB_Usuarios {
    
    public int Codigo;
    public String Nome;
    public String CPFCNPJ;
    public String RG;
    public String Entidade;
    public String Usuario;
    public String Senha;
    public String Email;
    public int Cep;
    public String Endereco;
    public String Complemento;
    public int Numero;
    public String Bairro;
    public String UF;
    public String Cidade;
    public int DDD;
    public int Telefone;
    public Date DataCriacao;
    public Boolean Liberado;
    public Date DataLiberacao;
    public int LiberadorPor;
    public String PC;
    public String IP;
    
    
    public void setCodigo(int _Codigo){
        this.Codigo = _Codigo;
    }
    
    public int getCodigo(){
        return this.Codigo;
    }
    
    public void setNome(String _Nome){
        this.Nome= _Nome;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setCPFCNPJ(String _CPFCNPJ){
        this.CPFCNPJ = _CPFCNPJ;
    }
    
    public String getCPFCNPJ(){
        return this.CPFCNPJ;
    }
    
    public void setRG(String _RG){
        this.RG = _RG;
    }
    
    public String getRG(){
        return this.RG;
    }
    
    public void setEntidade(String _Entidade){
        this.Entidade = _Entidade;
    }
    public String getEntidade(){
        return this.Entidade;
    }
    
    public void setUsuario(String _Usuario){
        this.Usuario= _Usuario;
    }
    
    public String getUsuario(){
        return this.Usuario;
    }
    
    public void setSenha(String _Senha){
        this.Senha = _Senha;
    }
    
    public String getSenha(){
        return this.Senha;
    }
    
    public void setEmail(String _Email){
        this.Email = _Email;
    }
    
    public String getEmail(){
        return this.Email;
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
    
    public void setUF(String _UF){
        this.UF = _UF;
    }
    
    public String getUF(){
        return this.UF;
    }
    
    public void setCidade(String _Cidade){
        this.Cidade= _Cidade;
    }
    
    public String getCidade(){
        return this.Cidade;
    }
    
    public void setDDD(int _DDD){
        this.DDD =_DDD;
    }
    
    public int getDDD(){
        return this.DDD;
    }
    
    public void setTelefone(int _Telefone){
        this.Telefone = _Telefone;
    }
    
    public int getTelefone(){
        return this.Telefone;
    }
    
    public void setDataCriacao(Date _DataCriacao){
        this.DataCriacao = _DataCriacao;
    }
    
    public Date getDataCriacao(){
        return this.DataCriacao;
    }
    
    public void setLiberado(Boolean _Liberado){
        this.Liberado = _Liberado;
    }
    
    public Boolean getLiberado(){
        return this.Liberado;
    }
    
    public void setDataLiberacao(Date _DataLiberacao){
        this.DataLiberacao= _DataLiberacao;
    }
    
    public Date getDataLiberacao(){
        return this.DataLiberacao;
    }
    
    public void setLiberadorPor(int _LiberadorPor){
        this.LiberadorPor = _LiberadorPor;
    }
    
    public int getLiberadorPor(){
        return this.LiberadorPor;
    }
    
    public void setPC(String _PC){
        this.PC= _PC;
    }
    
    public String getPC(){
        return this.PC;
    }
    
    public void setIP(String _IP){
        this.IP= _IP;
    }
    
    public String getIP(){
        return this.IP;
    }
}
