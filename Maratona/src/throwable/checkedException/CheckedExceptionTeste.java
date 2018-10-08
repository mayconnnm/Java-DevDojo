package throwable.checkedException;

/*
 * Excessões são problemas que podem ser tratadas ou lançadas
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

	// Throws faz a declaração do método, indica que um trecho do código que chame
	// este método deve obrigatoriamente capturar uma possível exceção
	public static void criarArquivo() throws IOException {
		File file = new File("Teste.txt");
		// "try" Tente executar esse bloco, caso você tenha algum problema, "catch"
		// capture essa exceção
		try {
			System.out.println("Arquivo criado: " + file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
			// Throw é uma exceção que não exige ser tratada por quem chamou, ele transfere
			// o controle do fluxo para os métodos que chamaram
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
