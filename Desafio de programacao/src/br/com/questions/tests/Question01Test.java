package br.com.questions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.questions.Question01;

class Question01Test {

	@Test
	void testPrintLadder() {
		
		assertEquals("*", Question01.printLadder(1));
		assertEquals(" *\n**", Question01.printLadder(2));
		assertEquals("  *\n **\n***", Question01.printLadder(3));
	}

}
