package Code;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ba.bildit.code.BankAccount;

public class BankAccountAnnotationsTest {

	BankAccount acc;

	@Before
	public void setUp() {
		acc = new BankAccount(20);
		System.out.println("Before");
	}

	@After
	public void tearDown() {
		acc = null;
		System.out.println("After");
	}

	@Test
	public void depositTest() {

		acc.deposit(20);
		assertEquals(40, acc.getBalance());
	}

	@Test
	public void withdrawTest() {
		acc.withdraw(10);
		assertEquals(10, acc.getBalance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void witdrawExceptionTest() {
		acc.withdraw(40);
	}
}