package test;

import grauB.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    /**
     * 
     * @autor ulisses953
     */
    @Test
    void testSetEmail() {
        Cliente a = new Cliente();
        assertFalse(a.setEmail("ulisseskranzdamotta"));
        assertTrue(a.setEmail("ulisseskranzdamotta@gmail.com"));
    }

    /**
     * @autor ulisses953
     */
    @Test
    void testConfereSenha() {
        var a = new Cliente();

        a.setSenha("123");
        assertTrue(a.confereSenha("123"));
        assertFalse(a.confereSenha("222"));
    

    }
}
