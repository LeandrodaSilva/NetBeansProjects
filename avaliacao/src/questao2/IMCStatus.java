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
public class IMCStatus {
    private double imc;
    private String classificacao;

    public IMCStatus(double imc, String classificacao) {
        this.imc = imc;
        this.classificacao = classificacao;
    }
    
    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    
}
