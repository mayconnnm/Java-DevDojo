package date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
	public static void main(String[] args) {
		// A ISO 639 define a língua e o país da seguinte forma, pt = Português br =
		// Brasil
		// Língua Italiana e a localidade é Italia
		Locale locale1 = new Locale("it", "IT");
		Locale locale2 = new Locale("pt", "BR");
		Locale locale3 = new Locale("hi", "IN");
		Locale locale4 = new Locale("ja");

		Calendar c = Calendar.getInstance();
		c.set(2015, 11, 20);
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale1);
		System.out.println(df1.format(c.getTime()));
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
		System.out.println(df2.format(c.getTime()));
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locale3);
		System.out.println(df3.format(c.getTime()));
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locale4);
		System.out.println(df4.format(c.getTime()));

		// Imprime a língua que a data está
		System.out.println(locale4.getDisplayLanguage());
		// Imprime a língua que a data está e mostra em qual língua leremos
		System.out.println(locale3.getDisplayLanguage(locale2));
		// Imprime o local da data
		System.out.println(locale1.getDisplayCountry());
		System.out.println(locale2.getDisplayCountry(locale1));
	}
}
