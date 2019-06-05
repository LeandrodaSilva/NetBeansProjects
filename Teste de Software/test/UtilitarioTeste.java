/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import codigos.Extremos;
import codigos.Utilitario;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class UtilitarioTeste {
    
    Utilitario ut;
    
    public UtilitarioTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ut = new Utilitario();
    }
    
    @After
    public void tearDown() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testeVetorUm() throws Exception {
        Extremos ex = ut.acharExtremos(new int[]{1,2,3,4,5,6});
        
        assertEquals(1, ex.getMenor());
        assertEquals(6, ex.getMaior());
        assertEquals(5, ex.getIndiceMaior());
        assertEquals(0, ex.getIndiceMenor());
    }
    
    @Test
    public void testeVetorDois() throws Exception {
        Extremos ex = ut.acharExtremos(new int[]{1,99,3,-5,8});
        
        assertEquals(-5, ex.getMenor());
        assertEquals(99, ex.getMaior());
        assertEquals(1, ex.getIndiceMaior());
        assertEquals(3, ex.getIndiceMenor());
    }
    
    @Test
    public void testeVetorVazio(){
        int[] vector = new int[0];
        try {
            Extremos ex = ut.acharExtremos(vector);
            fail("Algo de errado não está certo");
        } catch (Exception ex1) {
            assertEquals("vetor com zero elementos", ex1.getMessage());
        }
    }
    
    @Test
    public void testeVetorNulo(){
        int[] vector = null;
        try {
            Extremos ex = ut.acharExtremos(vector);
            fail("Algo de errado não está certo");
        } catch (Exception ex1) {
            assertEquals("vetor nao pode ser nulo", ex1.getMessage());
        }
    }
}
