package br.com.questions;

public class Question01 {
	
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
