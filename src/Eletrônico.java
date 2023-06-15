public class Eletrônico extends Produto {
	
	private String descricao;

	/**
	 * Além dos parametros padrões, ele vai ter o atributo descrição
	 * @param nome
	 * @param valor
	 * @param codigo
	 * @param quantidade
	 * @param descricao Pode ser a respeito da marca ou características do produto.
	 */
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
		return "\nEletrônico: "+ super.toString() + " - Descrição= " + descricao;
	}
	
	
	
}
