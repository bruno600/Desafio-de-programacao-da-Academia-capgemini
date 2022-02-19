package br.com.questions;

public class Question01 {
	private int base;
	private int height;
	
	public String printLadder(int size) {
		String ladder = "";
		base = size;
		height = size;
		
		for(int line = 1; line <= height; line++) {
			for(int column = base - line; column > 0; column--) {
				ladder += " ";
			}
			
			for(int column = 1; column <= line; column++) {
				ladder += "*";
			}
			
			if(line == height) break;
			ladder +="\n";
		}
		
		return ladder;
	}
}
