package throwable.uncheckedException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeException {
	public static void main(String[] args) {
		// No java6, uma forma de executar multiplas catch's
		// try {
		// throw new ArrayIndexOutOfBoundsException();
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		// } catch (IllegalArgumentException e) {
		// System.out.println("Dentro do IllegalArgumentException");
		// } catch (ArithmeticException e) {
		// System.out.println("Dentro do ArithmeticException");
		// }
		// System.out.println("Final do programa");

		// Uma forma de executar o método "talvezLanceException" com possíveis exceções
		// try {
		// talvezLanceException();
		//
		// } catch (SQLException e) {
		// System.out.println("");
		//
		// }catch(
		//
		// FileNotFoundException e)
		// {
		// System.out.println("");
		// }

		// No java7, a forma como inicializa a multi catch mudou
		try {
			talvezLanceException();
			// Pipe "|" funciona como "ou"
		} catch (SQLException | IOException e) {

		}
	}

	public static void talvezLanceException() throws SQLException, FileNotFoundException {

	}
}
