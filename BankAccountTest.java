package Code;

import static org.junit.Assert.*;

import org.junit.Test;

import ba.bildit.code.BankAccount;

public class BankAccountTest {

	@Test
	public void depositTest(){
		BankAccount acc = new BankAccount(20);
		acc.deposit(20);
		assertEquals(40, acc.getBalance());
	}
	
	@Test
	public void withdrawTest(){
		BankAccount acc = new BankAccount(20);
		acc.withdraw(10);
		assertEquals(10, acc.getBalance());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void withdrawException(){
		BankAccount acc = new BankAccount(20);
		acc.withdraw(40);
	}
	
}