package date;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste {
	public static void main(String[] args) {
		float valor = 123.4567f;
		Locale locjp = new Locale("JP");
		Locale locfranca = new Locale("FR");
		NumberFormat[] nfs = new NumberFormat[4];
		nfs[0] = NumberFormat.getInstance();
		nfs[1] = NumberFormat.getInstance(locjp);
		nfs[2] = NumberFormat.getCurrencyInstance();
		nfs[3] = NumberFormat.getCurrencyInstance(locjp);

		for (NumberFormat nf : nfs) {
			System.out.println(nf.format(valor));
		}
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		// Esse método imprime a quantidade de digitos na fração
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(valor));
		String valorString = "1010100";
		try {
			System.out.println(nf.parse(valorString));
			// Esse método desconsidera todos os valores decimais
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
