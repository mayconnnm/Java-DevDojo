package classe_abstrata;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Vendedor v = new Vendedor("Maria", "1010", 1200, 1000);
		Gerente g = new Gerente("Maycon", "10", 3100);
		v.calculaSalario();
		g.calculaSalario();
		System.out.println(v);
		System.out.println(g);

	}
}
