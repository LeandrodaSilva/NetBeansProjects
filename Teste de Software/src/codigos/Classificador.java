/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author ld_si
 */
public class Classificador {

    /**
     * Método retorna em qual faixa etária da pessoa; Lança RuntimeException
     * quando a idade é invalida
     */
    public String definirFaixaEtaria(Pessoa p)
            throws RuntimeException {
        if (p.getIdade() < 0 || p.getIdade() >= 110) {
            throw new IllegalArgumentException("idade invalida");
        }

        int idade = p.getIdade();
        String tipo = "";

        if (idade <= 11) {
            tipo = "crianca";
        } else if (idade <= 18) {
            tipo = "adolescente";
        } else if (idade <= 59) {
            tipo = "adulto";
        } else {
            tipo = "idoso";
        }
        return p.getNome() + " eh " + tipo;
    }
}
