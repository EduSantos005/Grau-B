

public class Eletrônico extends Produto {
	
	private String descricao;

	public Eletrônico(String nome, double valor, int codigo, int quantidade, String descricao) {
		super(nome, valor, codigo, quantidade);
		this.descricao = descricao;
	}
	
	public Eletrônico() {
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
		return "\nEletrônico: "+ super.toString() + " - descricao= " + descricao;
	}
	
	
	
}
