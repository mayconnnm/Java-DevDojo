package Date;

import java.util.Date;
import java.util.Calendar;

public abstract class ManipulaçãoDataTeste {
	public static void main(String[] args) {
		// Date data = new Date(1_000_000_000l);
		// System.out.println(data);

		Calendar c = Calendar.getInstance();
		// c.setTime(data);
//		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
//			System.out.println("Domingo é o primeiro dia da semana");
//		}
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
//		System.out.println(c.get(Calendar.DAY_OF_YEAR));

		c.add(Calendar.MONTH, 2);
		Date date = c.getTime();
		System.out.println(date);

	}
}
