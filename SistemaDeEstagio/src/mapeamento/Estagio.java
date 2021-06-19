/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento;

/**
 *
 * @author Gulherme
 */
public class Estagio {
    private int id;
    private String situacao;
    private FuncionarioEmpresa fucionarioEmp_fk;
    private ProfOrient profOrient_fk;
    private Aluno aluno_fk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public FuncionarioEmpresa getFucionarioEmp_fk() {
        return fucionarioEmp_fk;
    }

    public void setFucionarioEmp_fk(FuncionarioEmpresa fucionarioEmp_fk) {
        this.fucionarioEmp_fk = fucionarioEmp_fk;
    }

    public ProfOrient getProfOrient_fk() {
        return profOrient_fk;
    }

    public void setProfOrient_fk(ProfOrient profOrient_fk) {
        this.profOrient_fk = profOrient_fk;
    }

    public Aluno getAluno_fk() {
        return aluno_fk;
    }

    public void setAluno_fk(Aluno aluno_fk) {
        this.aluno_fk = aluno_fk;
    }
    
}
