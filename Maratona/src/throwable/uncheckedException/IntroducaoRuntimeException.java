package throwable.uncheckedException;

/*
 * RuntimeException são erros que acontecem em tempo de execução, ele acontece quando a lógica do código não está correta
 */
public class IntroducaoRuntimeException {
	public static void main(String[] args) {

		// ArithmeticException
		// Ele acontece quando é dividido um valor inteiro por 0
		// int a = 10 / 0;
		// Uma das formas de contornar esse erro é criando um if
		// if (a != 0) {
		// System.out.println(a);
		// }

		// NullPointerException
		// Ele acontece quando tenta acessar um método pela variável de
		// referència em que essa variável não possui um objeto em memória sendo
		// referenciado
		// Object o = null;
		// System.out.println(o.toString());

		// ArrayIndexOutOfBoundsException
		// Acontece quando tenta acessar uma posição do array que não existe
		try {
			int[] i = new int[2];
			System.out.println(i[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
