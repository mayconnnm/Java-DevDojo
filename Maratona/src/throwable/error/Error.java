package throwable.error;

/*
 * Error's são problemas grandes que não devem ser tratados ou
 * lançados. São problemas que quando acontecem, não tem muito o que fazer.
 *  
 */
public class Error {
	public static void main(String[] args) {
		stackOverflowError();
	}

	public static void stackOverflowError() {
		stackOverflowError();
	}

}
