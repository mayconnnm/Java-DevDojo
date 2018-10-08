package throwable.checkedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourceTeste {

	public static void main(String[] args) {
		lerArquivoTeste();
	}

	public static void lerArquivoTeste() {
		// O Try With Resources fecha a leitura de baixo para cima
		try (TryWithResourceLeitor1 leitor1 = new TryWithResourceLeitor1(); TryWithResourceLeitor2 leitor2 = new TryWithResourceLeitor2();) {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// M�todo usado no Java6 para ler e fechar o arquivo
	public static void lerArquivoOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} finally {
			try {
				if (reader != null) {

					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// No Java7, o Try With Resources faz com que o java se encarregue de
	// fechar a leitura do arquivo
	// N�o ser� necessess�rio criar o catch, mas dever� colocar a exce��o
	// na assinatura do m�todo
	public static void lerArquivoNew()/* throws IOException */
	{
		// Dentro do try podemos declarar a vari�vel, por�m, s� se implementar a
		// interface AutoCloseable
		try (Reader reader = new BufferedReader(new FileReader("teste.txt"));
				Reader reader2 = new BufferedReader(new FileReader("teste.txt"));) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
