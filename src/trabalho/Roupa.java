package trabalho;

public class Roupa extends Produto {

	private String tipo;
	private String tamanho;
	private String cor;
	
	public Roupa(String nome, double valor, int codigo, int quantidade, String tipo, String tamanho, String cor) {
		super(nome, valor, codigo, quantidade);
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public Roupa() {
		super();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "\nRoupa: " + super.toString() + " - Tipo= " + tipo + " - Tamanho= " + tamanho + " - Cor= " + cor;
	}
	

	
}
