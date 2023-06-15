import static org.junit.jupiter.api.Assertions.*;

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
	@Test
	void testAdiciona2() {
		
		
		Estoque est = new Estoque();
		Livro liv = new Livro("Crepúsculo", 30.00d, 201, 0, "Stephanie Meyer", "Romance");
		
		assertFalse(est.adicionarProduto(liv));
	}

}
