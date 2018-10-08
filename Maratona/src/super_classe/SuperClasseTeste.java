package super_classe;

public class SuperClasseTeste {
	public static void main(String[] args) {
		Endereco end = new Endereco();
		Endereco end2 = new Endereco();

		Funcionario f = new Funcionario();
		Funcionario f2 = new Funcionario();

		end.setBairro("Ingá");
		end.setRua("Travessa são sebastião");

		end2.setBairro("Ingá");
		end2.setRua("Travessa são sebastião");

		f.setNome("Miguel");
		f.setCpf(10101010101l);
		f.setEndereco(end);
		f.setSalario(10000d);

		f2.setNome("Maycon");
		f2.setCpf(20202020200l);
		f2.setEndereco(end);
		f2.setSalario(10000d);

		f.print();
		f2.print();

	}
}
