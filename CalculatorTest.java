package Code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal;
	
	@Before
	public void setUp() throws Exception{
		cal = new Calculator();
	}
	
	@After
	public void tearDown() throws Exception{
		
	}

	@Test(expected=ArithmeticException.class)
	public void testDivision() {
		
		int num1 = 7, num2 = 0;
		cal.divide(num1, num2);
	}

}
