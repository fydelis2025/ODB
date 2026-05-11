/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.Conexao;
import Classes.ODB_EstadoCivil;
import Classes.ODB_Grupo;
import Classes.ODB_Parameter;
import Classes.ODB_Sexo;
import Classes.ODB_TipoCadastro;
import Classes.ODB_UF;
import Classes.ODB_Usuarios;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author detetive
 */
public class Selecionar {
    
    
    public static int Consultar_IDSexo(String Sexo){
        try
        {
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT FC_TIPOSEXO(?) AS CODIGO;");
            ODB_Parameter._prepare.setString(1, Sexo);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.CodigoSexo = ODB_Parameter._Result.getInt("CODIGO");
            }
            
            ODB_Parameter.con.close();
            
            return ODB_Parameter.CodigoSexo;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.CodigoSexo;
    }
    
    public static int Consultar_IDEstadoCivil(String _EstadoCivil){
        try
        {
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT FC_ESTADOCIVIL(?) AS CODIGO;");
            ODB_Parameter._prepare.setString(1, _EstadoCivil);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.CodigoEstadoCivil = ODB_Parameter._Result.getInt("CODIGO");
            }
            
            ODB_Parameter.con.close();
            
            return ODB_Parameter.CodigoEstadoCivil;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.CodigoEstadoCivil;
    }
    
    public static int Consultar_IDTipoCadastro(String _tipo){
        try
        {
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT FC_TIPOASSOCIADO(?) AS CODIGO;");
            ODB_Parameter._prepare.setString(1, _tipo);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.CodigoTipoAssociado = ODB_Parameter._Result.getInt("CODIGO");
            }
            
            ODB_Parameter.con.close();
            
            return ODB_Parameter.CodigoTipoAssociado;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.CodigoTipoAssociado;
    }
    
        public static int Consultar_IDGrupo(String _Descricao){
        try
        {
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT FC_GRUPO(?) AS CODIGO;");
            ODB_Parameter._prepare.setString(1, _Descricao);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.CodigoGrupo = ODB_Parameter._Result.getInt("CODIGO");
            }
            
            ODB_Parameter.con.close();
            
            return ODB_Parameter.CodigoGrupo;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.CodigoGrupo;
    }
    
    public static int Consultar_IDDetetive(String CPF){
        try
        {
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT FC_CODIGODETETIVE(?) AS CODIGO;");
            ODB_Parameter._prepare.setString(1, CPF);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.CodigoDetetive = ODB_Parameter._Result.getInt("CODIGO");
            }
            
            ODB_Parameter.con.close();
            
            return ODB_Parameter.CodigoDetetive;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.CodigoDetetive;
    }
    
    
    public static String Consultar_CPFDetetive(String CPF){
        try
        {
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT FC_NOMEDETETIVE(?) AS NOME;");
            ODB_Parameter._prepare.setString(1, CPF);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.NomeDetetive = ODB_Parameter._Result.getString("NOME");
            }
            
            return ODB_Parameter.NomeDetetive;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.NomeDetetive;
    }
    
    
    
    public static Boolean Consultar_Login(String Login, String Senha){
        try
        {
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("SELECT LIBERADO FROM ODB_USUARIO WHERE USUARIO = ? AND SENHA = ?");
            ODB_Parameter._prepare.setString(1, Login);
            ODB_Parameter._prepare.setString(2, Senha);
            
            ODB_Parameter._Result = ODB_Parameter._prepare.executeQuery();
            
            if(ODB_Parameter._Result.next()){
                
                ODB_Parameter.UsuarioLogado = ODB_Parameter._Result.getBoolean("LIBERADO");
            }
            
            ODB_Parameter.con.close();
            
            return ODB_Parameter.UsuarioLogado;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO de conexão", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ODB_Parameter.UsuarioLogado;
    }
    
    static ArrayList ListaUF = null;
    static ArrayList ListarUsuarios = null;
    static ArrayList ListarSexo = null;
    static ArrayList ListarEstadoCivil = null;
    static ArrayList ListarGrupo = null;
    static ArrayList ListartTipoCadastro = null;
    
    public static ArrayList<ODB_Usuarios> Listar_Usuarios(){
        try{
            
            ODB_Usuarios _user = null;
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._Result = ODB_Parameter._statement.executeQuery("SELECT NOME, USUARIO, CPFCNPJ, ENTIDADE, TELEFONE, EMAIL, LIBERADO FROM ODB_USUARIO ORDER BY NOME");

            ListarUsuarios = new ArrayList();
            
            while(ODB_Parameter._Result.next()){

                _user = new ODB_Usuarios();
                
                _user.setNome(ODB_Parameter._Result.getString("NOME"));
                _user.setUsuario(ODB_Parameter._Result.getString("USUARIO"));
                _user.setCPFCNPJ(ODB_Parameter._Result.getString("CPFCNPJ"));
                _user.setEntidade(ODB_Parameter._Result.getString("ENTIDADE"));
                _user.setTelefone(ODB_Parameter._Result.getInt("TELEFONE"));
                _user.setEmail(ODB_Parameter._Result.getString("EMAIL"));
                _user.setLiberado(ODB_Parameter._Result.getBoolean("LIBERADO"));

                ListarUsuarios.add(_user);
            }

            ODB_Parameter.con.close();

            return ListarUsuarios;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ListarUsuarios;
    }
    
    public static ArrayList<ODB_Grupo> Listar_Grupos(){
        try{
            
            ODB_Grupo _grupo;
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._Result = ODB_Parameter._statement.executeQuery("SELECT DESCRICAO FROM ODB_GRUPOS ORDER BY DESCRICAO");

            ListarGrupo = new ArrayList();
            
            while(ODB_Parameter._Result.next()){

                _grupo = new ODB_Grupo();
                
                _grupo.Descricao = ODB_Parameter._Result.getString("DESCRICAO");

                ListarGrupo.add(_grupo);
            }

            ODB_Parameter.con.close();

            return ListarGrupo;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ListarGrupo;
    }
    
    public static ArrayList<ODB_TipoCadastro> Listar_TipoCadastro(){
        try{
            
            ODB_TipoCadastro _tipocadastro;
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._Result = ODB_Parameter._statement.executeQuery("SELECT DESCRICAO FROM ODB_TIPOCADASTRO ORDER BY DESCRICAO");

            ListartTipoCadastro = new ArrayList();
            
            while(ODB_Parameter._Result.next()){

                _tipocadastro = new ODB_TipoCadastro();
                
                _tipocadastro.Descricao = ODB_Parameter._Result.getString("DESCRICAO");

                ListartTipoCadastro.add(_tipocadastro);
            }

            ODB_Parameter.con.close();

            return ListartTipoCadastro;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ListartTipoCadastro;
    }
    
    public static ArrayList<ODB_EstadoCivil> Listar_EstadoCivil(){
        try{
            
            ODB_EstadoCivil _estadocivil;
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._Result = ODB_Parameter._statement.executeQuery("SELECT DESCRICAO FROM ODB_ESTACIVIL ORDER BY DESCRICAO");

            ListarEstadoCivil = new ArrayList();
            
            while(ODB_Parameter._Result.next()){

                _estadocivil = new ODB_EstadoCivil();
                
                _estadocivil.Descricao = ODB_Parameter._Result.getString("DESCRICAO");

                ListarEstadoCivil.add(_estadocivil);
            }

            ODB_Parameter.con.close();

            return ListarEstadoCivil;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ListarEstadoCivil;
    }
    
    public static ArrayList<ODB_Sexo> Listar_Sexo(){
        try{
            
            ODB_Sexo _sexo;
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._Result = ODB_Parameter._statement.executeQuery("SELECT DESCRICAO FROM ODB_SEXO ORDER BY DESCRICAO");

            ListarSexo = new ArrayList();
            
            while(ODB_Parameter._Result.next()){

                _sexo = new ODB_Sexo();
                
                _sexo.Descricao = ODB_Parameter._Result.getString("DESCRICAO");

                ListarSexo.add(_sexo);
            }

            ODB_Parameter.con.close();

            return ListarSexo;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ListarSexo;
    }
     
    public static ArrayList<ODB_UF> Listar_Estados(){
        try{
            
            ODB_UF _estado;
            
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._Result = ODB_Parameter._statement.executeQuery("SELECT UF FROM ODB_ESTADO ORDER BY UF");

            ListaUF = new ArrayList();
            
            while(ODB_Parameter._Result.next()){

                _estado = new ODB_UF();
                
                _estado.Descricao = ODB_Parameter._Result.getString("UF");

                ListaUF.add(_estado);
            }

            ODB_Parameter.con.close();

            return ListaUF;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return ListaUF;
    }
    
}
