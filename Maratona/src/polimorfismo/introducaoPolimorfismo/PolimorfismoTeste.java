package polimorfismo.introducaoPolimorfismo;

public class PolimorfismoTeste {
	public static void main(String[] args) {
		Gerente g = new Gerente("Maycon", 5000, 70000);
		Vendedor v = new Vendedor("Nunes", 1400, 20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
		Funcionario f1 = g;
		Funcionario f2 = v;
		relatorio.relatorioPagamentoGenerico(f1);
		System.out.println(f1);
		relatorio.relatorioPagamentoGenerico(f2);

	}
}
