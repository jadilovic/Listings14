package Code;

import static org.junit.Assert.*;

import org.junit.Test;

import ba.bildit.code.Simple;

public class SimpleTest {

	@Test
	public void addNumbersTest() {
		Simple simple = new Simple(); // arrange
		int result = simple.addNumbers(2, 3); // act
		assertEquals(5, result); // assert
	}
}