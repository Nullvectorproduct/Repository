package usuarios;

public class Usuario {
	private String nome;
	private String login;
	private String senha;
	private String endereco;
	private double dinheiro;
	private String cpf;

	public Usuario(String nome, String login, String senha, String endereco, double dinheiro, String cpf) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
		this.dinheiro = dinheiro;
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public String getLogin() {
		return this.login;
	}

	public String getSenha() {
		return this.senha;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public double getDinheiro() {
		return this.dinheiro;
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setNome() {
		this.nome = nome;
	}

	public void setLogin() {
		this.login = login;
	}

	public void setSenha() {
		this.senha = senha;
	}

	public void setEndereco() {
		this.endereco = endereco;
	}

	public void setDinheiro() {
		this.dinheiro = dinheiro;
	}

	public void setCPF() {
		this.cpf = cpf;
	}
}
