package Code;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

	// a year is a leap year if it is divisible by four
	// but it is not leap year if it is divisible by 100
	// except years divisible by 400
	
	@Test
	public void leapYearsAreDivisibleByFour() {
		assertTrue(LeapYear.isLeapYear(2016));
	}
	
	@Test
	public void otherYearsAreNotDivisibleByFour(){
		assertFalse(LeapYear.isLeapYear(2015));
	}

	@Test
	public void leapYearsAreNotDivisibleByOneHundred(){
		assertFalse(LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void leapYearsAreDivisibleByFourHundred(){
		assertTrue(LeapYear.isLeapYear(2000));
	}
}
