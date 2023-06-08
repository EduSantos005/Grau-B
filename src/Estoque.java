import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque;

	// #region funcao
	/**
	 * Localizar um produto do estoque por meio da instancia produto;
	 * 
	 * @return retorna a istancia do produto, se caso nao encontrar retorna nulo
	 */
	public Produto localizaProduto(Produto produto) {
		return localizaProduto(produto.getCodigo());
	}

	/**
	 * Localizar um produto do estoque por meio do codigo;
	 * 
	 * @return retorna a istancia do produto, se caso nao encontrar retorna nulo
	 */
	public Produto localizaProduto(int codigo) {
		try {
			for (Produto p : estoque) {
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
	 * Adiciona produtos ao estoque;
	 * 
	 * @param produto
	 * @return
	 */
	public boolean adicionarProduto(Produto produto) {
		try {
			estoque.add(produto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Funcao para remover produto no estoque
	 * 
	 * @param produto
	 * @return retorna true se caso o produto for removido, false se caso o produto
	 *         nao for escluido
	 */
	public boolean removerProdutoEstoque(Produto produto) {
		try {
			estoque.remove(produto);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	/**
	 * 
	 * @param codigo codigo do produto
	 * @return 
	 */
	public boolean removerProdutoEstoque(Integer codigo){
		for (Produto produto : estoque) {
			if (produto.getCodigo() == codigo) {
				return removerProdutoEstoque(produto);
			}
		}
		return false;
	}

	/**
	 * 
	 * @param codigo codigo do produto que deseja subtituir
	 * @param produto novo produto para subtituir
	 * @return
	 */
	public boolean updateProdutoEstoque(int codigo, Produto produto){
		try {
			if(true == removerProdutoEstoque(codigo)){
				estoque.add(produto);
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Estoque:" + estoque;
	}

	// #endregion
	

	// #region constructor
	/**
	 * Construto base do estoque,
	 * 
	 * @param estoque
	 * 
	 */
	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}
	// #endregion

}
