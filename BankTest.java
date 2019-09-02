package Code;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testDeposit() {
		BankAcc acc = new BankAcc();
		acc.deposit(50);
		assertEquals(acc.getBalance(), 50);
	}
	
	@Test
	public void testWithdraw() {
		BankAcc acc = new BankAcc(75);
		acc.withdraw(30);
		assertEquals(acc.getBalance(), 45);
	}
	
	@Test
	public void testWithdrawWithNegative() {
		BankAcc acc = new BankAcc(20);
		acc.withdraw(30);
		assertEquals(acc.getBalance(), -15);
	}
	
	@Test
	public void testWithdrawLimit(){
		BankAcc acc = new BankAcc(100);
		assertFalse(acc.withdraw(100000));
		assertEquals(acc.getBalance(), 100);
		
		assertTrue(acc.withdraw(1));
		assertEquals(acc.getBalance(), 99);
	}
}
