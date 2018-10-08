package classe_interface;

public class Produto implements Tributavel, Transportavel {
	private String nome;
	private double peso;
	private double preco;
	private double Total;
	private double valorFrete;
	private double valorImposto;

	@Override
	public void calculaImposto() {
		this.valorImposto = this.preco * IMPOSTO;
	}

	@Override
	public void calculaFrete() {
		this.valorFrete = this.preco / this.peso * 0.1;
	}

	public void calculaTotal() {
		this.Total = this.preco + this.valorImposto + this.valorFrete;
	}

	public Produto(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTotal() {
		return Total;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Peso: " + this.peso + "\n" + "Preço: " + this.preco + "\n" + "Imposto: "
				+ this.valorImposto + "\n" + "Frete: " + this.valorFrete + "\n" + "Total: " + this.Total;
	}
}
