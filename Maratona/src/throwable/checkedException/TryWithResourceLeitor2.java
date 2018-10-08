package throwable.checkedException;

public class TryWithResourceLeitor2 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Fechando o leitor 2");
	}

}
