import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe simples de autenticação, que simula a autenticação com banco de dados. 
 */
public class LoginScreen {	
	private Map<String, String> userDatabase;
	//Banco de dados simulado, que armazena o "username" e o "password"

	/**
	 * Construtor da classe Login Screen. O construtor cria um hashmap, que simula o banco de dados e o "abastece" ele com duas entradas.
	 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
/**
 * Método que faz a tentativa de login, usando o username e password informados pelo usuário.
 * @param username corresponde ao "username" (nome de usuário) informado pelo usuário que está tentando logar.
 * @param password corresponde a "password" (senha) informada pelo usuário que está tentando logar.
 * @return {@code true} caso a autenticação tenha sucesso, {@code false} caso o login fracasse.
 */
	public boolean login(String username, String password) {	
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;// Login com sucesso
			}
		}
		return false;// Login fracassado
	}

	/**
	 * Adiciona um novo usuário ao "banco de dados". Destaca-se que esse método é apenas uma simplificação 
	 * de como um método de "cadastro" funcionaria. O uso do mesmo em projetos reais é contraindicado,
	 * já que ele não possuí as devidas medidas de segurança.
	 * @param username o username (nome de usuário) do usuário a ser criado.
	 * @param password a password (senha) do usuário a ser criado.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}

}
