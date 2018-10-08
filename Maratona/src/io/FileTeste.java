package io;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileTeste {
	public static void main(String[] args) {
		// Passando o nome do arquivo que será criado
		File file1 = new File("Arquivo.txt");
		try {
			// boolean newFile = file.createNewFile();
			// Verificando se existe o arquivo que foi nomeado, caso não exista ele criará
			// um novo
			System.out.println(file1.createNewFile());
			boolean exists = file1.exists();
			System.out.println("Perminssão de leitura? " + file1.canRead());
			System.out.println("Caminho do arquivo: " + file1.getPath());
			System.out.println("Localização do arquivo: " + file1.getAbsolutePath());
			System.out.println("É um diretório? " + file1.isDirectory());
			System.out.println("É um arquivo oculto? " + file1.isHidden());
			System.out.println("Quando foi modificado pela última vez? " + new Date(file1.lastModified()));

			if (exists) {
				//System.out.println("Deletado? " + file.delete());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
