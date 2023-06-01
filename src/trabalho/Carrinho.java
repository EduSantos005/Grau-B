package trabalho;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> carrinho;
	private double valor = 0;

	public Carrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	/*public void adicionarProduto(Produto produto) {
		carrinho.add(produto);
		valor += produto.getValor();
		produto.setQuantidade(produto.getQuantidade() - 1);
	}
	*/
	
	public void removerProduto(Produto produto) {
			if (carrinho.contains(produto)) {
				carrinho.remove(produto);
				valor -= produto.getValor();
				System.out.println("Produto: " + produto.getNome() + " removido do Carrinho.");
				produto.setQuantidade(produto.getQuantidade()+1);
				
			} else {
				System.out.println("Produto: "  + produto.getNome() + " não encontra-se no carrinho.");
			}
		}
	

	public void adicionarProduto(Produto produto) {
		if (1 <= produto.getQuantidade()) {
			carrinho.add(produto);
			valor += produto.getValor();
			System.out.println("Produto: " + produto.getNome() + " adicionado ao Carrinho.");

			produto.setQuantidade(produto.getQuantidade() - 1);
		} else {
			System.out.println("Quantidade não disponível, favor selecionar quantidade válida.");
		}
	}

	public void listarCarrinho() {
		System.out.println("Produtos selecionados:");

 for (Produto produto : carrinho) {
	if (produto instanceof Produto) {
		Produto product = (Produto) produto;
		product.infProduto();
	}
}		
 System.out.println("Valor Total: R$" + valor);
	}
	
	@Override
	public String toString() {
		return "Itens Selecionados:" + carrinho + "\nValor Total: R$" + valor;
	}

}