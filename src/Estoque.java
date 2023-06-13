import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque;

	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = new ArrayList<Produto>();
	}

	public boolean adicionarProduto(Produto produto) {
		try {
			estoque.add(produto);
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
