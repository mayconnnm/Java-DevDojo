package throwable.checkedException;

public class LoginInvalidoException extends Exception {
	// Uma boa prática é não criar um tratamento dessa exceção na mesma classe
	public LoginInvalidoException() {
		super("Usuário ou Senha inválidos");
	}
}