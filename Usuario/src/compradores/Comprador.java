package compradores;

import usuarios.Usuario;

public class Comprador extends Usuario {
	public Comprador(String nome, String endereco, double dinheiro, String cpf) {
		super(nome, endereco, dinheiro, cpf);
	}
	
	public void transacao(Produto produto) throws DinheiroInsuficienteException {
		if (this.getDinheiro() >= produto.getPreco()) {
			setDinheiro(this.getDinheiro() - produto.getPreco());
			// remover do repositorio de produtos o produto comprado!
		} else {
			throw new DinheiroInsuficienteException (produto);
		}
	}
}
