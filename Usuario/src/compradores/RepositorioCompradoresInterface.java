package compradores;

public interface RepositorioCompradoresInterface {
	public void inserir(Comprador comprador);

	public void remover(Comprador comprador);

	public Comprador procurar(String cpf)  throws CompradorNaoEncontradoException;

	public void atualizar(Comprador comprador);

	public boolean existe(Comprador comprador);
}
