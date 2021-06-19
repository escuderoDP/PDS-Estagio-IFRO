/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento;

/**
 *
 * @author Millena Bello
 */
public class FuncionarioEmpresa {
    
    private int id_funcionarioEmp;
    private String nome;
    private String cpf;
    private String rg;
    private String formacao;
    private String cargo;
    private String datanasc;
    private String sexo;
    private Empresa empresa_fk;

    public int getId_funcionarioEmp() {
        return id_funcionarioEmp;
    }

    public void setId_funcionarioEmp(int id_funcionarioEmp) {
        this.id_funcionarioEmp = id_funcionarioEmp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Empresa getEmpresa_fk() {
        return empresa_fk;
    }

    public void setEmpresa_fk(Empresa empresa_fk) {
        this.empresa_fk = empresa_fk;
    }    

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
