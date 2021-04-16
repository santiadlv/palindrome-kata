package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {

	PalindromeValidator validator = new PalindromeValidator(); 
	
	@Test
	void Given_String_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "a";
		boolean expectedResult = true;
		//When
		boolean actualResult = validator.validate(string);
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_TwoDifferentLettersString_When_ValidatingPalindrome_Then_False() {
		//Given
		String string = "ab";
		boolean expectedResult = false;
		//When
		boolean actualResult = validator.validate(string);
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_TwoEqualLettersString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "aa";
		boolean expectedResult = true;
		//When
		boolean actualResult = validator.validate(string);
		//Then
		assertEquals(expectedResult, actualResult);
	}

}
