package throwable.error;

/*
 * Error's s�o problemas grandes que n�o devem ser tratados ou
 * lan�ados. S�o problemas que quando acontecem, n�o tem muito o que fazer.
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
