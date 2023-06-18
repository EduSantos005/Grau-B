package test;
import grauB.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	/**
	 * Teste para validar retorno verdadeiro ao adicionar produto na nota fiscal com método 
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
	 * Teste para validar retorno falso ao adicionar produto inválido na nota fiscal com método 
	 */
	@Test
	void testNotinha2() {
		Main main = new Main();
		int cpfNota = 4;
		String cpf = "12345";
		Carrinho car = new Carrinho();
		assertFalse(main.notinha(cpfNota, cpf, car));
	}

}
