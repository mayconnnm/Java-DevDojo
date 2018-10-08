package throwable.uncheckedException;

/*
 * RuntimeException s�o erros que acontecem em tempo de execu��o, ele acontece quando a l�gica do c�digo n�o est� correta
 */
public class IntroducaoRuntimeException {
	public static void main(String[] args) {

		// ArithmeticException
		// Ele acontece quando � dividido um valor inteiro por 0
		// int a = 10 / 0;
		// Uma das formas de contornar esse erro � criando um if
		// if (a != 0) {
		// System.out.println(a);
		// }

		// NullPointerException
		// Ele acontece quando tenta acessar um m�todo pela vari�vel de
		// refer�ncia em que essa vari�vel n�o possui um objeto em mem�ria sendo
		// referenciado
		// Object o = null;
		// System.out.println(o.toString());

		// ArrayIndexOutOfBoundsException
		// Acontece quando tenta acessar uma posi��o do array que n�o existe
		try {
			int[] i = new int[2];
			System.out.println(i[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
