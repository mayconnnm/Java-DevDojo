package throwable.checkedException;

/*
 * Excess�es s�o problemas que podem ser tratadas ou lan�adas
 */
import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
	public static void main(String[] args) {
		// try {
		// criarArquivo();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		try {
			criarArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		abrirArquivo();
	}

	// Throws faz a declara��o do m�todo, indica que um trecho do c�digo que chame
	// este m�todo deve obrigatoriamente capturar uma poss�vel exce��o
	public static void criarArquivo() throws IOException {
		File file = new File("Teste.txt");
		// "try" Tente executar esse bloco, caso voc� tenha algum problema, "catch"
		// capture essa exce��o
		try {
			System.out.println("Arquivo criado: " + file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
			// Throw � uma exce��o que n�o exige ser tratada por quem chamou, ele transfere
			// o controle do fluxo para os m�todos que chamaram
			throw e;
		}
	}

	public static void abrirArquivo() {
		try {
			System.out.println("Abrindo arquivo: ");
			System.out.println("Executando a leitura do arquivo");
			System.out.println("Escrevendo no arquivo");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fechando o arquivo");
		}
	}
}
