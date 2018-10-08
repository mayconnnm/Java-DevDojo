package throwable.uncheckedException;

/*
 * Excess�es s�o problemas que podem ser tratadas ou lan�adas
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
			// Throw � usado para lan�ar explicitamente uma exce��o de um m�todo ou
			// qualquer bloco de c�digo. Podemos lan�ar uma exce��o marcada ou n�o marcada .
			// Throw � usada principalmente para lan�ar exce��es personalizadas .
			throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
		}
		int result = num1 / num2;
		System.out.println(result);
	}
}
