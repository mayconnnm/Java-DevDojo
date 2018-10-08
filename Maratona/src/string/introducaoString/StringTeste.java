package string.introducaoString;

public class StringTeste {

	public static void main(String[] args) {

		// String s�o imut�veis, dentro da piscina de Strings n�o h� como alterar uma
		// vari�vel, somente mudar a refer�ncia, pois as vari�veis criadas ficam
		// guardadas na mem�ria para assim poder obter uma economia na mem�ria
		String nome = "Maycon"; // Criando uma vari�vel do tipo String referenciando "Maycon"
		// Esse m�todo concat vai concatenar o objeto que est� dentro da vari�vel nome
		nome.concat(" Nunes"); // Criando duas refer�ncias, "Nunes" e "depois Maycon Nunes"
		// Mas al�m de concatenar � preciso passar a refer�ncia
		nome = nome.concat(" Nunes"); // Mudando a refer�ncia da vari�vel para "Maycon Nunes"
		// 1- Criando uma vari�vel, 2- criando um objeto do tipo String, 3-criando uma
		// vari�vel no pool String
		// String sobrenome = new String("Nunes");
		// nome += " Nunes";
		System.out.println(nome);

		String teste1 = "Goku";
		String teste2 = "goku";

		// Nesse m�todo devemos passar o �ndice que ele retorna a posi��o da letra
		System.out.println(teste1.charAt(1));
		// M�todo para comparar se as String s�o iguais
		System.out.println(teste1.equals(teste2));
		// M�todo para comparar se as String s�o iguais ignorando o tamanho das letras
		System.out.println(teste1.equalsIgnoreCase(teste2));
		// M�todo que retorna o tamanho da String
		System.out.println(teste1.length());
		// M�todo que altera o caracter da vari�vel
		System.out.println(teste1.replace("G", "B"));
		// M�todo que altera a vari�vel para letras min�sculas
		System.out.println(teste1.toLowerCase());
		// M�todo que retorna parte do valor, retornando da primeira posi��o "G" at� a
		// terceira posi��o "k"
		System.out.println(teste1.substring(0, 3));
		// M�todo que tira os espa�os em branco do in�cio e do final
		System.out.println(teste1.trim());

	}
}
