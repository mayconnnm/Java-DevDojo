package throwable.uncheckedException;

/*
 * Excessões são problemas que podem ser tratadas ou lançadas
 */
public class RuntimeExceptionTeste {
	public static void main(String[] args) {
		try {
			divisao(10, 0);
		} catch (ArithmeticException e) {
			// Utilizado para informar ao cliente o problema
			System.out.println(e.getMessage());
			// Utizado para informar o desenvolvedor o problema
			e.printStackTrace();
		}
	}

	public static void divisao(int num1, int num2) {

		if (num2 == 0) {
			// Throw é usado para lançar explicitamente uma exceção de um método ou
			// qualquer bloco de código. Podemos lançar uma exceção marcada ou não marcada .
			// Throw é usada principalmente para lançar exceções personalizadas .
			throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
		}
		int result = num1 / num2;
		System.out.println(result);
	}
}
