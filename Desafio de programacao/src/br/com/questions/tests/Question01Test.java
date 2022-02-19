package br.com.questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.questions.Question01;

class Question01Test {
	Question01 question;

	@Test
	void testPrintLadder() {
		question = new Question01();
		
		String expectedOutput = "  *\n **\n***";
		
		String output = question.printLadder(3);
		
		assertEquals(expectedOutput, output);
	}

}
