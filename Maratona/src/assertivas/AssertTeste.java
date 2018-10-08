package assertivas;

public class AssertTeste {
	public static void main(String[] args) {
		// calculaSalario(-2500);
		diasDaSemana(8);
	}

	// Uma boa pr�tica � usar o m�todo que chama a assertiva em privado, se n�o
	// qualquer um poder� alterar
	private static void calculaSalario(double salario) {
		// Usando o if else para fazer m�ltiplos c�lculos n�o � recomendado
		// if (salario > 0) {
		// Calcula o sal�rio
		// } else {
		// System.out.println("Se chegou aqui, ferro!");
		// }
		// Para configurar o assert: Run/RunConfigurations/Arguments/VMArguments e
		// digita -enableassertions ou -ea
		// Caso queira habilitar para uma classe espec�fica
		// -ea:nomeDoPacote.NomeDaClasse ou para desabilitar para uma classe espec�fica
		// -ea -nomeDoPacote.NomeDaClasse
		// Para isso existe o assert, ele afirma que a l�gica sempre ser� true
		// assert � um m�todo booleano
		// Se optar em deixar uma mensagem
		assert (salario > 0) : "O salário não deve ser menor do que zero, veio: " + salario;

	}

	// Caso utilize em m�todo p�blico, lance uma exce��o
	public static void salario(double salario) {
		if (salario < 0) {
			throw new IllegalArgumentException("");
		}
	}

	public static void diasDaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		// Ao inv�s de deixarmos uma mensagem dizendo o erro, podemos deixar o assert
		// para dar um error
		default:
			assert false : "Dia da Semana inválido!";
		}
	}
}
