package br.com.questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.questions.Question03;

class Question03Test {

	@Test
	void testFindAnagram() {

		assertEquals(2, Question03.findAnagram("ovo"));
		assertEquals(3, Question03.findAnagram("ifailuhkqq"));
		assertEquals(0, Question03.findAnagram(""));
		assertEquals(5, Question03.findAnagram("abab"));
	}

}
