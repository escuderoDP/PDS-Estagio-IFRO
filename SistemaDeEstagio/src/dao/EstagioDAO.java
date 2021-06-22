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
import mapeamento.Empresa;
import mapeamento.Estagio;
import mapeamento.FuncionarioEmpresa;
import mapeamento.ProfOrient;
import utilitario.Conectar;

/**
 *
 * @author Guilherme
 */
public class EstagioDAO {
    // Método para cadastrar as informações do Estagio
    public void cadastrar(Estagio est){
        Connection con = Conectar.getConectar();
        
        // Sql para inserir
        String sql = "INSERT INTO Estagio(situacao, funcionarioEmp_fk, proforient_fk, aluno_fk) values(?, ?, ?, ?);";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
           stm.setString(1, est.getSituacao());
           stm.setInt(2, est.getFucionarioEmp_fk().getId_funcionarioEmp());
           stm.setInt(3, est.getProfOrient_fk().getId_funcionario());
           stm.setInt(4, est.getAluno_fk().getId_aluno());
            
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
    
    // Método para atualizar as informações do estagio
    public void atualizar(Estagio est){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "UPDATE Estagio SET situacao = ?, funcionarioEmp_fk = ?, proforient_fk = ?, aluno_fk = ? WHERE id = ?;";
        
        // Preparação de statement
        try(PreparedStatement stm = con.prepareStatement(sql)){
            
            // Alterando os atributos do statement
            stm.setString(1, est.getSituacao());
            stm.setInt(2, est.getFucionarioEmp_fk().getId_funcionarioEmp());
            stm.setInt(3, est.getProfOrient_fk().getId_funcionario());
            stm.setInt(4, est.getAluno_fk().getId_aluno());
            stm.setInt(5, est.getId());
            
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
    
    // Método para excluir o Estagio
    public void excluir(Estagio est){
        Connection con = Conectar.getConectar();
        
        // Sql para atualizar
        String sql = "DELETE FROM Estagio WHERE id = ?;";
        
        // Pergunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Excluir o Estágio do aluno " +est.getAluno_fk().getNome()+ " ?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        // Verifica se realmente deve excluir
        if(opcao ==  JOptionPane.YES_OPTION){
            
            try(PreparedStatement stm = con.prepareStatement(sql)){

                // Alterando os atributos do statement
                stm.setInt(1, est.getId());

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
    
    public List<Estagio> listarTodos(String busca){
        Connection con = Conectar.getConectar();
        
        List<Estagio> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM Estagio INNER JOIN Aluno ON Aluno.id = Estagio.aluno_fk INNER JOIN ProfessorOrientador ON ProfessorOrientador.id = Estagio.proforient_fk INNER JOIN FuncionarioEmpresa ON FuncionarioEmpresa.id = Estagio.funcionarioEmp_fk INNER JOIN Empresa ON Empresa.id = FuncionarioEmpresa.empresa_fk ";
        if(busca != null && busca != ""){
            sql += " WHERE Aluno.nome LIKE ? or ProfessorOrientador.nome LIKE ? or Empresa.nome LIKE ?";
        }
        try(PreparedStatement stm = con.prepareStatement(sql)){
            if(busca != null && busca != ""){
                stm.setString(1, "%"+busca+"%");
                stm.setString(2, "%"+busca+"%");
                stm.setString(3, "%"+busca+"%");
            }
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                
                Aluno a = new Aluno();
                a.setId_aluno(resultado.getInt("Aluno.id"));
                a.setNome(resultado.getString("Aluno.nome"));
                a.setCpf(resultado.getString("Aluno.cpf"));
                a.setRg(resultado.getString("Aluno.rg"));
                a.setTelefone(resultado.getString("Aluno.telefone"));
                a.setDatanasc(resultado.getString("Aluno.datanasc"));
                a.setSexo(resultado.getString("Aluno.sexo"));
                a.setTurma(resultado.getString("Aluno.turma"));
                
                ProfOrient po = new ProfOrient();
                po.setId_funcionario(resultado.getInt("ProfessorOrientador.id"));
                po.setNome(resultado.getString("ProfessorOrientador.nome"));
                po.setCpf(resultado.getString("ProfessorOrientador.cpf"));
                po.setRg(resultado.getString("ProfessorOrientador.rg"));
                po.setFormacao(resultado.getString("ProfessorOrientador.formacao"));
                po.setDatanasc(resultado.getString("ProfessorOrientador.datanasc"));
                po.setSexo(resultado.getString("ProfessorOrientador.sexo"));
                
                Empresa e = new Empresa();
                e.setId_empresa(resultado.getInt("Empresa.id"));
                e.setNome(resultado.getString("Empresa.nome"));
                e.setCnpj(resultado.getString("Empresa.cnpj"));
                e.setTelefone(resultado.getString("Empresa.telefone"));
                e.setHorarioFunc(resultado.getString("Empresa.horarioFunc"));
                
                FuncionarioEmpresa fe = new FuncionarioEmpresa();
                fe.setId_funcionarioEmp(resultado.getInt("FuncionarioEmpresa.id"));
                fe.setNome(resultado.getString("FuncionarioEmpresa.nome"));
                fe.setCpf(resultado.getString("FuncionarioEmpresa.cpf"));
                fe.setRg(resultado.getString("FuncionarioEmpresa.rg"));
                fe.setFormacao(resultado.getString("FuncionarioEmpresa.formacao"));
                fe.setCargo(resultado.getString("FuncionarioEmpresa.cargo"));
                fe.setDatanasc(resultado.getString("FuncionarioEmpresa.datanasc"));
                fe.setSexo(resultado.getString("FuncionarioEmpresa.sexo"));                
                
                fe.setEmpresa_fk(e);
                
                // Cria uma instancia de estagio
                Estagio est = new Estagio();
                est.setId(resultado.getInt("Estagio.id"));
                est.setSituacao(resultado.getString("Estagio.situacao"));
                est.setFucionarioEmp_fk(fe);
                est.setProfOrient_fk(po);
                est.setAluno_fk(a);
                
                // Adiciona Estagio na lista
                lista.add(est);

            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }
        
        return lista;
    }
}
