package br.com.questions;

public class Main {

	public static void main(String[] args) {
		System.out.println("Questao 1: ");
		Question01 escada = new Question01();
		System.out.println(escada.printLadder(6));
		
		System.out.println("Questao 2: ");
		System.out.println(Question02.checkStringLength("Ya3"));
	}

}
