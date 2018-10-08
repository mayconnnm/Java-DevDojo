package classe_interface;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p = new Produto("Notebook", 4, 1000);
		p.calculaImposto();
		p.calculaFrete();
		p.calculaTotal();
		System.out.println(p);
	}
}
