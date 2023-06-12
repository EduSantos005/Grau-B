import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void notinha(int cpfNaNota, String cpf) {
		

		String dirPath = "./Notinha";
		File diretorio = new File(dirPath);

		if (diretorio.mkdirs()) {
			System.out.println("Pasta da notinha criada em: " + diretorio.getAbsolutePath());
		}

		String path = diretorio.getAbsolutePath() + "\\notinha.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			System.out.println("Notinha impressa com sucesso!");

			if (cpfNaNota == 1) {
				bw.write("Cliente de CPF: " + cpf);
				bw.write(" | Produtos comprados: "); // precisa colocar os produtos do carrinho
			}else {
				bw.write("Produtos comprados: "); 
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("--CADASTRO--");
		System.out.print("Digite seu nome: ");
		String nome = in.nextLine();
		System.out.print("Digite seu CPF: ");
		String cpf = in.nextLine();
		System.out.print("Digite seu email: ");
		String email = in.nextLine();

		Cliente cliente = new Cliente(nome, cpf, email);

		
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

		System.out.println("Bem vindo a Loja Grau B, segue abaixo os produtos disponíveis em nosso estoque: ");

		System.out.println(empresa);

		Carrinho usuario = new Carrinho(new ArrayList());
		
		System.out.println("CARRINHO DO " + cliente.getNome());
		
		System.out.println("Digite os números de acordo com o produto que você quer adicionar");
		
		usuario.adicionarProduto(freezer);
		usuario.adicionarProduto(pp);
		usuario.adicionarProduto(pp);
		usuario.adicionarProduto(pp);
		usuario.removerProduto(iphone);
		usuario.removerProduto(freezer);

		usuario.listarCarrinho(); 
	}
}