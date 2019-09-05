package Code;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrapTest {

	private static final int LINE_LENGTH = 5;

	@Test
	public void doesWordWrapForSpecifiedLength() {
		String word = WordWrap.wrap("What is fu", LINE_LENGTH);
		assertEquals("What \nis fu", word);
	}

	@Test
	public void shortWordShouldNotWrap(){
		String word = WordWrap.wrap("What", LINE_LENGTH);
		assertEquals("What", word);
	}
	
	@Test
	public void doesWordWrapTwoTimes(){
		String word = WordWrap.wrap("The Sleepy Brow", LINE_LENGTH);
		assertEquals("The S\nleepy\n Brow", word);
	}
}
