package classe_abstrata;

public class Gerente extends Funcionario {

	public Gerente() {

	}

	public Gerente(String nome, String cLT, double salario) {
		super(nome, cLT, salario);
	}

	public void calculaSalario() {
		this.salario = salario + salario * 0.02;
	}
}
