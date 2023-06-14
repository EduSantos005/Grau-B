import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque = new ArrayList<Produto>();

	public Estoque() {
		
	}
	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = new ArrayList<Produto>();
	}

	public boolean adicionarProduto(Produto produto) {
		try {
			return estoque.add(produto);
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Estoque:" + estoque;
	}

}
