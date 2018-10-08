package wrappers;

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

		// AutoBoxing é pegar um tipo primitivo e passar para wrapper
		// unBoxing é passar um wrapper para tipo primitivo

		int i = integerWrapper;
		System.out.println(i);

		String valor = "10";
		// O método parse faz a converção de String para float
		float f = Float.parseFloat(valor);
		System.out.println(f);

		// Verifica se o valor é um digito
		System.out.println(Character.isDigit('9'));
		// Verifica se o valor é uma letra
		System.out.println(Character.isLetter('a'));
		// Verifica se o valor é uma letra ou digito
		System.out.println(Character.isLetterOrDigit('b'));
		// Verifica se o valor é com letra maiúscula
		System.out.println(Character.isUpperCase('C'));
		// Verifica se o valor é com letra minúscula
		System.out.println(Character.isLowerCase('d'));

	}
}
