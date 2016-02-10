package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domains.BankAccount;

public class BankTestCase {

	BankAccount bankAccount = null;
	BankAccount bankAccount2 = null;
	
	@Before
	public void setUp() throws Exception {
		bankAccount2 = new BankAccount("Parwez",8002L,3500);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = NullPointerException.class)
	public void testNotNull() throws Exception {
	
			bankAccount = new BankAccount(null,60014496415L,2500);
			fail("Null Value");
	}
	
	@Test
	public void testValues() {
		bankAccount = new BankAccount("Shariq",60014496415L,2500);
		String name = bankAccount.getAccountHolderName();
		long accno = bankAccount.getAccountNumber();
		double bal = bankAccount.getBalance();
		
		assertEquals("Shariq", name);
		assertEquals(60014496415L, accno);
		assertEquals(2500.0,bal,0);
		
	}
	
	@Test
	public void testDeposit() {
		double actual = bankAccount2.deposit(1000.00);
		assertEquals(bankAccount2.getBalance(), actual,0);
		assertTrue(actual>0);
		
	}
	
	@Test
	public void testWithdraw(){
		double actual = bankAccount2.withdraw(500.00);
		assertEquals(bankAccount2.getBalance(), actual,0);
	}
	
	@Test
	public void testWithdrawNotNegative(){
		double actual = bankAccount2.withdraw(2500.00);
		assertTrue(actual>=0);
	}
	
	@Test(timeout=100)
	public void testLoop(){
		bankAccount2.withdraw(2000);
	}
	
	
}
