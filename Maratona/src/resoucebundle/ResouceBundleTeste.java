package resoucebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouceBundleTeste {
	public static void main(String[] args) {
		// Verificando minha localidade
		// System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println("Inglês");
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		System.out.println("Português");
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		System.out.println(rb.getString("show"));
		
		
	}
}
