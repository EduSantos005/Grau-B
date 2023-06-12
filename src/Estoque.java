
import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque;
	
	/*
	 * public Produto localizaProduto(Produto produto) { int cod =
	 * produto.getCodigo();
	 * 
	 * for (Produto p : estoque) { if (p.getCodigo() == cod) { return p; } } return
	 * null; }
	 */

	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}

	public boolean adicionarProduto(Produto produto) {
		try {
			estoque.add(produto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean removerProduto(Produto produto) {
		try {
			estoque.remove(produto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Estoque:" + estoque;
	}

}
