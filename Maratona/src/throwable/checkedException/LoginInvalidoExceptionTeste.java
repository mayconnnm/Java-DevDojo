package throwable.checkedException;

public class LoginInvalidoExceptionTeste {

	public static void logar() throws LoginInvalidoException {
		String usuario = "haha";
		String senha = "123";
		String usuarioDigitado = "haha";
		String senhaDigitado = "111";
		// equals verifica se o valor do usuario é igual ao o valor do usuarioDigitado
		
		// Aqui ele verifica se o usuario é diferente de usuarioDigitado ou se senha é
		// diferente de senhaDigitado
		if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitado)) {
			throw new LoginInvalidoException();
		}
		System.out.println("Logado!");
	}

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}
}
