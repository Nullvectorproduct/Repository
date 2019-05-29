package compradores;

//Interface para ser implementada nos repositórios Array e Lista.
public interface RepositorioCompradoresInterface {
	public void inserir(Comprador comprador);

	public void remover(Comprador comprador);

	public Comprador procurar(String cpf)  throws CompradorNaoEncontradoException;

	public void atualizar(Comprador comprador);

	public boolean existe(Comprador comprador);
}
