package exercicios.exercicio8;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminario;

	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Professor() {

	}

	public void print() {
		System.out.println("");
		System.out.println("*-Relatório do Professor-*");
		System.out.println("Nome: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		System.out.println("Seminários participantes");
		if (seminario != null && seminario.length != 0) {
			for (Seminario seminario : this.seminario) {
				System.out.println(seminario.getTitulo());
			}
		} else {
			System.out.println("O professor não possui seminários para lecionar");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario[] seminario) {
		this.seminario = seminario;
	}

}
