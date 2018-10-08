package polimorfismo.introducaoPolimorfismo;

public class RelatorioPagamento {
	// Par�metros polim�rficos
	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		// System.out.println("Relat�rio de pagamento");
		// funcionario.calcularPagamento();
		// System.out.println("Nome: " + funcionario.nome);
		// System.out.println("Sal�rio: " + funcionario.salario);
		// instanceof retorna um valor booleano caso a vari�vel de refer�ncia seja do
		// tipo que deseja
		// Como se l�: se vari�vel de refer�ncia "funcionario" for uma instancia da
		// classe Gerente
		if (funcionario instanceof Gerente) {
			// Fazendo um cast expl�cito, passando o objeto funcionario para referenciar
			// gerente
			Gerente g = (Gerente) funcionario;
			System.out.println("Lucros: " + g.getPnl());
		}
		if (funcionario instanceof Vendedor) {
			// Outra forma de fazer um cast para passar o objeto funcionario como referencia
			// da classe
			System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalVendas());
		}
	}
}
