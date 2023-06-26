package grauB;

import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> estoque = new ArrayList<Produto>();

	public Estoque() {
	}
	
	/**
	 * O estoque é composto de um ArrayList de produtos
	 * @param estoque
	 */
	public Estoque(ArrayList<Produto> estoque) {
		this.estoque = new ArrayList<Produto>();
	}

	
	public Produto localizar(int codigo) {
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
	 * É um método que adiciona produtos no estoque
	 * @param produto Ele confere se a quantidade do produto adicionado é maior que 0, e em seguida adiciona ao estoque 
	 * @return
	 */
	public boolean adicionarProduto(Produto produto) {
		try {
		if (produto.getQuantidade() <= 0) {
			return false;
		}
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
