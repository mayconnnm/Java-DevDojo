package classe_enum;

public class Contatos {

	private String nome;
	private TipoCliente tipo;

	public Contatos(String nome, TipoCliente tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Tipo: " + this.tipo.getNome();
	}
}
