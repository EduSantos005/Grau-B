package grauB;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String senha;

	// #region
	public Cliente() {
	}

	/**
	 * Dados importantes para se a ligação entre o usuário e a loja.
	 * 
	 * @param nome  Nome do cliente.
	 * @param cpf   CPF do cliente.
	 * @param email Email do cliente.
	 */

	public Cliente(String nome, String cpf, String email, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		setEmail(email);
	}

	// #endregion

	// #region get e set

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Funcao que visa realizar verificacoes do email do usuario
	 * 
	 * @param email
	 * @return
	 */
	
	public boolean confereSenha(String verificaSenha) {
		
		if(senha.equals(verificaSenha)) {
			return true;
		}
		else return false;
	}
	public boolean setEmail(String email) {
			// verifica se a apenas 10 caracteres e gera um erro

			if (!email.contains("@")) {
				System.out.println("Email invalido");
				return false;
			}
			// verifica se a apenas 10 caracteres e gera um erro
			if (email.length() < 10) {
				System.out.println("Email precisa ter mais de 10 caracteres");
				return false;
			}

			this.email = email;
			
			return true;
		
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", CPF=" + cpf + ", Email=" + email;
	}

	// #endregion
}
