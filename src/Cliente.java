<<<<<<< HEAD
public class Cliente {

	private String nome;
	private String cpf;
	private String email;

	public Cliente() {}


=======

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente() {}
	
	
>>>>>>> 3350e44bc42eef6e83a191a5ee133d8fed85eaea
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Nome=" + nome + ", CPF=" + cpf + ", Email=" + email;
	}
}
