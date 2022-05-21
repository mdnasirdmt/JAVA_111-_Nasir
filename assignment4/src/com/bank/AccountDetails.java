package com.bank;
import java.util.*;
public class AccountDetails {

	Account aobj=	new Account();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
	 Account accObj=accountDetails.getAccountDetails();
	 accountDetails.getWithdrawAmount();


	}
	
	public  Account getAccountDetails() {
//		Account aobj=	new Account();
//		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter account number : ");
		long ac=sc.nextLong();
		aobj.setAccountid(ac);
		
		System.out.println("enter account type : ");
		String type=sc.next();
		aobj.setAccountType(type);
		
		System.out.println("enter Balance : ");
		
		double balance=sc.nextDouble();

			if(balance<=0) {
				System.out.println("Balance should be positive enter again ");
				 balance=sc.nextDouble();
				 aobj.setBalance(balance);
			}
			else {
//				
				aobj.setBalance(balance);
			}

			return aobj;
			
		}
		
		
		public void getWithdrawAmount() {
			System.out.println("enter withraw amount greater than 0.: ");
			boolean bool=	aobj.withdraw(sc.nextInt());
			if(bool==true) {
				System.out.println("balance is : "+aobj.getBalance());
			}
			else {
				System.out.println("No enough balance : ");
			}
			
			
		}
	
		
	}


