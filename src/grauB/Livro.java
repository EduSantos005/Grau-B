package grauB;


public class Livro extends Produto {

	private String autor;
	private String genero;
	
	public Livro() {
		super();
	}
	
	/**
	 * Além dos parametros padrões, ele vai ter os atributos autor e genero.
	 * @param nome
	 * @param valor
	 * @param codigo
	 * @param quantidade
	 * @param autor Se refere ao autor do livro.
	 * @param genero Se refere ao gênero do livro.
	 */
	public Livro(String nome, double valor, int codigo, int quantidade, String autor, String genero) {
		super(nome, valor, codigo, quantidade);
		this.autor = autor;
		this.genero = genero;
	}
	

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "\nLivro: " + super.toString() +  " - Autor= " + autor + " - Gênero= " + genero;
	}
	
	
}
