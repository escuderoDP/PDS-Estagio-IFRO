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
import mapeamento.Empresa;
import utilitario.Conectar;

/**
 *
 * @author Fabricio
 */
public class EmpresaDAO {
    // Método para cadastrar as informações do empresa
    public void cadastrar(Empresa e){
        Connection con = Conectar.getConectar();
        String sql = "INSERT INTO Empresa(nome, cnpj, telefone, horarioFunc) values(?, ?, ?, ?);";
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, e.getNome());
            stm.setString(2, e.getCnpj());
            stm.setString(3, e.getTelefone());
            stm.setString(4, e.getHorarioFunc());
            
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
    // Método para atualizar as informações do empresa
    public void atualizar(Empresa e){
        Connection con = Conectar.getConectar();
        String sql = "UPDATE Empresa SET nome = ?, cnpj = ?, telefone = ?, horarioFunc = ? WHERE id = ?;";
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, e.getNome());
            stm.setString(2, e.getCnpj());  
            stm.setString(3, e.getTelefone());
            stm.setString(4, e.getHorarioFunc());
            stm.setInt(5, e.getId_empresa());
            
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
    // Método para excluir o empresa
    public void excluir(Empresa e){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "DELETE FROM empresa WHERE id = ?;";
        
        // Pergunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir Empresa " +e.getNome()+" ?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        // Verifica se realmente deve excluir
        if(opcao ==  JOptionPane.YES_OPTION){
            
            try(PreparedStatement stm = con.prepareStatement(sql)){

                // Alterando os atributos do statement
                stm.setInt(1, e.getId_empresa());

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
    // Método para listar as empresas
    public List<Empresa> listarTodos(String busca){
        Connection con = Conectar.getConectar();
        
        List<Empresa> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Empresa ";
        
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
                
                // Cria uma instancia de empresa
                Empresa e = new Empresa();
                
                // Instancia do empresa recebe as informações do banco
                e.setId_empresa(resultado.getInt("id"));
                e.setNome(resultado.getString("nome"));
                e.setCnpj(resultado.getString("cnpj"));
                e.setTelefone(resultado.getString("telefone"));
                e.setHorarioFunc(resultado.getString("horarioFunc"));
                // Adiciona empresas na lista
                lista.add(e);

            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }
        
        return lista;
    }
}
