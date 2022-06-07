package com.question1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Account account=new Account();
		
		System.out.println("enter account nuber ");
		account.setAccountNumber(sc.next());
		
		System.out.println("enter deposit amount ");
		account.deposit(sc.nextInt());
		
		System.out.println("enter withdraw amount ");
		try {
			System.out.println("your balance is "+account.withdraw(sc.nextInt()));
		} catch (InsufficientFundsException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
