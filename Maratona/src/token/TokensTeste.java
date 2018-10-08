package token;

public class TokensTeste {
	public static void main(String[] args) {

		String str = "Willian, Matheus, Joao, Paulo, Camila, Maria";
		String[] tokens = str.split(",");

		for (String st : tokens) {
			System.out.println(st.trim());
		}
	}
}
