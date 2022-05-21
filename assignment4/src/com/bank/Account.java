package com.bank;

public class Account {
	
	private long accountid;
	private String accountType;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean withdraw(int with) {
		
		if(balance>=with) {
			double availB=balance-with;
			balance=availB;
			if(balance>0) {
				return true;
			}
			return false;
			
		}
		return false;
	}

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long ac) {
		this.accountid = ac;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance2) {
		this.balance = balance2;
	}
	
	
	
	
	
}


