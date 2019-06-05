/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import codigos.Classificador;
import codigos.Pessoa;
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
public class ClassificadorTeste {

    Classificador cl;

    public ClassificadorTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cl = new Classificador();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testeIdadeInvalida() {
        Pessoa pe = new Pessoa("Leandro", 120);
        try {
            String result = cl.definirFaixaEtaria(new Pessoa("Fulano", 120));
            fail("não deveria chegar aqui!");
        } catch (RuntimeException ex) {
            assertEquals("idade invalida", ex.getMessage());
        }

    }

    @Test
    public void testeCrianca() {
        Pessoa pe = new Pessoa("Fulano", 11);
        String result = cl.definirFaixaEtaria(pe);
        assertEquals("Fulano eh crianca", result);
    }

    @Test
    public void testeAdolescente() {
        Pessoa pe = new Pessoa("Fulano", 14);
        String result = cl.definirFaixaEtaria(pe);
        assertEquals("Fulano eh adolescente", result);
    }

    @Test
    public void testeAdulto() {
        Pessoa pe = new Pessoa("Fulano", 40);
        String result = cl.definirFaixaEtaria(pe);
        assertEquals("Fulano eh adulto", result);
    }

    @Test
    public void testeIdosa() {
        Pessoa pe = new Pessoa("Fulano", 70);
        String result = cl.definirFaixaEtaria(pe);
        assertEquals("Fulano eh idoso", result);
    }
}
