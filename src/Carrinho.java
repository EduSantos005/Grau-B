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
	private boolean adicionar(Produto produto, int quantidade) {
		try {
			// verifica se existe o produto no estoque
			if (null == estoque.localizar(produto.getCodigo())) {
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

	/**
	 * Remove produto do carrinho
	 * @param codigo
	 * @return
	 */
	public boolean remove(int codigo){
		try {
			//localiza o mesmo produto tanto no carrinho como no estoque
			Produto produtoCarrinho = localizar(codigo);
			Produto produtoEstoque = estoque.localizar(codigo);

			//verifica se ha produto no carrinho
			if (produtoCarrinho == null) {
				throw new Exception("Produto nao localizado no carrinho");
			}

			//verifica se ha produto no Estoque
			if (produtoEstoque == null) {
				throw new Exception("Produto nao localizado no carrinho");
			}
			//pega reatribui o produto do estoque 
			produtoEstoque.setQuantidade(produtoEstoque.getQuantidade() + produtoCarrinho.getQuantidade());
			
			//remove do carrinho
			this.remove(produtoCarrinho.getCodigo());

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * Localiza produto no carriho pelo codigo
	 * @param codigo
	 * @return
	 */
	public Produto localizar(int codigo){
		try {
			for (Produto p : carrinho) {
				if (p.getCodigo() == codigo) {
					return p;
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	/**
	 * Localiza o produto no carrinho por produto
	 * @param produto
	 * @return
	 */
	public Produto localizar(Produto produto){
		return localizar(produto.getCodigo());
	}

	// #endregion

}