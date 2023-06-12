import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque;

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

	public Estoque() {
		estoque = new ArrayList<Produto>();
	}


}
