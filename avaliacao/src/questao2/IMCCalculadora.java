/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author ld_si
 */
public class IMCCalculadora {
    
    public IMCStatus calcular(Pessoa p){
        double peso = p.getPeso();
        double altura = p.getAltura();
        
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Altura ou peso incorreto");
        }
        
        double imc = peso / (altura * altura);
        String classificacao = "";
        
        if (imc < 18.5) {
            classificacao = "abaixo do peso";
        }else if(imc < 25){
            classificacao = "normal";
        }else if(imc < 30){
            classificacao = "acima do peso";
        }else {
            classificacao = "obeso";
        }
        
        return new IMCStatus(imc,classificacao);
    }
    
}
