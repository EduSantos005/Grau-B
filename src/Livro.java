public class Livro extends Produto {

	public String autor;
	public String genero;
	
	public Livro(String nome, double valor, int codigo, int quantidade, String autor, String genero) {
		super(nome, valor, codigo, quantidade);
		this.autor = autor;
		this.genero = genero;
	}
	
	public Livro() {
		super();
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
