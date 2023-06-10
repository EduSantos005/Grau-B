import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque;
	private int codigo = 0;
	// #region funcoes

	/**
	 * funcao que adiciona produto no estoque
	 * @param produto
	 * @return  
	 */
	public boolean adicionar(Produto produto) {
		try {
			produto.setCodigo(codigo++);
			estoque.add(produto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * Fncao que visa excluir um produto no estoque;
	 * @param codigo
	 * @return
	 */
	public boolean excluir(int codigo) {
		try {
			estoque.removeIf(n -> (n.getCodigo() == codigo));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * Funcao que visa realizar o update de um produto;
	 * @param produto
	 * @return
	 */
	public boolean update(Produto produto){
		try {
			excluir(codigo);
			adicionar(produto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	/**
	 * Funcao que retorna produto com o codigo informado;
	 * @param codigo
	 * @return
	*/
	public Produto localizar(int codigo){
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

	@Override
	public String toString() {
		return "Estoque [estoque=" + estoque + ", codigo=" + codigo + "]";
	}
	// #endregion
	

	//#region constructor
	
	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}

	public Estoque() {
		estoque = new ArrayList<Produto>();
	}
	//#endregion
}
