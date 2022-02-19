package br.com.questions;

public class Question01 {
	private int base;
	private int height;
	
	public Question01(int size) {
		base = size;
		height = size;
	}
	
	public void printLadder() {
		for(int line = 1; line <= height; line++) {
			for(int column = base - line; column > 0; column--) {
				System.out.print(" ");
			}
			
			for(int column = 1; column <= line; column++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
