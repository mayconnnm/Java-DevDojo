package pacoteTeste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testando {
	public static void main(String[] args) {

		String procurando = "ab";
		String texto = "abcdefg";
		Pattern pattern = Pattern.compile(procurando);
		Matcher mat = pattern.matcher(texto);
		System.out.println("Texto: " + texto);
		System.out.println("Índice: 0123456789");
		System.out.println("Expressão: " + mat.pattern());
		System.out.println("Elementos encontrados");
		while (mat.find()) {
			System.out.println(mat.start());
		}
	}
}
//		float valor = 123.456f;
//		Locale jp = new Locale("JP");
//		Locale fr = new Locale("FR");
//
//		NumberFormat[] nf = new NumberFormat[4];
//		nf[0] = NumberFormat.getInstance();
//		nf[1] = NumberFormat.getInstance(fr);
//		nf[2] = NumberFormat.getCurrencyInstance();
//		nf[3] = NumberFormat.getCurrencyInstance(fr);
//
//		for (NumberFormat nb : nf) {
//			System.out.println(nb.format(valor));
//		}
//		NumberFormat nb = NumberFormat.getInstance();
//		System.out.println(nb.getMaximumFractionDigits());
//		nb.setMaximumFractionDigits(2);
//		System.out.println(nb.format(valor));
//		String valorString = "1010";
//		try {
//			System.out.println(nb.parse(valorString));
//			nb.setParseIntegerOnly(true);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}