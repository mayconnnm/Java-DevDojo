package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTeste {
	public static void main(String[] args) {
		File file = new File("FileTeste.txt");

		// Fechando FileWriter e FileRead automaticamente usando Try With Resource
		try (FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {
			fw.write("Testando");
			fw.flush();

			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for (char c : in) {
				System.out.print(c);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

//		try {
//			 Passando o caminho do arquivo no construtor do FileWriter, ele verifica se
//			 existe, caso não exista um arquivo, ele cria um novo
//			 Podemos passar o nome do arquivo ou o caminho ex: FileWriter fw = new
//			 FileWriter(file);
//
//			FileWriter fw = new FileWriter("Arquivo.txt");
//			fw.write("Escrevendo uma menssagem no arquivo \n e pulando uma linha 2");
//			 Esse método libera o fluxo de dados, pois nem sempre tudo é passado para o
//			 arquivo, as vezes fica preso no fluxo
//			fw.flush();
//			fw.close();
//
//			FileReader fr = new FileReader("Arquivo.txt");
//			char[] in = new char[500];
//			int size = fr.read(in);
//			System.out.println("Tamanho: " + size);
//			for (char c : in) {
//				System.out.print(c);
//			}
//			fr.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
