package compradores;

public class CompradorNaoEncontradoException extends Exception {
	public CompradorNaoEncontradoException() {
		super("Esse comprador não foi encontrado.");
	}
}
