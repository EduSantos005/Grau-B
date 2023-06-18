package grauB;


import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	private Estoque estoque ;
	private double valor;
	public Carrinho() {
		
	}
	
	/**
	 * O construtor é composto de um ArrayList de produtos.
	 * @param carrinho É o nome dado ao ArrayList de produtos.
	 */
	public Carrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}
	
	/**
	 * É um método na qual remove um produto do carrinho.
	 * @param produto Ele confere se o produto está presente no carrinho, caso sim, remove o mesmo além de diminuir o valor do carrinho, ainda coloca a quantidade no estoque como +1.
	 * @return
	 */
	public boolean removerProduto(Produto produto) {
		try {
			if (carrinho.contains(produto)) {
				carrinho.remove(produto);
				valor -= produto.getValor();
				System.out.println("Produto: " + produto.getNome() + " removido do Carrinho.");
				produto.setQuantidade(produto.getQuantidade() + 1);
				return true;
			} else {
				System.out.println("Produto: " + produto.getNome() + " não encontra-se no carrinho.");
				return false;
			}

		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	/**
	 * É um método na qual adiciona um produto ao carrinho.
	 * @param produto Confere se tem quantidade suficiente desse produto no estoque, adiciona ao carrinho, soma o valor ao valor do carrinho, além de diminuir em 1 a quantidade no estoque
	 * @return
	 */
	public boolean adicionarProduto(Produto produto) {
		try {
			if (1 <= produto.getQuantidade()) {
				carrinho.add(produto);
				valor += produto.getValor();
				System.out.println("Produto: " + produto.getNome() + " adicionado ao Carrinho.");
				produto.setQuantidade(produto.getQuantidade() - 1);
				return true;
			} else {
				System.out.println("Produto: " + produto.getNome() + " sem quantidade disponível");
				return false;
			}

		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}
	
	public Estoque getEstoque() {
		return estoque;
	}

	@Override
	public String toString() {
		return "Itens Selecionados:" + carrinho + "\nValor Total: R$ " + String.format("%.2f", valor);
	}

}