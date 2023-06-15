import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CarrinhoTest {

	/**
	 * Teste que adiciona produto ao carrinho e confirma retorno true ao adicionar
	 * Teste que adiciona produto ao carrinho e confirma retorno false ao não adicionar
	 */
	@Test
	void testAdiciona() {


		Estoque est = new Estoque();
		Livro liv = new Livro("Crepúsculo", 30.00d, 201, 1, "Stephanie Meyer", "Romance");
		est.adicionarProduto(liv);

		Carrinho carrinho = new Carrinho(new ArrayList<>());
		assertTrue(carrinho.adicionarProduto(liv));
		assertFalse(carrinho.adicionarProduto(liv));
	}

	/**
	 * Teste que remove produto ao carrinho e confirma retorno true ao remover
	 * Teste que remove produto ao carrinho e confirma retorno false ao não remover
	 */
	@Test
	void testRemove() {


		Estoque est = new Estoque();
		Livro liv = new Livro("Crepúsculo", 30.00d, 201, 1, "Stephanie Meyer", "Romance");
		est.adicionarProduto(liv);

		Carrinho carrinho = new Carrinho(new ArrayList<>());
		carrinho.adicionarProduto(liv);
		assertTrue(carrinho.removerProduto(liv));
		assertFalse(carrinho.removerProduto(liv));
	}
}
