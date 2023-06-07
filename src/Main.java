
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Produto camisaG = new Roupa("Camisa", 60, 101, 4, "Tecido", "G", "Preta");
		Produto camisaM = new Roupa("Camisa", 60, 102, 16, "Tecido", "M", "Preta");
		Produto camisaP = new Roupa("Camisa", 60, 103, 10, "Tecido", "P", "Preta");
		Produto pp = new Livro("Pequeno Príncipe", 40, 201, 2, "Antoine de Saint-Exupéry", "Ficção");
		Produto crepusculo = new Livro("Crepúsculo", 50, 202, 5, "Stephenie Meyer", "Romance");
		Produto dk = new Livro("Dom Quixote", 30, 203, 3, "Miguel de Cervantes", "Aventura");
		Produto PC = new Eletrônico("PC Gamer", 33000, 301, 3, "AMD Ryzen 5 4600G, 16GB DDR4, SSD 480GB, Monitor 21'");
		Produto iphone = new Eletrônico("Iphone 14", 8000, 302, 10, "Apple iPhone14 Pro Max 128 GB");
		Produto monitor = new Eletrônico("Monitor 23,5'", 800, 303, 5, "Samsung");
		Produto freezer = new Eletrodoméstico("Freezer", 3500, 401, 4, "Horizontal Consul 2 portas");
		Produto geladeira = new Eletrodoméstico("Geladeira", 2800, 402, 8, "Electrolux");
		Produto fogao = new Eletrodoméstico("Fogão", 2000, 403, 8, "Brastemp 4 bocas");

		Estoque empresa = new Estoque(new ArrayList());

		empresa.adicionarProduto(camisaG);
		empresa.adicionarProduto(camisaM);
		empresa.adicionarProduto(camisaP);
		empresa.adicionarProduto(crepusculo);
		empresa.adicionarProduto(pp);
		empresa.adicionarProduto(dk);
		empresa.adicionarProduto(PC);
		empresa.adicionarProduto(iphone);
		empresa.adicionarProduto(monitor);
		empresa.adicionarProduto(freezer);
		empresa.adicionarProduto(fogao);
		empresa.adicionarProduto(geladeira);

		System.out.println(empresa);
		
		Carrinho usuario = new Carrinho(new ArrayList());
		
/*
		usuario.adicionarProduto(freezer);
		usuario.adicionarProduto(pp);
		usuario.removerProduto(iphone);
		usuario.removerProduto(freezer);

		usuario.listarCarrinho(); */
	}
}