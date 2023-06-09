
import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> carrinho;
	private Estoque estoque;

	// #region funcoes

	/**
	 * Adiciona o produto no carrinho
	 * @param produto produto a ser retirado no estoque
	 * @param quantidade quantidade a ser tirada no estoque
	 * @return
	 */
	private boolean addicionar(Produto produto, int quantidade) {
		try {
			// verifica se existe o produto no estoque
			if (null == estoque.localizarProduto(produto.getCodigo())) {
				throw new Exception("Produto nao esta localiado no estoque");
			}

			// verificando se o produto possui a quantidade desejada a ser retirada
			if (0 > produto.getQuantidade() - quantidade) {
				throw new Exception("Valor de quantidade invalida");
			}
			// adicionar no carrinho
			produto.setQuantidade(produto.getQuantidade() - quantidade);
			carrinho.add(produto);

			// atualiando o estoque
			if (produto.getQuantidade() == 0) {
				estoque.excluir(produto.getCodigo());
			} else {
				estoque.update(produto);
			}

			return true;

		} catch (Exception e) {
			System.err.println(e);
			return false;
		}		
	}
	private boolean remove(int codigo){
		
	}

	// #endregion

}