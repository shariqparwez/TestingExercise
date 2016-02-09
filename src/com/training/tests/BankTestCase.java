package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.domains.BankAccount;

public class BankTestCase {

	BankAccount bankAccount = null;
	
	@Before
	public void setUp() throws Exception {
		//bankAccount = new BankAccount(null,60014496415L,2500);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotNull() {
		try{
			bankAccount = new BankAccount("Shariq",60014496415L,2500);
		} catch(RuntimeException e){
			fail("Null Value");
		}
	}
	
	@Test
	public void testValues() {
		bankAccount = new BankAccount("Shariq",60014496415L,2500);
		String name = bankAccount.getAccountHolderName();
		long accno = bankAccount.getAccountNumber();
		double bal = bankAccount.getBalance();
		
		assertEquals("Shariq", name);
		assertEquals(60014496415L, accno);
		assertEquals(2500.00, bal);
		
	}
	
//	@Test
	//public void testValue() {
//		assert 
//	}

}
