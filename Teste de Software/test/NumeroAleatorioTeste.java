/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import codigos.NumeroAleatorio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ld_si
 */
public class NumeroAleatorioTeste {
    
    NumeroAleatorio numeroAleatorio;
  
    
    public NumeroAleatorioTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        numeroAleatorio = new NumeroAleatorio();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TesteDeInicioNegativo() {
        int result = numeroAleatorio.gerarNumeroAleatorio(-1, 0);
        
        assertEquals(-1, result);
    }
    
    @Test
    public void TesteDeFimNegativo() {
        int result = numeroAleatorio.gerarNumeroAleatorio(1, -5);
        
        assertEquals(-1, result);
    }
    
    @Test
    public void TesteDeInicioIgualFim() {
        int result = numeroAleatorio.gerarNumeroAleatorio(1, 1);
        
        assertEquals(-1, result);
    }
    
    @Test
    public void TesteDeIntervaloValido() {
        int result = numeroAleatorio.gerarNumeroAleatorio(200, 3000);
        
        assertTrue(result >= 0 && result <= 2800);
    }
}
