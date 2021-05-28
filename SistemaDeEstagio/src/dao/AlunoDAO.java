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
import mapeamento.Aluno;
import utilitario.Conectar;

/**
 *
 * @author Millena Bello
 */
public class AlunoDAO {
    
    // Método para cadastrar as informações do aluno
    public void cadastrar(Aluno a){
        Connection con = Conectar.getConectar();
        
        // Sql para inserir
        String sql = "INSERT INTO Aluno(nome, cpf, rg, telefone, datanasc) values(?, ?, ?, ?, ?);";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, a.getNome());
            stm.setString(2, a.getCpf());
            stm.setString(3, a.getRg());
            stm.setString(4, a.getTelefone());
            stm.setString(5, a.getDatanasc());
            
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
    public void atualizar(Aluno a){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "UPDATE Aluno SET nome = ?, cpf = ?, rg = ?, telefone = ?, datanasc = ? WHERE id = ?;";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, a.getNome());
            stm.setString(2, a.getCpf());
            stm.setString(3, a.getRg());
            stm.setString(4, a.getTelefone());
            stm.setString(5, a.getDatanasc());
            stm.setInt(6, a.getId_aluno());
            
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
    
    // Método para excluir o aluno
    public void excluir(Aluno a){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "DELETE FROM aluno WHERE id = ?;";
        
        // Pergunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir Aluno" +a.getNome()+" ?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        // Verifica se realmente deve excluir
        if(opcao ==  JOptionPane.YES_OPTION){
            
            try(PreparedStatement stm = con.prepareStatement(sql)){

                // Alterando os atributos do statement
                stm.setInt(1, a.getId_aluno());

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
    
    public List<Aluno> listarTodos(){
        Connection con = Conectar.getConectar();
        
        List<Aluno> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Aluno ORDER BY nome;";
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                
                // Cria uma instancia de aluno
                Aluno a = new Aluno();
                
                // Instancia do aluno recebe as informações do banco
                a.setId_aluno(resultado.getInt("id"));
                a.setNome(resultado.getString("nome"));
                a.setCpf(resultado.getString("cpf"));
                a.setRg(resultado.getString("rg"));
                a.setTelefone(resultado.getString("telefone"));
                a.setDatanasc(resultado.getString("datanasc"));
                
                // Adiciona alunos na lista
                lista.add(a);

            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }
        
        return lista;
    }
    
}
