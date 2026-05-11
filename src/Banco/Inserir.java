/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Classes.Conexao;
import Classes.ODB_Anexo;
import Classes.ODB_Cursos;
import Classes.ODB_Detetive;
import Classes.ODB_DetetiveComplemento;
import Classes.ODB_Parameter;
import Classes.ODB_Usuarios;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author detetive
 */
public class Inserir {
    
    public static void Criar_Usuarios(ODB_Usuarios _usuarios){
        try
        {
         
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("INSERT INTO ODB_USUARIO (NOME, USUARIO, SENHA, CPFCNPJ, RG, ENTIDADE, CEP, ENDERECO, COMPLEMENTO, NUMERO, BAIRRO, UF, CIDADE, DDD, TELEFONE, EMAIL, LIBERADO, DATASOLICITACAO, DATALIBERACAO, LIBERADOPOR)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ODB_Parameter._prepare.setString(1, _usuarios.getNome());
            ODB_Parameter._prepare.setString(2, _usuarios.getUsuario());
            ODB_Parameter._prepare.setString(3, _usuarios.getSenha());
            ODB_Parameter._prepare.setString(4, _usuarios.getCPFCNPJ());
            ODB_Parameter._prepare.setString(5, _usuarios.getRG());
            ODB_Parameter._prepare.setString(6, _usuarios.getEntidade());
            ODB_Parameter._prepare.setInt(7, _usuarios.getCep());
            ODB_Parameter._prepare.setString(8, _usuarios.getEndereco());
            ODB_Parameter._prepare.setString(9, _usuarios.getComplemento());
            ODB_Parameter._prepare.setInt(10, _usuarios.getNumero());
            ODB_Parameter._prepare.setString(11, _usuarios.getBairro());
            ODB_Parameter._prepare.setString(12, _usuarios.getUF());
            ODB_Parameter._prepare.setString(13, _usuarios.getCidade());
            ODB_Parameter._prepare.setInt(14, _usuarios.getDDD());
            ODB_Parameter._prepare.setInt(15, _usuarios.getTelefone());
            ODB_Parameter._prepare.setString(16, _usuarios.getEmail());
            ODB_Parameter._prepare.setBoolean(17, _usuarios.getLiberado());
            ODB_Parameter._prepare.setDate(18, _usuarios.getDataCriacao());
            ODB_Parameter._prepare.setDate(19, _usuarios.getDataLiberacao());
            ODB_Parameter._prepare.setInt(20, _usuarios.getLiberadorPor());
            
            int retorno = ODB_Parameter._prepare.executeUpdate();
            
            if(retorno > 0){
                JOptionPane.showMessageDialog(null,"USUÁRIO CRIADO COM SUCESSO","AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO NA CONSULTA (ESTADO)", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void Criar_Detetives(ODB_Detetive _detetive){
        try
        {
         
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("INSERT INTO ODB_DETETIVE (NOME, CPF, RG, TITULOELEITOR, ZONA, SESSAO, SEXO, NASCIMENTO, NATURALIDADE, UF, ESTADOCIVIL,CONJUGE, NOMEDAMAE, NOMEDOPAI, REGISTROODB, VALIDADE, TIPOASSOCIADO, EMAIL, SITE, GRUPO, DATACADASTRO, ATIVO, ANIVERSARIO, FOTO)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ODB_Parameter._prepare.setString(1, _detetive.getNome());
            ODB_Parameter._prepare.setString(2, _detetive.getCPF());
            ODB_Parameter._prepare.setString(3, _detetive.getRG());
            ODB_Parameter._prepare.setString(4, _detetive.getTitulo());
            ODB_Parameter._prepare.setInt(5, _detetive.getZona());
            ODB_Parameter._prepare.setInt(6, _detetive.getSessao());
            ODB_Parameter._prepare.setInt(7, _detetive.getSexo());
            ODB_Parameter._prepare.setDate(8, (new Date(_detetive.getNascimento().getTimeInMillis())));
            ODB_Parameter._prepare.setString(9, _detetive.getNaturalidade());
            ODB_Parameter._prepare.setString(10, _detetive.getUF());
            ODB_Parameter._prepare.setInt(11, _detetive.getEstadoCivil());
            ODB_Parameter._prepare.setString(12, _detetive.getConjuge());
            ODB_Parameter._prepare.setString(13, _detetive.getNomeMae());
            ODB_Parameter._prepare.setString(14, _detetive.getNomePai());
            ODB_Parameter._prepare.setInt(15, _detetive.getRegistroODB());
            ODB_Parameter._prepare.setDate(16, (new Date(_detetive.getValidade().getTimeInMillis())));
            ODB_Parameter._prepare.setInt(17, _detetive.getTipoCadastro());
            ODB_Parameter._prepare.setString(18, _detetive.getEmail());
            ODB_Parameter._prepare.setString(19, _detetive.getSite());
            ODB_Parameter._prepare.setInt(20, _detetive.getGrupo());
            ODB_Parameter._prepare.setDate(21, (new Date(_detetive.getDataCadastro().getTimeInMillis())));
            ODB_Parameter._prepare.setBoolean(22, _detetive.getAtivo());
            ODB_Parameter._prepare.setBoolean(23, _detetive.getAvisarAniversario());
            ODB_Parameter._prepare.setBytes(24, _detetive.getFoto());
            
            int retorno = ODB_Parameter._prepare.executeUpdate();
            
            if(retorno > 0){
                JOptionPane.showMessageDialog(null,"DETETIVE CRIADO COM SUCESSO","AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO (DEETETIVE)", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void Criar_DetetivesComplemento(ODB_DetetiveComplemento _detetive){
        try
        {
         
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("INSERT INTO ODB_DETETIVECOMPLEMENTO (DETETIVE, CEP, ENDERECO, COMPLEMENTO, NUMERO, BAIRRO, UF, CIDADE, DDD, TELEFONE)VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            ODB_Parameter._prepare.setInt(1, _detetive.getCodigoDetetive());
            ODB_Parameter._prepare.setInt(2, _detetive.getCep());
            ODB_Parameter._prepare.setString(3, _detetive.getEndereco());
            ODB_Parameter._prepare.setString(4, _detetive.getComplemento());
            ODB_Parameter._prepare.setInt(5, _detetive.getNumero());
            ODB_Parameter._prepare.setString(6, _detetive.getBairro());
            ODB_Parameter._prepare.setString(7, _detetive.getUFEndereco());
            ODB_Parameter._prepare.setString(8, _detetive.getCidade());
            ODB_Parameter._prepare.setInt(9, _detetive.getDDD());
            ODB_Parameter._prepare.setString(10, _detetive.getTelefone());
            
            int retorno = ODB_Parameter._prepare.executeUpdate();
            
            if(retorno > 0){
                //JOptionPane.showMessageDialog(null,"DETETIVE CRIADO COM SUCESSO","AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO (DEETETIVE)", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void Criar_DetetiveCursos(ODB_Cursos _detetive){
        try
        {
         
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("INSERT INTO ODB_CURSOS (DETETIVE, CURSO, CNPJ, INSTITUICAO, CONCLUIDO)VALUES(?,?,?,?,?)");
            
            ODB_Parameter._prepare.setInt(1, _detetive.getID());
            ODB_Parameter._prepare.setString(2, _detetive.getCurso());
            ODB_Parameter._prepare.setString(3, _detetive.getCNPJ());
            ODB_Parameter._prepare.setString(4, _detetive.getInstituicao());
            ODB_Parameter._prepare.setBoolean(5, _detetive.getConcluido());
            
            int retorno = ODB_Parameter._prepare.executeUpdate();
            
            if(retorno > 0){
                JOptionPane.showMessageDialog(null,"CURSO CRIADO COM SUCESSO","AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO (DEETETIVE)", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void Criar_DetetiveAnexo(ODB_Anexo _detetive){
        try
        {
         
            ODB_Parameter.con = Conexao.CriarConexao();
            ODB_Parameter._statement = ODB_Parameter.con.createStatement();
            ODB_Parameter._prepare = ODB_Parameter.con.prepareStatement("INSERT INTO ODB_ANEXOS (DETETIVE, ARQUIVO)VALUES(?,?)");
            
            ODB_Parameter._prepare.setInt(1, _detetive.getCodigoDetetive());
            ODB_Parameter._prepare.setBytes(2, _detetive.bytes);
            
            int retorno = ODB_Parameter._prepare.executeUpdate();
            
            if(retorno > 0){
                JOptionPane.showMessageDialog(null,"ANEXO CRIADO COM SUCESSO","AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
            

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"ERRO (DEETETIVE)", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
