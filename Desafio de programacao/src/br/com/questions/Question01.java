package br.com.questions;

/**
 * Primeira questão do Desafio.
 * @author Bruno Silva Da Silva
 *
 */
public class Question01 {
	
	/**
	 * Imprime uma escada com os caracteres espaço e *.
	 * @param size altura e largura da escada.
	 * @return retorna uma escada em string.
	 */
	public static String printLadder(int size) {
		String ladder = "";
		
		for(int line = 1; line <= size; line++) {
			for(int column = size - line; column > 0; column--) {
				ladder += " ";
			}
			
			for(int column = 1; column <= line; column++) {
				ladder += "*";
			}
			
			if(line == size) break;
			ladder +="\n";
		}
		
		return ladder;
	}
}
