package throwable.checkedException;

public class LoginInvalidoException extends Exception {
	// Uma boa pr�tica � n�o criar um tratamento dessa exce��o na mesma classe
	public LoginInvalidoException() {
		super("Usu�rio ou Senha inv�lidos");
	}
}