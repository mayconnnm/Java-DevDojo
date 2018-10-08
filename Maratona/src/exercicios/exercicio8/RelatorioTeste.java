package exercicios.exercicio8;

public class RelatorioTeste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Maycon", 24);
		Aluno aluno2 = new Aluno("Matheus", 17);
		Aluno aluno3 = new Aluno("Edgar", 10);

		Seminario semi = new Seminario("Java");
		Seminario semi2 = new Seminario("Android");
		Seminario semi3 = new Seminario("Web");

		Local local = new Local("Paraiso", "Ceu");

		Professor prof = new Professor("Yoda", "Programação");
		Professor prof2 = new Professor("jedi", "Programação Web");

		aluno.setSeminario(semi);
		aluno2.setSeminario(semi);
		aluno3.setSeminario(semi2);

		semi.setLocal(local);
		semi.setProfessor(prof);
		semi.setAluno(new Aluno[] { aluno, aluno2 });

		semi2.setLocal(local);
		semi2.setProfessor(prof);
		semi2.setAluno(new Aluno[] { aluno3 });

		semi3.setLocal(local);
		semi3.setProfessor(prof2);

		prof.setSeminario(new Seminario[] { semi, semi2 });
		prof2.setSeminario(new Seminario[] { semi3 });

		semi.print();

		aluno.print();
		aluno2.print();
		aluno3.print();

		prof.print();
		prof2.print();

	}
}
