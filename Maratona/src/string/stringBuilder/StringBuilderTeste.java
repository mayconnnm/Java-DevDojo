package string.stringBuilder;

public class StringBuilderTeste {

	public static void main(String[] args) {
		String s = "Uma frase comun";
		StringBuilder sb = new StringBuilder();
		// StringBuilder é bem diferente de String, ele não cria um String no pool de
		// String
		// Usando o append ele pode concatenar os valores sem recriar string
		// Usando somente um objeto
		sb.append("Uma frase comun");
		sb.append("!!!");
		// Ele inverte o valor
		System.out.println(sb.reverse());
		// Ele deleta a 3° e 4° posição
		System.out.println(sb.delete(2, 10));

	}

}
