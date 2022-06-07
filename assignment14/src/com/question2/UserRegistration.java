package com.question2;

import java.util.Scanner;

public class UserRegistration {

	static void  registerUser(String username,String userCountry)throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("“User registration done successfully”");
		}
		else {
			throw new InvalidCountryException("Registration is only for indian ");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name ");
		String name = sc.next();
		
		System.out.println("enter your country name ");
		String cName = sc.next();
		
		try {
			registerUser(name, cName);
		} catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
