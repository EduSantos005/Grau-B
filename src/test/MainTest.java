package test;

import grauB.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	/**
	 * Teste para validar retorno verdadeiro ao adicionar produto na nota fiscal com
	 * método
	 */

	@Test
	void testNotinha1() {
		Main main = new Main();
		int cpfNota = 1;
		String cpf = "12345";
		Carrinho car = new Carrinho();
		assertTrue(main.notinha(cpfNota, cpf, car));
	}

	/**
	 * Teste para validar retorno falso ao adicionar produto inválido na nota fiscal
	 * com método
	 */
	@Test
	void testNotinha2() {
		Main main = new Main();
		int cpfNota = 4;
		String cpf = "12345";
		Carrinho car = new Carrinho();
		assertFalse(main.notinha(cpfNota, cpf, car));
	}

	/*
	 * Teste que valida retorno de registro de Cliente e Admin
	 */
	@Test
	void testRegisterAdm() {
	    Admin expectedAdmin = new Admin("Arthur", "123456", "arthur@gmail.com", "arthur123");
	    Admin actualAdmin = Main.registerAdm();
	    
	    assertEquals(expectedAdmin, actualAdmin);
	}
	
	@Test
	void testRegisterCliente() {
	    Cliente expectedCliente = new Admin("Arthur", "123456", "arthur@gmail.com", "arthur123");
	    Cliente actualCliente = Main.registerCliente();
	    
	    assertEquals(expectedCliente, actualCliente);
	}

}
