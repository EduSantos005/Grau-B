import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> carrinho = new ArrayList<Produto>();
	private Estoque estoque ;
	private double valor;
	public Carrinho() {
		
	}
	public Carrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

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

	public Estoque getEstoque() {
		return estoque;
	}

	@Override
	public String toString() {
		return "Itens Selecionados:" + carrinho + "\nValor Total: R$ " + String.format("%.2f", valor);
	}

}