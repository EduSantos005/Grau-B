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
		empresa.adicionarProduto(pp);
		empresa.adicionarProduto(crepusculo);
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
		
		System.out.println(" ");
		System.out.println("Carrinho do " + cliente.getNome());
		
		int opcao = 1000;
		do {
			System.out.println("Digite o código do produto que você quer adicionar ou digite 0 para finalizar o carrinho!");
			opcao = in.nextInt();

			switch (opcao) {
			case 101: 
				usuario.adicionarProduto(camisaG);
				break;
			case 102: 
				usuario.adicionarProduto(camisaM);
				break;
			case 103: 
				usuario.adicionarProduto(camisaP);
				break;
			case 201: 
				usuario.adicionarProduto(pp);
				break;
			case 202: 
				usuario.adicionarProduto(crepusculo);
				break;
			case 203: 
				usuario.adicionarProduto(dk);
				break;
			case 301: 
				usuario.adicionarProduto(PC);
				break;
			case 302: 
				usuario.adicionarProduto(iphone);
				break;
			case 303: 
				usuario.adicionarProduto(monitor);
				break;
			case 401: 
				usuario.adicionarProduto(freezer);
				break;
			case 402: 
				usuario.adicionarProduto(fogao);
				break;
			case 403: 
				usuario.adicionarProduto(geladeira);
				break;
			case 0:
				System.out.println("Carrinho finalizado!");
				break;
			default: 
				System.out.println("Código Inválido!");
				break;
			}
		} while (opcao != 0);
		
		usuario.listarCarrinho(); 

		System.out.println("CPF na nota? (s/n)");
		char cpfNaNota = in.next().charAt(0);

		if (cpfNaNota == 's' || cpfNaNota == 'S') {
			notinha(1, cliente.getCpf());
		} else {
			notinha(0, null);
		}
		
		System.out.println("Obrigado pela confiança, " + cliente.getNome());
	}
}