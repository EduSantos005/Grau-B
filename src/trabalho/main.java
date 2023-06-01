package trabalho;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Roupa camisola = new Roupa ("Camisola", 60, 101, 1, "Tecido", "G", "Preta");
		Livro pp = new Livro ("Pequeno Príncipe", 80, 102, 2, "Indeterminado", "Ficção");
		Eletrônico iphone = new Eletrônico ("Iphone 14", 14000, 103, 1, "Apple");
		Eletrodoméstico freezer = new Eletrodoméstico ("Freezer", 5000, 104, 1, "LG");
		
		ArrayList <Produto> produtos = new ArrayList();
		
		Estoque empresa = new Estoque (produtos);
		empresa.adicionarProduto(freezer);
		empresa.adicionarProduto(camisola);
		empresa.adicionarProduto(pp);
		empresa.adicionarProduto(iphone);
		
		ArrayList <Produto> carrinho = new ArrayList();
		Carrinho usuario = new Carrinho (carrinho);
		usuario.adicionarProduto(freezer,2);
		usuario.adicionarProduto(pp,2);
		usuario.removerProduto(camisola);
		System.out.println(usuario.toString());
	}
}
