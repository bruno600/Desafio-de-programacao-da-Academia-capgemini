package br.com.questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.questions.Question02;

class Question02Test {

	@Test
	void testCheckStringLength() {
		
		assertEquals(0, Question02.checkStringLength("Ya3#asak-"));
		assertEquals(3, Question02.checkStringLength("Ya3"));
		assertEquals(6,Question02.checkStringLength(""));
	}

}
