package br.com.questions;

/**
 * Segunda quest�o do Desafio.
 * @author Bruno Silva Da Silva
 *
 */
public class Question02 {
	private static final int MIN_LENGTH = 6;
	
	/**
	 * Verifica o comprimento de uma string e compara com o comprimento m�nimo necess�rio.<br>
	 * <b>Comprimento m�nimo:</b> 6.
	 * @param password string para ser verificada.
	 * @return retorna o n�mero m�nimo de caracteres para serem adicionados para a string ser considerada segura.
	 */
	public static int checkStringLength(String password) {
		if(password.length() >= MIN_LENGTH) 
			return 0;
		else
			return MIN_LENGTH - password.length();
	}
}