package compradores;

public class RepositorioCompradoresArray implements RepositorioCompradoresInterface {
	private Comprador[] compradores;
	private int indice;

	public RepositorioCompradoresArray() {
		this.compradores = new Comprador[100];
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

	public void inserir(Comprador comprador){
		if (indice < 99) {
		if (compradores[indice] == null) {
			compradores[indice] = comprador;
		} else {
			indice++;
			this.inserir(comprador);
		}
		}
	}

	public void remover (Comprador comprador){
		
		}
}
