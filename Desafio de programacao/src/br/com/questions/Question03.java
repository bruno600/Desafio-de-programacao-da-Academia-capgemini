package br.com.questions;

import java.util.Arrays;

public class Question03 {
	public static int findAnagram(String anagram) {
		int anagramsFound = 0;
		
		int length = anagram.length();
		int halfLength = (int)Math.ceil(anagram.length()/2.0);
		
		for(int amountLetters = 1; amountLetters <= halfLength; amountLetters++) {
			
			for(int i = 0; i < length; i++) {
				if(i + amountLetters > length) break;
				
				String letters = anagram.substring(i, i + amountLetters);
				
				char[] sortedLetters = letters.toCharArray();
				Arrays.sort(sortedLetters);
				String sortedString = new String(sortedLetters);
				
				for(int j = i; j < length; j++) {
					if(i == j) continue;
					if(j + amountLetters > length) break;
					
					String nextLetters = anagram.substring(j, j + amountLetters);
					
					char[] nextSortedLetters = nextLetters.toCharArray();
					Arrays.sort(nextSortedLetters);
					String nextSortedString = new String(nextSortedLetters);
					
					if(sortedString.equals(nextSortedString)) {
						anagramsFound++;
					}
				}
			}
		}
		
		return anagramsFound;
	}
}
