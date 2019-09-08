package Prog4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestCase {

	@Test
	void testIsPalindrom() {
					
		assertEquals(Palindrome.isPalindrome("madam"),true);
		//assertEquals(Palindrome.isPalindrome("amanuel"),true);
	}

}
