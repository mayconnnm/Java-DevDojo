package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuferedTeste {
	public static void main(String[] args) {

		File file = new File("Bufered.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				BufferedReader br = new BufferedReader(new FileReader(file))) {
			bw.write("Escrevendo uma menssagem no arquivo");
			bw.newLine();
			bw.write("e pulando uma linha 2");
			bw.flush();
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

//		try {
//
//			FileWriter fw = new FileWriter("Arquivo.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//
//			bw.write("Escrevendo uma menssagem no arquivo");
//			// Pula uma linha
//			bw.newLine();
//			bw.write("e pulando uma linha 2");
//			bw.flush();
//			bw.close();
//
//			FileReader fr = new FileReader("Arquivo.txt");
//			BufferedReader br = new BufferedReader(fr);
//			// Ao invés de ler e enviar letra por letra, ele vai reler uma linha inteira e
//			// retornar uma string
//			String s = null;
//			while ((s = br.readLine()) != null) {
//				System.out.println(s);
//			}
//
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
