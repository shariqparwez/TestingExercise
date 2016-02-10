package com.training.domains;

public class BankAccount {
	private String accountHolderName;
	private long accountNumber;
	private double balance;
	
	public BankAccount(String accountHolderName, long accountNumber, double balance) {
		super();
		if(accountHolderName!=null){
		this.accountHolderName = accountHolderName;
		}
		else{
			throw new NullPointerException();
		}
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	

	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double deposit(double amountDeposited){
		balance = amountDeposited + balance;
		return balance;
	}
	
	public double withdraw(double amountWithdrawn) throws IllegalArgumentException{
		//double remainingBalance = 0.0;
		//to test loop
		if((balance - amountWithdrawn) > 0){
			balance = balance - amountWithdrawn;
			return balance;}
		else
			throw new IllegalArgumentException("Insufficient Money left in account\n");
	}
}
