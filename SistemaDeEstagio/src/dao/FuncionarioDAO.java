/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mapeamento.Funcionario;
import utilitario.Conectar;

/**
 *
 * @author Aline
 */
public class FuncionarioDAO {
    
    // Método para cadastrar as informações do aluno
    public void cadastrar(Funcionario f){
        Connection con = Conectar.getConectar();
        
        // Sql para inserir
        String sql = "INSERT INTO Funcionario(nome, cpf, rg, formacao, datanasc, sexo, senha) values(?, ?, ?, ?, ?, ?, MD5(?));";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, f.getNome());
            stm.setString(2, f.getCpf());
            stm.setString(3, f.getRg());
            stm.setString(4, f.getFormacao());
            stm.setString(5, f.getDatanasc());
            stm.setString(6, f.getSexo());
            stm.setString(7, "systemestagioifro"+f.getSenha());

            
            // Executando cadastro
            stm.executeUpdate();
            
            // Finalizando conexões
            stm.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: "+ex);
        }
    }
    
    // Método para atualizar as informações do aluno
    public void atualizar(Funcionario f){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "UPDATE funcionario SET nome = ?, cpf = ?, rg = ?, formacao = ?, datanasc = ?, sexo = ? WHERE id = ?;";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, f.getNome());
            stm.setString(2, f.getCpf());
            stm.setString(3, f.getRg());
            stm.setString(4, f.getFormacao());
            stm.setString(5, f.getDatanasc());
            stm.setString(6, f.getSexo());
            stm.setInt(7, f.getId_funcionario());
            
            // Executando cadastro
            stm.executeUpdate();
            
            // Finalizando conexões
            stm.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }
        
    }
    
    public void atualizarSenha(Funcionario f){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "UPDATE funcionario SET senha = MD5(?) WHERE id = ?;";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, "systemestagioifro"+f.getSenha());
            stm.setInt(2, f.getId_funcionario());
            
            // Executando cadastro
            stm.executeUpdate();
            
            // Finalizando conexões
            stm.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Senha Atualizada com Sucesso!");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
        }
        
    }
    
    // Método para excluir o aluno
    public void excluir(Funcionario f){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "DELETE FROM funcionario WHERE id = ?;";
        
        // Pergunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir Funcionario " +f.getNome()+" ?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        // Verifica se realmente deve excluir
        if(opcao ==  JOptionPane.YES_OPTION){
            
            try(PreparedStatement stm = con.prepareStatement(sql)){

                // Alterando os atributos do statement
                stm.setInt(1, f.getId_funcionario());

                 // Executando cadastro
                stm.executeUpdate();

                // Finalizando conexões
                stm.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ex);
            }
            
        }
    }
    
    //Método para listar todos os funcionarios
    public List<Funcionario> listarTodos(String busca){
        Connection con = Conectar.getConectar();
        
        List<Funcionario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Funcionario ";
        
        if(busca != null && busca != ""){
            sql += " WHERE nome LIKE ? ";
        }
        sql += " ORDER BY nome;";
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            if(busca != null && busca != ""){
                stm.setString(1, "%"+busca+"%");
            }
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                
                // Cria uma instancia de aluno
                Funcionario f = new Funcionario();
                
                // Instancia do aluno recebe as informações do banco
                f.setId_funcionario(resultado.getInt("id"));
                f.setNome(resultado.getString("nome"));
                f.setCpf(resultado.getString("cpf"));
                f.setRg(resultado.getString("rg"));
                f.setFormacao(resultado.getString("formacao"));
                f.setDatanasc(resultado.getString("datanasc"));
                f.setSexo(resultado.getString("sexo"));
                f.setSenha(resultado.getString("senha"));
                // Adiciona funcionarios na lista
                lista.add(f);

            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }
        
        return lista;
    }
    
    public Funcionario login(String cpf, String senha){
        Connection con = Conectar.getConectar();
        Funcionario f = new Funcionario();
        String sql = "SELECT * FROM funcionario where cpf = ? and senha = md5(?)";
        try(PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, cpf);
            stm.setString(2, senha);
            ResultSet resultado = stm.executeQuery();
            resultado.next();
            if(resultado.getInt("id") > 0){
                f.setId_funcionario(resultado.getInt("id"));
                f.setNome(resultado.getString("nome"));
                f.setCpf(resultado.getString("cpf"));
                f.setRg(resultado.getString("rg"));
                f.setFormacao(resultado.getString("formacao"));
                f.setDatanasc(resultado.getString("datanasc"));
                f.setSexo(resultado.getString("sexo"));
                f.setSenha(resultado.getString("senha"));
            }else{
                System.out.println("Inválidos");
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, "ERRO AO VERIFICAR LOGIN! \n"+ex);
        }
        return f;
    }
}
