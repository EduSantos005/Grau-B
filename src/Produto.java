public abstract class Produto {

	private String nome;
	private double valor;
	public int codigo;
	public int quantidade;
	
	public Produto(String nome, double valor, int codigo, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * funcao informa o nome e o valor unitario do produto
	 * @return retorna o nome e o valor
	 */
	
	public String infProduto() {
		return "Produto: " + nome + " - Valor: R$ " + String.format("%.2f", valor);
	}
	

	@Override
	public String toString() {
		return codigo + " - Nome= " + nome + " - Valor= R$ " + String.format("%.2f", valor) + " - Quantidade= " + quantidade;
	}

	
}
