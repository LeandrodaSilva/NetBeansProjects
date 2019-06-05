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
import java.util.Random;

public class NumeroAleatorio {

    /**
     * O método deve receber dois inteiros que representam o início e o fim de
     * um intervalo e retornar um número aleatório que se encontra dentro do
     * intervalo estabelecido, ou seja, [inicio, fim]. Caso o início do
     * intervalo ou o fim do intervalo sejam menores que zero, o método deve
     * retornar -1. O método também retorna -1 quando o inteiro representando o
     * início do intervalo for maior ou igual ao inteiro representando o fim do
     * intervalo. 
*
     */
    public int gerarNumeroAleatorio(int inicio, int fim) {

        if (inicio < 0 || fim < 0) {
            return -1;
        }

        if (inicio >= fim) {
            return -1;
        }

        int diff = fim - inicio + 1;
        System.out.println("-->" + diff);

        Random random = new Random();
        int tInt = random.nextInt(diff); //esse método retorna um número aleatório entre 0 e diff [ 0, diff [
        return inicio + tInt;
    }
}