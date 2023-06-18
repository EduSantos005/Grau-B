package grauB;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;

	//#region
	public Cliente() {
	}

	/**
	 * Dados importantes para se a ligação entre o usuário e a loja.
	 * @param nome Nome do cliente.
	 * @param cpf CPF do cliente.
	 * @param email Email do cliente.
	 */
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	//#endregion

	//#region get e set

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

	/**
	 * Funcao que visa realizar verificacoes do email do usuario
	 * @param email 
	 * @return
	 */
	public boolean setEmail(String email) {
		try {
			if (!email.contains("@")) {
				throw new Exception("email invalido");
			}
			if (email.length() < 10) {
				throw new Exception("email invalidso por ser ");
			}
			
			this.email = email;
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", CPF=" + cpf + ", Email=" + email;
	}

	//#endregion
}
