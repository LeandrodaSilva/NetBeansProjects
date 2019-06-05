/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import questao2.IMCCalculadora;
import questao2.IMCStatus;
import questao2.Pessoa;

/**
 *
 * @author ld_si
 */
public class testeIMC {
    
    public IMCCalculadora calculadora;
    
    public testeIMC() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calculadora = new IMCCalculadora();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testeExcecao() {
        try{
            IMCStatus imc = calculadora.calcular(new Pessoa("Leandro",-5,1.80));
        }catch(RuntimeException rte){
            assertEquals("Altura ou peso incorreto", rte.getMessage());
        }
    }
    
    @Test
    public void testeAbaixo(){
        IMCStatus imc = calculadora.calcular(new Pessoa("Leandro",40,1.80));
        assertEquals("abaixo do peso", imc.getClassificacao());
    }
    
    @Test
    public void testeNormal(){
        IMCStatus imc = calculadora.calcular(new Pessoa("Leandro",68,1.80));
        assertEquals("normal", imc.getClassificacao());
    }
    
    @Test
    public void testeAcima(){
        IMCStatus imc = calculadora.calcular(new Pessoa("Leandro",85,1.80));
        assertEquals("acima do peso", imc.getClassificacao());
    }
    
    @Test
    public void testeObeso(){
        IMCStatus imc = calculadora.calcular(new Pessoa("Leandro",100,1.80));
        assertEquals("obeso", imc.getClassificacao());
    }
    
}
