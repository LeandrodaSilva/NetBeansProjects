/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import questao1.Classificador;
import questao1.Pessoa;
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
public class testeClassificador {
    
    public Classificador classificador;
    
    public testeClassificador() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        classificador = new Classificador();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void valorInvalido() {
      try{
          String result = classificador.definirFaixaEtaria(new Pessoa("Leandro", 200));
      }catch(RuntimeException rte){
          assertEquals("idade invalida", rte.getMessage());
      }
      
    }
    
    @Test
    public void valorCrianca() {  
        String result = classificador.definirFaixaEtaria(new Pessoa("Leandro", 10));
      
        assertEquals("Leandro é crianca", result);
    
    }
    
    @Test
    public void valorAdolescente() {  
        String result = classificador.definirFaixaEtaria(new Pessoa("Leandro", 15));
      
        assertEquals("Leandro é adolescente", result);
    
    }
    
    @Test
    public void valorAdulta() {  
        String result = classificador.definirFaixaEtaria(new Pessoa("Leandro", 50));
      
        assertEquals("Leandro é adulto", result);
    
    }
    
    @Test
    public void valorIdosa() {  
        String result = classificador.definirFaixaEtaria(new Pessoa("Leandro", 60));
      
        assertEquals("Leandro é idoso", result);
    
    }
}
