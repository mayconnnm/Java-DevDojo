package polimorfismo.classeGenerica;

import java.util.LinkedList;
import java.util.List;

public class DAOTeste {
	public static void main(String[] args) {
		// ArquivoDAOImpl arquivo = new ArquivoDAOImpl();
		GenericDAO dao = new DataBaseDAOImpl();
		// arquivo.save();
		dao.save();
		List<String> list = new LinkedList();
		list.add("nome 1");
		list.add("nome 2");
		list.add("nome 3");
		list.add("nome 4");
		for (String nome : list) {
			System.out.println(nome);
		}
	}
}
