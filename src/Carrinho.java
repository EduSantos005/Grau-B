
import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> carrinho;
	private Estoque estoque;

	// #region fucncoes

	/**
	 * Funcao que visa adicionar um produto no carrinho, verificando a quantidade
	 * atual do estoque e diminuindo a quantidade que o usuario digitou, se a
	 * quantidade for menor que 0 o produto e excluido do estoque
	 * @return 
	 * @author ulisses953
	 */

	public boolean adicionarCarrinho(int codigo, int quantidade) {
		try {
			Produto produto = estoque.localizaProduto(codigo);
			if (produto != null) {
				produto.setQuantidade(produto.getQuantidade() - quantidade);
				if (0 <= produto.getQuantidade()) {
					produto.setQuantidade(quantidade);
					carrinho.add(produto);
					estoque.updateProdutoEstoque(produto.getCodigo(), produto);
					return true;
				} else {
					if (0 > produto.getQuantidade()) {
						estoque.removerProdutoEstoque(produto);
						produto.setQuantidade(quantidade);
						carrinho.add(produto);
						return true;
					}
					return false;
				}
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}

	/**
	 * funcao que visa calcular o valor total do carrinho
	 * 
	 * @return retorna o valor total
	 */
	public double verValorTotal() {
		double valor = 0;
		for (Produto produto : carrinho) {
			valor += produto.getValor() * produto.getQuantidade();
		}
		return valor;
	}

	//public boolean removerProdutoCarrinho() {

	//}

	// #endregion

	// #region constructor

	public Estoque verEstoque() {
		return estoque;
	}

	// #endregion
}