package classe_enum;

/**
 * @author Pacheco Chousa
 *
 *         Classe Enum, uma das formas de utiliza-la, é criar constantes que não
 *         possam ser modificadas.
 * 
 *         Constant Especific Class Body - Corpo Específico de Classe Contante
 *
 */
public enum TipoCliente {
	// A primeira coisa que deve ser inicializado na classe Enum são as Constantes
	PESSOA_FISICA("Pessoa fisica"), PESSOA_JURIDICA("Pessoa juridica");
	private String nome;

	// Contrutor na classe Enum não tem modificador de acesso "public"
	// O construtor inicializa as constantes
	TipoCliente(String nome) {
		this.nome = nome;
	}

	// N�o h� necessidade de criar um m�todo set, se n�o o atributo poder� ser
	// alterado
	public String getNome() {
		return nome;
	}

}