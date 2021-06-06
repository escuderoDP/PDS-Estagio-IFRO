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
import mapeamento.ProfOrient;
import utilitario.Conectar;

/**
 *
 * @author Aline
 */
public class ProfOrientDAO {
    // Método para cadastrar as informações do aluno
    public void cadastrar(ProfOrient po){
        Connection con = Conectar.getConectar();
        
        // Sql para inserir
        String sql = "INSERT INTO ProfessorOrientador(nome, cpf, rg, formacao, datanasc, sexo, senha) values(?, ?, ?, ?, ?, ?, ?);";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, po.getNome());
            stm.setString(2, po.getCpf());
            stm.setString(3, po.getRg());
            stm.setString(4, po.getFormacao());
            stm.setString(5, po.getDatanasc());
            stm.setString(6, po.getSexo());
            stm.setString(7, po.getSenha());

            
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
    public void atualizar(ProfOrient po){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "UPDATE ProfessorOrientador SET nome = ?, cpf = ?, rg = ?, formacao = ?, datanasc = ?, sexo = ?, senha = ? WHERE id = ?;";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, po.getNome());
            stm.setString(2, po.getCpf());
            stm.setString(3, po.getRg());
            stm.setString(4, po.getFormacao());
            stm.setString(5, po.getDatanasc());
            stm.setString(6, po.getSexo());
            stm.setString(7, po.getSenha());
            stm.setInt(8, po.getId_funcionario());
            
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
    public void excluir(ProfOrient po){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "DELETE FROM ProfessorOrientador WHERE id = ?;";
        
        // Pergunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir Prof. Orientador " +po.getNome()+" ?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        // Verifica se realmente deve excluir
        if(opcao ==  JOptionPane.YES_OPTION){
            
            try(PreparedStatement stm = con.prepareStatement(sql)){

                // Alterando os atributos do statement
                stm.setInt(1, po.getId_funcionario());

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
    public List<ProfOrient> listarTodos(){
        Connection con = Conectar.getConectar();
        
        List<ProfOrient> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM ProfessorOrientador ORDER BY nome;";
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                
                // Cria uma instancia de aluno
                ProfOrient po = new ProfOrient();
                
                // Instancia do aluno recebe as informações do banco
                po.setId_funcionario(resultado.getInt("id"));
                po.setNome(resultado.getString("nome"));
                po.setCpf(resultado.getString("cpf"));
                po.setRg(resultado.getString("rg"));
                po.setFormacao(resultado.getString("formacao"));
                po.setDatanasc(resultado.getString("datanasc"));
                po.setSexo(resultado.getString("sexo"));
                po.setSenha(resultado.getString("senha"));
                // Adiciona funcionarios na lista
                lista.add(po);

            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }
        
        return lista;
    }
    
}
