package constante_final;

/**
 * @author Pacheco Chousa
 *
 *         Final pode ser utilizado na classe, no m�todo ou no atributo.
 * 
 *         Utilizando na classe ex.: "public final class Carro", a classe n�o
 *         poder� ser extendida
 * 
 *         Utilizando no m�todo ex.: "public final void print(){", o m�todo n�o
 *         poder� ser sobreescrito, mas poder� ser sobrecarregado
 */

public class Carro {
	private String nome;
	private String marca;
	// Quando utilizar o "final", os atributos devem ser sempre inicializados
	// o nome dos atributos devem sempre ser em letra mai�scula "Uper Case", e
	// quando s�o compostas devem ter um underscore _
	public static final double VELOCIDADE_LIMITE = 250;
	public final Comprador comprador = new Comprador();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Comprador n�o pode ter um m�todo set, pois ele n�o pode ser alterado
	public Comprador getComprador() {
		return comprador;
	}

	@Override
	public String toString() {
		return "Carro: " + this.nome + "\n" + "Marca: " + this.marca + "\n" + "Velocidade Limite: "
				+ this.VELOCIDADE_LIMITE;
	}

}
