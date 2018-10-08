package polimorfismo.introducaoPolimorfismo;

public class Gerente extends Funcionario {
	private double pnl;

	public Gerente(String nome, double salario, double pnl) {
		super(nome, salario);
		this.pnl = pnl;
	}

	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}

	@Override
	public void calcularPagamento() {
		this.salario = this.salario + this.pnl * 0.01;

	}
}