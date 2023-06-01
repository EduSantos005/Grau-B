package trabalho;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> carrinho;
	private double valor = 0;

	public Carrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	public void adicionarProduto(Produto produto) {
		carrinho.add(produto);
		valor += produto.getValor();
		produto.setQuantidade(produto.getQuantidade() - 1);
	}

	public void removerProduto(Produto produto) {
			if (carrinho.contains(produto)) {
				carrinho.remove(produto);
				valor -= produto.getValor();
			} else {
				System.out.println("Esse produto não encontra-se no carrinho.");
			}
		}
	

	public void adicionarProduto(Produto produto, int qnt) {
		if (qnt <= produto.getQuantidade()) {
			carrinho.add(produto);
			valor += produto.getValor();
			produto.setQuantidade(produto.getQuantidade() - qnt);
		} else {
			System.out.println("Quantidade não disponível, favor selecionar quantidade válida.");
		}
	}

	@Override
	public String toString() {
		return "Itens Selecionados:" + carrinho + "\nValor Total: R$" + valor;
	}

}