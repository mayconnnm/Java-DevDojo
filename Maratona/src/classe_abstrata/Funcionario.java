package classe_abstrata;

/**
 * @author Pacheco Chousa
 *
 *         Uma Classe abstrata normalmente possui m�todos abstratos. Os m�todos
 *         s�o implementados nas classes filhas, m�todos abstratos define apenas
 *         a assinatura do m�todo ex: "public abstract void calculaSalario();",
 *         por tanto, n�o cont�m c�digo
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
		return "Nome: " + this.nome + "\n" + "CLT: " + this.CLT + "\n" + "Sal�rio: " + this.salario + "\n";
	}
}
