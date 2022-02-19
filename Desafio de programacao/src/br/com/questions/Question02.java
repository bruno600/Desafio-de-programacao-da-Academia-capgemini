package br.com.questions;

public class Question02 {
	private static final int MIN_LENGTH = 6;
	
	public static int checkStringLength(String password) {
		if(password.length() >= MIN_LENGTH) 
			return 0;
		else
			return MIN_LENGTH - password.length();
	}
}