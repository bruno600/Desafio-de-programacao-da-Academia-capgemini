package br.com.questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.questions.Question01;

class Question01Test {
	Question01 question;

	@Test
	void testPrintLadder() {
		question = new Question01();
		
		assertEquals("*", question.printLadder(1));
		assertEquals(" *\n**", question.printLadder(2));
		assertEquals("  *\n **\n***", question.printLadder(3));
	}

}
