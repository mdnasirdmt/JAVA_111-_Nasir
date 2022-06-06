package com.youProblemException;

import java.io.IOException;
import java.util.Scanner;

public class YouPrblmException {
	
	

	static void getEligibility(int age) throws IOException{
		
		if(age<18) {
			throw new ArithmeticException("invalid age ");
		}
		else {
			System.out.println("you are eleigble ");
		}

		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter age ");
		int age=sc.nextInt();
		try {
			YouPrblmException.getEligibility(age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println("age galat");
		}
		
	}

}
