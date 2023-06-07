
import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque;

	public Produto localizaProduto(Produto produto) {
		int cod = produto.getCodigo();

		for (Produto p : estoque) {
			if (p.getCodigo() == cod) {
				return p;
			}
		}
		return null;
	}

	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}

	public void adicionarProduto(Produto produto) {
		estoque.add(produto);
	}

	public void removerProduto(Produto produto) {
		estoque.remove(produto);
	}

	@Override
	public String toString() {
		return "Estoque:" + estoque;
	}

}
