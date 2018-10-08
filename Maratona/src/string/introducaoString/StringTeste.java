package string.introducaoString;

public class StringTeste {

	public static void main(String[] args) {

		// String são imutáveis, dentro da piscina de Strings não há como alterar uma
		// variável, somente mudar a referência, pois as variáveis criadas ficam
		// guardadas na memória para assim poder obter uma economia na memória
		String nome = "Maycon"; // Criando uma variável do tipo String referenciando "Maycon"
		// Esse método concat vai concatenar o objeto que está dentro da variável nome
		nome.concat(" Nunes"); // Criando duas referências, "Nunes" e "depois Maycon Nunes"
		// Mas além de concatenar é preciso passar a referência
		nome = nome.concat(" Nunes"); // Mudando a referência da variável para "Maycon Nunes"
		// 1- Criando uma variável, 2- criando um objeto do tipo String, 3-criando uma
		// variável no pool String
		// String sobrenome = new String("Nunes");
		// nome += " Nunes";
		System.out.println(nome);

		String teste1 = "Goku";
		String teste2 = "goku";

		// Nesse método devemos passar o índice que ele retorna a posição da letra
		System.out.println(teste1.charAt(1));
		// Método para comparar se as String são iguais
		System.out.println(teste1.equals(teste2));
		// Método para comparar se as String são iguais ignorando o tamanho das letras
		System.out.println(teste1.equalsIgnoreCase(teste2));
		// Método que retorna o tamanho da String
		System.out.println(teste1.length());
		// Método que altera o caracter da variável
		System.out.println(teste1.replace("G", "B"));
		// Método que altera a variável para letras minúsculas
		System.out.println(teste1.toLowerCase());
		// Método que retorna parte do valor, retornando da primeira posição "G" até a
		// terceira posição "k"
		System.out.println(teste1.substring(0, 3));
		// Método que tira os espaços em branco do início e do final
		System.out.println(teste1.trim());

	}
}
