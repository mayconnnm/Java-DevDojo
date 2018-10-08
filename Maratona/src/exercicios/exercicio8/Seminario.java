package exercicios.exercicio8;

public class Seminario {
	private String titulo;
	private Aluno[] aluno;
	private Professor professor;
	private Local local;

	public Seminario(String titulo) {
		this.titulo = titulo;
	}

	public Seminario() {

	}

	public void print() {
		System.out.println("");
		System.out.println("*-Relatório do Seminário-*");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Alunos Participantes");

		if (aluno != null && aluno.length != 0) {
			for (Aluno aluno : this.aluno) {
				System.out.println(aluno.getNome());
			}
		} else {
			System.out.println("O seminário não possui alunos");
		}

		if (professor != null) {
			System.out.println("Professor: " + this.professor.getNome());
		} else {
			System.out.println("O seminário não possui professor");
		}

		if (local != null) {
			System.out.println("Local: Rua " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
		} else {
			System.out.println("O seminário não possui local");
		}
	}

	public Aluno[] getAluno() {
		return aluno;
	}

	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
