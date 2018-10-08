package expressao_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
	public static void main(String[] args) {

		// Tags que facilitam no uso de expressões
		// \\d - busca todos os digitos (números)
		// \\D - busca todos os caracteres (letras e símbolos), menos digito
		// \\s - busca espaços em branco \t \n \f \r
		// \\S - busca caracteres que não forem brancos
		// \\w - busca todos os caracteres (letras, digitos e underscore), menos
		// símbolos
		// \\W - busca tudo o que não for palavra e digito
		// [] - busca o que quisermos, não busca obrigatoriamente em ordem, se quisermos
		// buscar o elemento de a até z não precisamos explicitar todos, basta colocar
		// de a-z se quisermos letras minúsculas, ou A-Z se quisermos letras maiúsculas,
		// com digitos também, de 0-9....ex: [a-cF-H2-7]
		// podemos buscar caracteres hexadecimais
		// ? zero ou uma ocorrência
		// * zero ou mais ocorrência
		// + uma ou mais ocorrência
		// {} busca uma quantidade de vezes os elementos ex: {1,4]
		// () agrupa uma expressão
		// | ele funciona como "ou"
		// $ utilizado para encontrar algo no final da linha
		// Exemplo de agrupamento: o(v|c)o = ovo ou oco maca(rr|c)ão = macarrão ou
		// macacão
		// \\. ele funciona como coringa,pode substituir por qualquer coisa
		// ~ caracter de negação, busca tudo que não tenha esses elementos

		// Exemplo para buscar elementos
		// String regex = "ab";
		// String texto = "*abaaab123ccddd45CadDC";

		// Exemplo de buscar elementos hexadecimal
		// String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
		// String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

		// Exemplo para buscar emails
		// String regex = "([\\w\\.])+@([\\w])+\\.([\\w])+([\\.\\w])+";
		// String texto = "fulano@hotmail.com, 102abc@hotmail.com, #@!abrao@mail,
		// teste@gmail.com.br, teste@mail.com.co.br";

		// Método para buscar datas
		// String regex = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
		// String texto = "05/10/2010, 05/5/2010, 01/02/95";
		// método mais legível
		// String regex = "\\d{1,2}/\\d{1,2}\\d{2,4}";

		// Método de busca que não tenha esses elementos
		String regex = "proj([\\w\\.])+([~,])*";
		String texto = "proj1.bkp, proj1.java, proj1.class, proj1.path, proj2.java, proj2.bkp, diagrama, texto, foto";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		// Método matches ele vai validar a expressão
		System.out.println("fulano@hotmail.com".matches(regex));
		System.out.println("Texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("Expressão: " + matcher.pattern());
		System.out.println("Posições Encontradas");
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}
	}
}
