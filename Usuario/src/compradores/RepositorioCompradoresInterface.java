package compradores;

public interface RepositorioCompradoresInterface {
	void inserir(Comprador comprador);

	void remover(Comprador comprador);

	Comprador procurar(String cpf);

	void atualizar(Comprador comprador);

	boolean existe(Comprador comprador);
}
