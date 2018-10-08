package classe_abstrata;

/**
 * @author Pacheco Chousa
 *
 *         Uma Classe abstrata normalmente possui métodos abstratos. Os métodos
 *         são implementados nas classes filhas, métodos abstratos define apenas
 *         a assinatura do método ex: "public abstract void calculaSalario();",
 *         por tanto, não contém código
 */
public abstract class Funcionario {
	private String nome;
	private String CLT;
	protected double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String cLT, double salario) {
		this.nome = nome;
		this.CLT = cLT;
		this.salario = salario;
	}

	public abstract void calculaSalario();

	public String getNome() {
		return nome;
	}

	public void setNme(String nome) {
		this.nome = nome;
	}

	public String getCLT() {
		return CLT;
	}

	public void setCLT(String cLT) {
		this.CLT = cLT;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "CLT: " + this.CLT + "\n" + "Salário: " + this.salario + "\n";
	}
}
