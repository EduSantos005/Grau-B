package grauB;

public class Admin extends Cliente{
	

	public Admin() {
		super();
	}


	public Admin(String nome, String cpf, String email, String senha) {
		super(nome, cpf, email, senha);
	}
	
	
	@Override
	public String toString() {
		return "Admin [getNome()=" + super.toString();
	}
	

}
