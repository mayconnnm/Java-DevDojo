package string.stringPerformance;

public class StringPerformanceTeste {
	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();
		concatString(10000);
		long fim = System.currentTimeMillis();
		System.out.println("String: " + (fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		stringBuilder(200000);
		fim = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (fim - inicio) + "ms");

		inicio = System.currentTimeMillis();
		stringBuffer(200000);
		fim = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (fim - inicio) + "ms");

	}

	private static void concatString(int tam) {
		String string = "";
		for (int i = 0; i < tam; i++) {
			string += i;
		}
	}

	// StringBuilder e StringBuffer s�o bem parecidos, a �nica diferen�a � que os
	// m�todos do StringBuffer s�o todos sincronizados, ou seja, eles s�o protegidos
	// contra acessos por m�ltiplas threads em um mesmo m�todo
	// StringBuilder � melhor em quest�o de performance do que StringBuffer

	// StringBuilder n�o � utilizado em ambientes multi thread
	private static void stringBuilder(int tam) {
		StringBuilder sb = new StringBuilder(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}

	// StringBuffered � utilizado em ambientes multi thread
	private static void stringBuffer(int tam) {
		StringBuffer sb = new StringBuffer(tam);
		for (int i = 0; i < tam; i++) {
			sb.append(i);
		}
	}
}
