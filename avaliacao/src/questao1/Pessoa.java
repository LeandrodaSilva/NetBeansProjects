/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author ld_si
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String pNone, int pIdade) {
        this.nome = pNone;
        this.idade = pIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String none) {
        this.nome = none;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
