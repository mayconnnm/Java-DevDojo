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

	// Método usado no Java6 para ler e fechar o arquivo
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
	// Não será necessessário criar o catch, mas deverá colocar a exceção
	// na assinatura do método
	public static void lerArquivoNew()/* throws IOException */
	{
		// Dentro do try podemos declarar a variável, porém, só se implementar a
		// interface AutoCloseable
		try (Reader reader = new BufferedReader(new FileReader("teste.txt"));
				Reader reader2 = new BufferedReader(new FileReader("teste.txt"));) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
