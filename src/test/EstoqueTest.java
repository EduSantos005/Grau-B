package test;

import grauB.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EstoqueTest {
	/**
	 * Teste que adiciona produto ao estoque e confirma retorno true ao adicionar
	 */
	@Test
	void testAdiciona1() {
		Estoque est = new Estoque();
		Livro liv = new Livro("Crepúsculo", 30.00d, 201, 4, "Stephanie Meyer", "Romance");
		assertTrue(est.adicionarProduto(liv));
	}

	/**
	 * Teste que adiciona produto ao estoque e confirma retorno false ao não
	 * adicionar
	 */
	@Test
	void testAdiciona2() {
		Estoque est = new Estoque();
		Livro liv = new Livro("Crepúsculo", 30.00d, 201, 0, "Stephanie Meyer", "Romance");

		assertFalse(est.adicionarProduto(liv));
	}

	@Test
	void testAdicionarProduto() {
		var est = new Estoque();
		var p = new Eletrodoméstico();
		p.setQuantidade(10);

		assertTrue(est.adicionarProduto(p));
		p.setQuantidade(-10);
		assertFalse(est.adicionarProduto(p));

	}

	@Test
	void testLocalizar() {
		var a = new Estoque();

		a.adicionarProduto(new Eletrodoméstico(null, 100, 1, 10, null));

		assertNotNull(a.localizar(1));

		assertNull(a.localizar(0));

	}

}
