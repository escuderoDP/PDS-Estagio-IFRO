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
import mapeamento.FuncionarioEmpresa;
import utilitario.Conectar;

/**
 *
 * @author Guilherme
 */
public class FuncionarioEmpDAO {
    // Método para cadastrar as informações do funcionarioempresa
    public void cadastrar(FuncionarioEmpresa fe){
        Connection con = Conectar.getConectar();
        
        // Sql para inserir
        String sql = "INSERT INTO FuncionarioEmpresa(nome, cpf, rg, formacao, cargo, datanasc, sexo, empresa_fk) values(?, ?, ?, ?, ?, ?, ?, ?);";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, fe.getNome());
            stm.setString(2, fe.getCpf());
            stm.setString(3, fe.getRg());
            stm.setString(4, fe.getFormacao());
            stm.setString(5, fe.getCargo());
            stm.setString(6, fe.getDatanasc());
            stm.setString(7, fe.getSexo());
            stm.setInt(8, fe.getEmpresa_fk().getId_empresa());
            
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
    
    // Método para atualizar as informações do funcionarioempresa
    public void atualizar(FuncionarioEmpresa fe){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "UPDATE FuncionarioEmpresa SET nome = ?, cpf = ?, rg = ?, formacao = ?, cargo = ? datanasc = ?, sexo = ?, empresa_fk = ? WHERE id = ?;";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, fe.getNome());
            stm.setString(2, fe.getCpf());
            stm.setString(3, fe.getRg());
            stm.setString(4, fe.getFormacao());
            stm.setString(5, fe.getCargo());
            stm.setString(6, fe.getDatanasc());
            stm.setString(7, fe.getSexo());
            stm.setInt(8, fe.getEmpresa_fk().getId_empresa());
            stm.setInt(9, fe.getId_funcionarioEmp());
            
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
    
    // Método para excluir o FuncionarioEmpresa
    public void excluir(FuncionarioEmpresa fe){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "DELETE FROM FuncionarioEmpresa WHERE id = ?;";
        
        // Pergunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir Funcionario " +fe.getNome()+" da empresa "+fe.getEmpresa_fk().getNome()+ " ?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        // Verifica se realmente deve excluir
        if(opcao ==  JOptionPane.YES_OPTION){
            
            try(PreparedStatement stm = con.prepareStatement(sql)){

                // Alterando os atributos do statement
                stm.setInt(1, fe.getId_funcionarioEmp());

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
    
    public List<FuncionarioEmpresa> listarTodos(){
        Connection con = Conectar.getConectar();
        
        List<FuncionarioEmpresa> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM FuncionarioEmpresa INNER JOIN Empresa ON FuncionarioEmpresa.empresa_fk = Empresa.id ORDER BY nome;";
        
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                
                // Cria uma instancia de funcionarioEmpresa
                FuncionarioEmpresa fe = new FuncionarioEmpresa();
                
                // Instancia do funcionário da empresa recebe as informações do banco
                fe.setId_funcionarioEmp(resultado.getInt("FuncionarioEmpresa.id"));
                fe.setNome(resultado.getString("FuncionarioEmpresa.nome"));
                fe.setCpf(resultado.getString("FuncionarioEmpresa.cpf"));
                fe.setRg(resultado.getString("FuncionarioEmpresa.rg"));
                fe.setFormacao(resultado.getString("FuncionarioEmpresa.formacao"));
                fe.setCargo(resultado.getString("FuncionarioEmpresa.cargo"));
                fe.setDatanasc(resultado.getString("FuncionarioEmpresa.datanasc"));
                fe.setSexo(resultado.getString("FuncionarioEmpresa.sexo"));
                
                Empresa e = new Empresa();
                e.setId_empresa(resultado.getInt("Empresa.id"));
                e.setNome(resultado.getString("Empresa.nome"));
                e.setCnpj(resultado.getString("Empresa.cnpj"));
                e.setTelefone(resultado.getString("Empresa.telefone"));
                e.setHorarioFunc(resultado.getString("Empresa.horarioFunc"));
                
                fe.setEmpresa_fk(e);
                // Adiciona funcionariosEmpresa na lista
                lista.add(fe);

            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }
        
        return lista;
    }
}
