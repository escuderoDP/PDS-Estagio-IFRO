/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
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
            cnpj = cnpj.replace(".", "");
            cnpj = cnpj.replace("-", "");
            cnpj = cnpj.replace("/", "");
            validacao = isCNPJ(cnpj);
        }
        return validacao;
    }
    //Método da internet
    public static boolean isCNPJ(String CNPJ) {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
            CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
            CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
            CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
            CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
           (CNPJ.length() != 14))
            return(false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i=11; i>=0; i--) {
            // converte o i-ésimo caractere do CNPJ em um número:
            // por exemplo, transforma o caractere '0' no inteiro 0
            // (48 eh a posição de '0' na tabela ASCII)
            num = (int)(CNPJ.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso + 1;
            if (peso == 10)
               peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
               dig13 = '0';
            else dig13 = (char)((11-r) + 48);

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i=12; i>=0; i--) {
              num = (int)(CNPJ.charAt(i)- 48);
              sm = sm + (num * peso);
              peso = peso + 1;
              if (peso == 10)
                 peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
               dig14 = '0';
            else dig14 = (char)((11-r) + 48);

            // Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
                return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public boolean validarCpf(String cpf){
        boolean validacao;
        if(cpf.equals("   .   .   -  ")){
            validacao = false;
        }else{
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            if(cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222" || cpf == "33333333333" ||
               cpf == "44444444444" || cpf == "55555555555" || cpf == "66666666666" || cpf == "77777777777" ||
               cpf == "88888888888" || cpf == "99999999999" || cpf.length() != 11){
                validacao = false;
            }else{
                String digito1 = Character.toString(cpf.charAt(9));
                String digito2 = Character.toString(cpf.charAt(10));
                int digit1 = Integer.parseInt(digito1);
                int digit2 = Integer.parseInt(digito2);
                validacao = (loopCpf(10, cpf, digit1) && loopCpf(11, cpf, digit2));
            }
        }
        
        return validacao;
    }
    
    private boolean loopCpf(int cont, String cpf, int digit){
        int i, soma = 0, rest;
        int max = cont - 1;
        for(i = 0; i < max; i++){
            String num = Character.toString(cpf.charAt(i));
            soma += Integer.parseInt(num) * cont;
            cont--;
        }
        rest = (soma * 10) % 11;
        boolean valid = (rest == digit);
        return valid;
    }
    
    public boolean validarData(String data){
        boolean validacao;
        if(data.equals("  /  /    ")){
            validacao = false;
        }else{
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String[] dat = data.split("/");
            Date d = new Date();
            Date newData, newDataAtual;
            String dataAtual = format.format(d);
            try{
                if(Integer.parseInt(dat[2]) >= 1900){
                    format.setLenient(false);
                    newData = format.parse(data);
                    newDataAtual = format.parse(dataAtual);
                    
                    validacao = newData.before(newDataAtual);
                }else{
                    validacao = false;
                }
                
            }catch(ParseException ex){
                validacao = false;
            }
        }
        return validacao;
    }
    
    public boolean validarTelefone(String telefone){
        boolean validacao;
        validacao = !telefone.equals("(  )     -    ");
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
                break;
            }else{
                validacao = "valido";
            }
        }
        return validacao;
    }
}
