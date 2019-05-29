package compradores;

public class RepositorioCompradoresArray implements RepositorioCompradoresInterface {
	private Comprador[] compradores;
	private int indice;

	public RepositorioCompradoresArray() {
		this.compradores = new Comprador[200];
		this.indice = 0;
	}

	public boolean existe(Comprador comprador) {
		for (int i = 0; i < 100; i++) {
			if (this.compradores[i] != null) {
				if (this.compradores[i].getCPF().equals(comprador.getCPF())) {
					return true;
				}
			}
		}
		return false;
	}

	public void inserir(Comprador comprador) {
		if (indice < 199) {
			if (compradores[indice] == null) {
				compradores[indice] = comprador;
			} else {
				indice++;
				this.inserir(comprador);
			}
		} // else{
			// Comprador[] compradores2 = new Comprador[300];
			// for (int k = 0; k < 200; k++) {
			// compradores2[k] = compradores[k];
			// }
			// compradores= compradores2;
			// }
	}

	public void remover(Comprador comprador) {
		for (int i = 0; i < 200; i++) {
			if (this.compradores[i].getCPF().equals(comprador.getCPF())) {
				for (int n = 0; n < indice; n++) {
					compradores[n] = compradores[n + 1];
					compradores[n + 1] = null;
				}
			}
		}
	}

	public Comprador procurar(String cpf) throws CompradorNaoEncontradoException {
		for (int i = 0; i < 200; i++) {
			if (this.compradores[i].getCPF().equals(cpf)) {
				return compradores[i];
			}
		}
		throw new CompradorNaoEncontradoException();
	}

	public void atualizar(Comprador comprador) {
		for (int i = 0; i < 200; i++) {
			if (this.compradores[i].getCPF().equals(comprador.getCPF())) {
				compradores[i] = new Comprador(comprador.getNome(), comprador.getEndereco(), comprador.getDinheiro(),
						comprador.getCPF());
			}
		}
	}
}
