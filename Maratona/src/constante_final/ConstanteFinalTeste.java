package constante_final;

public class ConstanteFinalTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.setNome("Gol");
		c.setMarca("Volkswagen");
		System.out.println(c.getComprador());
		c.getComprador().setNome("Maycon");
		System.out.println(c.getComprador());
		System.out.println("Comprador: " + c.getComprador().getNome() + "\n" + "Nome do carro: " + c.getNome() + "\n"
				+ "Marca: " + c.getMarca());
	}
}
