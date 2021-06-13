/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dao.AlunoDAO;
import formularios.FormAluno;
import formularios.FormEmpresa;
import formularios.FormFuncionario;
import formularios.FormLogin;
import formularios.FormProfOrient;
import mapeamento.Aluno;

/**
 *
 * @author Millena Bello
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Teste
        
//        AlunoDAO alundao = new AlunoDAO();
//        
//        Aluno alun = new Aluno();
//        
//        alun.setNome("Millena Bello");;
//        alun.setCpf("123.456.789-00");
//        alun.setRg("1234567");
//        alun.setTelefone("(99)99999-9999");
//        alun.setDatanasc("99/99/9999");
//        alun.setSexo("Feminino");
//        alundao.cadastrar(alun);
//        
//        
//        alun.setId_aluno(1);
//        alun.setNome("Millena Bello2");
//        alun.setCpf("123.456.789-02");
//        alun.setRg("12345672");
//        alun.setTelefone("(99)99999-9990");
//        alun.setDatanasc("99/99/9990");
//        alun.setSexo("Femininoo");
//        
//        alundao.atualizar(alun);
//        
//        alundao.excluir(alun);
        
        FormLogin form = new FormLogin();
        form.main(args);

    }
    
}
