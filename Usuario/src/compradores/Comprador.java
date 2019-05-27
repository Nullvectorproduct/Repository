package compradores;

import usuarios.Usuario;

public class Comprador extends Usuario {
	public Comprador(String nome, String login, String senha, String endereco, double dinheiro, String cpf) {
		super(nome, login, senha, endereco, dinheiro, cpf);
	}

	public void comprar() {

	}
}
