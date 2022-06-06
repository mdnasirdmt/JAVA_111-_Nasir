package com.question4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter user name ");
		String uName=sc.next();
		boolean b1=	Pattern.matches("[a-zA-Z]{3,8}",uName);

		System.out.println("enter password ");
		String uP=sc.next();
		boolean b2=Pattern.matches("[a-zA-Z0-9]{3,8}",uP);

		System.out.println("enter mobile ");
		String uM=sc.next();
		boolean b3=Pattern.matches("[6789]{1}[0-9]{9}", uM);

		System.out.println("enter email ");
		String uE=sc.next();
		boolean b4=	Pattern.matches("[a-z0-9]{5,10}",uE);

		if(b1 && b2 && b3 && b4) {
			Customer customer= new Customer();
			
			customer.setUsername(uName);
			customer.setPassword(uP);
			customer.setMobileNumber(uM);
			customer.setEmail(uE);
			
			System.out.println("user name "+customer.getUsername());
			System.out.println("user password "+customer.getPassword());
			System.out.println("user mobile number "+customer.getMobileNumber());
			System.out.println("user email id "+customer.getEmail());
			
		}
		else {
			System.out.println("please enter valid information ");
		}
	}

}
