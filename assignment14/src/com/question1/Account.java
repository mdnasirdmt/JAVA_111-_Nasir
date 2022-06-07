package com.question1;

public class Account {
	
	String accountNumber;
	double Balance;
	
	public Account() {
		
	}

	void deposit(int amount){
		
		Balance=amount;
		
	}
	
	double withdraw(int amount) throws InsufficientFundsException{
		
		Balance=Balance-amount;
		if(Balance<0) {
			throw new InsufficientFundsException("Insuficient fund ");
		}
		return Balance;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

//	public double getBalance() {
//		return Balance;
//	}
//
//	public void setBalance(double balance) {
//		Balance = balance;
//	}
	
	
}


