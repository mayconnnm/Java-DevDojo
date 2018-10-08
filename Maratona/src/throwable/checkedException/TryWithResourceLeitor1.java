package throwable.checkedException;

public class TryWithResourceLeitor1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Fechando o leitor 1");
	}

}
