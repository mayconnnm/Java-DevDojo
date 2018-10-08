package classe_enum;

public class ClienteTeste {
	public static void main(String[] args) {

		Contatos c = new Contatos("Maycon", TipoCliente.PESSOA_JURIDICA);
		System.out.println(c);
	}
}
