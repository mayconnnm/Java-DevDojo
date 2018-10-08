package token;

import java.util.Scanner;

public class ScannerTeste {
	public static void main(String[] args) {

		// Passando valores para o construtor do scanner
		Scanner sc = new Scanner("1 true 100 oi");
		// enquanto scanner ter um próximo
		while (sc.hasNext()) {
			// imprima
			System.out.println(sc.next());
		}
		System.out.println("########################");
		Scanner sc2 = new Scanner("1 true 100 oi");
		while (sc2.hasNext()) {
			// se scanner ter um próximo inteiro
			if (sc2.hasNextInt()) {
				// i recebe o próximo inteiro
				int i = sc2.nextInt();
				System.out.println("Int: " + i);
				// então se scanner ter um booleano
			} else if (sc2.hasNextBoolean()) {
				// b recebe o próximo booleano
				boolean b = sc2.nextBoolean();
				System.out.println("Boolean: " + b);
				// se não
			} else {
				System.out.println(sc2.next());
			}
		}
	}
}
