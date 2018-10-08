package wrapper;

public class WrappersTeste {
	public static void main(String[] args) {
		// Tipos primitivos
		byte bytePrimitivo = 1;
		short shortPrimitivo = 2;
		int intPrimitivo = 3;
		long longPrimitivo = 4l;
		float floatPrimitivo = 5f;
		double doublePrimitivo = 6d;
		char charPrimitivo = 'a';
		boolean booleanPrimitivo = true;
		// Wrappers, podem aceitar String que convertem automaticamente
		Byte byteWrapper = new Byte("10");
		Short shortWrapper = 2;
		Integer integerWrapper = 3;
		// valueOf retorna um wrapper, podemos passar como primitivo ou String
		Long longWrapper = Long.valueOf("4");
		Float floatWrapper = 5f;
		Double doubleWrapper = 6d;
		Character characterWrapper = 'e';
		Boolean booleanWrapper = true;

		// AutoBoxing � pegar um tipo primitivo e passar para wrapper
		// unBoxing � passar um wrapper para tipo primitivo

		int i = integerWrapper;
		System.out.println(i);

		String valor = "10";
		// O m�todo parse faz a conver��o de String para float
		float f = Float.parseFloat(valor);
		System.out.println(f);

		// Verifica se o valor � um digito
		System.out.println(Character.isDigit('9'));
		// Verifica se o valor � uma letra
		System.out.println(Character.isLetter('a'));
		// Verifica se o valor � uma letra ou digito
		System.out.println(Character.isLetterOrDigit('b'));
		// Verifica se o valor � com letra mai�scula
		System.out.println(Character.isUpperCase('C'));
		// Verifica se o valor � com letra min�scula
		System.out.println(Character.isLowerCase('d'));

	}
}
