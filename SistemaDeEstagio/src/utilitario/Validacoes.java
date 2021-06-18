/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Millena Bello
 */
public class Validacoes {
    public boolean validarCnpj(String cnpj){
        boolean validacao;
        if(cnpj.equals("  .   .   /    -  ")){
            validacao = false;
        }else{
            validacao = true;
        }
        return validacao;
    }
    
    public boolean validarCpf(String cpf){
        boolean validacao;
        if(cpf.equals("   .   .   -  ")){
            validacao = false;
        }else{
            validacao = true;
        }
        
        return validacao;
    }
    
    public boolean validarData(String data){
        boolean validacao;
        if(data.equals("  /  /    ")){
            validacao = false;
        }else{
            validacao = true;
        }
        return validacao;
    }
    
    public boolean validarTelefone(String telefone){
        boolean validacao;
        if(telefone.equals("(  )     -    ")){
            validacao = false;
        }else{
            validacao = true;
        }
        return validacao;
    }
    
    public String validarCampos(ArrayList<JTextField> array){
        String validacao = "valido";
        for(JTextField txt : array){
            boolean valido;
            String text = txt.getText();
            if(text.equals("")){
                valido = false;
                validacao = "PREENCHA TODOS OS CAMPOS!";
            }
            else{
                String name = txt.getName();
                if (name == null){
                    name = "null";
                }
                switch (name) {
                    case "cpf":
                        valido = this.validarCpf(text);
                        validacao = "CPF INVALIDO!";
                        break;
                    case "data":
                        valido = this.validarData(text);
                        validacao = "DATA INVALIDA!";
                        break;
                    case "telefone":
                        valido = this.validarTelefone(text);
                        validacao = "TELEFONE INVALIDO!";
                        break;
                    case "cnpj":
                        valido = this.validarTelefone(text);
                        validacao = "CNPJ INVALIDO!";
                        break;
                    default:
                        valido = true;
                        break;
                }
            }
            if(valido == false){
                System.out.println(validacao);
                break;
            }else{
                validacao = "valido";
            }
        }
        return validacao;
    }
}
