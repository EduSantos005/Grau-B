

public class Eletrodoméstico extends Produto {

	private String descricao;
	
	public Eletrodoméstico(String nome, double valor, int codigo, int quantidade, String descricao) {
		super(nome, valor, codigo, quantidade);
		this.descricao = descricao;
	}
	
	public Eletrodoméstico() {
		super();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "\nEletrodoméstico: "+ super.toString() + " - descricao= " + descricao;
	}
	
}
