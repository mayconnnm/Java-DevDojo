package classe_abstrata;

public class Vendedor extends Funcionario {
	private double totalVendas;

	public Vendedor() {

	}

	public Vendedor(String nome, String cLT, double salario, double totalVendas) {
		super(nome, cLT, salario);
		this.totalVendas = totalVendas;
	}

	public void calculaSalario() {
		this.salario = salario + this.totalVendas * 0.05;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

}
