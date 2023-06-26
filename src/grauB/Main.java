package grauB;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * Função para imprimir nota(arquivo txt) na pasta local do projeto
	 * 
	 * @param cpfNaNota 1 = sim, 0 = não
	 * @param cpf       recebe o cpf do cliente
	 * @param carrinho  recebe o carrinho com a ArrayList de produtos
	 * @return true para certo e false para errado
	 */

	public static boolean notinha(int cpfNaNota, String cpf, Carrinho carrinho) {
		try {

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
					bw.write(" | Produtos comprados: " + "\n");

					for (Produto produto : carrinho.getCarrinho()) {
						if (produto instanceof Produto) {
							Produto product = (Produto) produto;
							bw.write(product.infProduto() + "\n");
						}

					}

					bw.write("Valor total: R$ " + String.format("%.2f", carrinho.getValor()));

				} else {
					bw.write("Produtos comprados: " + "\n");
					for (Produto produto : carrinho.getCarrinho()) {
						if (produto instanceof Produto) {
							Produto product = (Produto) produto;
							bw.write(product.infProduto() + "\n");
						}

					}
					bw.write("Valor total: R$ " + String.format("%.2f", carrinho.getValor()));
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			return true;

		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/**
	 * Função para registrar um objeto Admin
	 * 
	 * @return objeto adm 
	 */
	
	public static Admin registerAdm() {

		Scanner in = new Scanner(System.in);

		Admin adm = new Admin();
		System.out.println();
		System.out.println("--CADASTRO ADMIN--");
		System.out.print("Digite seu nome: ");
		adm.setNome(in.nextLine());
		System.out.print("Digite seu CPF: ");
		adm.setCpf(in.nextLine());
		do {
			System.out.print("Digite seu email: ");
			adm.setEmail(in.nextLine());
		} while (adm.getEmail() == null);

		System.out.print("Digite a senha: ");
		adm.setSenha(in.nextLine());

		return adm;

	}

	/**
	 * Função para registrar um objeto Cliente
	 * 
	 * @return objeto cliente
	 */
	
	public static Cliente registerCliente() {
		Scanner in = new Scanner(System.in);

		Cliente cliente = new Cliente();
		System.out.println();
		System.out.println("--CADASTRO CLIENTE--");
		System.out.print("Digite seu nome: ");
		cliente.setNome(in.nextLine());
		System.out.print("Digite seu CPF: ");
		cliente.setCpf(in.nextLine());
		do {
			System.out.print("Digite seu email: ");
			cliente.setEmail(in.nextLine());
		} while (cliente.getEmail() == null);

		System.out.print("Digite a senha: ");
		cliente.setSenha(in.nextLine());

		return cliente;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Produto camisaG = new Roupa("Camisa G", 60, 101, 4, "Tecido", "G", "Preta");
		Produto camisaM = new Roupa("Camisa M", 60, 102, 16, "Tecido", "M", "Preta");
		Produto camisaP = new Roupa("Camisa P", 60, 103, 10, "Tecido", "P", "Preta");
		Produto pp = new Livro("Pequeno Príncipe", 40, 201, 2, "Antoine de Saint-Exupéry", "Ficção");
		Produto crepusculo = new Livro("Crepúsculo", 50, 202, 5, "Stephenie Meyer", "Romance");
		Produto dk = new Livro("Dom Quixote", 30, 203, 3, "Miguel de Cervantes", "Aventura");
		Produto PC = new Eletrônico("PC Gamer", 3300, 301, 3, "AMD Ryzen 5 4600G, 16GB DDR4, SSD 480GB, Monitor 21'");
		Produto iphone = new Eletrônico("Iphone 14", 8000, 302, 10, "Apple iPhone14 Pro Max 128 GB");
		Produto monitor = new Eletrônico("Monitor 23,5'", 1400, 303, 5, "Samsung");
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

		System.out.println("Defina o tipo da sua conta (1/2)");
		System.out.println("1 - Admin\n2 - Cliente");
		int tipoConta = in.nextInt();

		if (tipoConta == 1) {
			Admin adm = Main.registerAdm(); //Instancia o objeto adm do Main
			System.out.println("Olá " + adm.getNome());
			int opcAdm;

			do {
				System.out.println("1 - Localizar produto\n2 - Adicionar produto\n3 - Ver estoque\n0 - Sair");
				opcAdm = in.nextInt();
				in.nextLine(); // Consumir a quebra de linha pendente

				switch (opcAdm) {
				case 1:
					System.out.print("Digite o código do produto: ");
					int cod = in.nextInt();
					in.nextLine(); // Consumir a quebra de linha pendente

					if (empresa.localizar(cod) == null) { //Função retorna null se código não existe
						System.out.println("Produto não existe!");
					} else {
						System.out.println(empresa.localizar(cod));
					}
					break;
				case 2:
					System.out.print("Nome do produto:");
					String nome = in.nextLine();
					System.out.print("Valor: ");
					double valor = in.nextDouble();
					System.out.print("Código: ");
					int codigo = in.nextInt();
					System.out.print("Quantidade: ");
					int quant = in.nextInt();
					
					System.out.println("Digite o tipo do produto");
					System.out.println("1 - Roupa\n2 - Livro\n3 - Eletrônico\n4 - Eletrodoméstico");
					int produto = in.nextInt();
					in.nextLine(); // Consumir a quebra de linha pendente

					switch (produto) {
					case 1:
						System.out.print("Tipo: ");
						String tipo = in.nextLine();
						System.out.print("Tamanho");
						String tamanho = in.nextLine();
						System.out.print("Cor: ");
						String cor = in.nextLine();

						Produto roupa = new Roupa(nome, valor, codigo, quant, tipo, tamanho, cor);
						empresa.adicionarProduto(roupa);
						break;
					case 2:
						System.out.print("Autor: ");
						String autor = in.nextLine();
						System.out.print("Gênero");
						String genero = in.nextLine();

						Produto livro = new Livro(nome, valor, codigo, quant, autor, genero);
						empresa.adicionarProduto(livro);
						break;
					case 3:
						System.out.print("Descrição: ");
						String desc = in.nextLine();

						Produto eletronico = new Eletrônico(nome, valor, codigo, quant, desc);
						empresa.adicionarProduto(eletronico);
						break;
					case 4:
						System.out.print("Descrição: ");
						String descricao = in.nextLine();

						Produto eletrodomestico = new Eletrodoméstico(nome, valor, codigo, quant, descricao);
						empresa.adicionarProduto(eletrodomestico);
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					}
					break;
				case 3:
					System.out.println(empresa);
					break;
				case 0:
					break; 
				default:
					System.out.println("Opção inválida!");
					break;
				}
			} while (opcAdm != 0);
		}

		if (tipoConta == 2) {
			Cliente cliente = Main.registerCliente(); //Instancia o objeto cliente do Main

			System.out.println();
			System.out.println("Bem vindo ao Mercado Livre, segue abaixo os produtos disponíveis em nosso estoque: ");

			System.out.println(empresa);

			Carrinho usuario = new Carrinho(new ArrayList<>());

			System.out.println(" ");
			System.out.println("Carrinho do " + cliente.getNome());

			int opcao = 1000;
			do {
				System.out.print(
						"Digite o código do produto que você quer adicionar ou digite 0 para finalizar o carrinho: ");
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

			System.out.println("\nProdutos selecionados:");
			for (Produto produto : usuario.getCarrinho()) {
				if (produto instanceof Produto) {
					Produto product = (Produto) produto;
					System.out.println(product.infProduto());
				}
			}
			System.out.println("Valor Total: R$ " + String.format("%.2f", usuario.getValor()));

			in.nextLine(); 
			System.out.println("Digite sua senha novamente para confirmar a compra: ");

			String senha = in.nextLine();

			do {  
			    if (cliente.confereSenha(senha) == false) {
			        System.out.print("Senha incorreta!");
			    }
			} while (cliente.confereSenha(senha) == false);


			System.out.println("CPF na nota? (s/n)"); 
			char cpfNaNota = in.next().charAt(0);

			if (cpfNaNota == 's' || cpfNaNota == 'S') {
				notinha(1, cliente.getCpf(), usuario);
			} else {
				notinha(0, null, usuario);
			}

			System.out.println("Obrigado pela confiança, " + cliente.getNome());
			in.close();
		}
	}
}
