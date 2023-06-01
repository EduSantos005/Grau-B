
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Roupa camisola = new Roupa ("Camisola", 60, 101, 1, "Tecido", "G", "Preta");
		Livro pp = new Livro ("Pequeno Príncipe", 80, 102, 2, "Indeterminado", "Ficção");
		Eletrônico iphone = new Eletrônico ("Iphone 14", 14000, 103, 1, "Apple");
		Eletrodoméstico freezer = new Eletrodoméstico ("Freezer", 5000, 104, 2, "LG");
		
		ArrayList <Produto> produtos = new ArrayList();
		
		Estoque empresa = new Estoque (produtos);
		empresa.adicionarProduto(freezer);
		empresa.adicionarProduto(camisola);
		empresa.adicionarProduto(pp);
		empresa.adicionarProduto(iphone);
		
		ArrayList <Produto> carrinho = new ArrayList();
		Carrinho usuario = new Carrinho (carrinho);
		usuario.adicionarProduto(freezer);
		usuario.adicionarProduto(pp);
		usuario.adicionarProduto(camisola);
		usuario.adicionarProduto(camisola);
		usuario.removerProduto(iphone);
		usuario.removerProduto(freezer);
		
		usuario.listarCarrinho();
	}
}
