package super_classe;

public class Funcionario extends Pessoa {

	private double salario;

	public void print() {
		System.out.println("");
		System.out.println("Nome: " + super.getNome());
		System.out.println("CPF: " + super.getCpf());

		if (super.getEndereco().getRua() != null && super.getEndereco().getBairro() != null) {
			System.out.println(
					"Endere�o: " + super.getEndereco().getRua() + ", Bairro: " + super.getEndereco().getBairro());
		} else {
			System.out.println("O funcion�rio n�o possui endere�o");
		}
		System.out.println("Sal�rio: " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
