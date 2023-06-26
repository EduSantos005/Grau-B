package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import grauB.Livro;

public class ProdutoTest {
    /**
     * verifica se a condicao esta certa inserindo um valor negativo e depois um positivo
     * @author ulisses953
     */
    @Test
    void testSetCodigo() {
        var livro = new Livro();

        assertFalse(livro.setCodigo(-10));

        assertTrue(livro.setCodigo(10));

    }
    /**
     * teste referente ao valor do produto
     * @author ulisses953
     */
    @Test 
    void testGetValor(){
        var livro = new Livro();

        assertFalse(livro.setValor(-10));

        assertTrue(livro.setValor(10));
    }
    
}
