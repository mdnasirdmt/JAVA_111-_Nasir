package com.question3;

import java.util.Scanner;

public class Main {

	static void showDetails(Month month){
		
		switch (month) {
		case JAN:
			System.out.println("this is 1st month of year ");
			
			break;
		
		case FEB:
			System.out.println("this is 2nd month of year ");
			break;
			
		case MAR:
			System.out.println("this is 3rd  month of year ");
			break;
			
		case APR:
			System.out.println("this is 4rh month of year ");
			break;
			
		case MAY:
			System.out.println("this is 5th month of year ");
			break;
		case JUN:
			System.out.println("this is 6th month of year ");
			break;
		case JUL:
			System.out.println("this is 7th month of year ");
			break;
		case AUG:
			System.out.println("this is 8th month of year ");
			break;
		case SEP:
			System.out.println("this is 9th month of year ");
			break;
		case OCT:
			System.out.println("this is 10th month of year ");
			break;
		case NOV:
			System.out.println("this is 11th month of year ");
			break;
		case DEC:
			System.out.println("this is 12th month of year ");
			break;
		
//		default:
//			System.out.println("Invalid Month Name");
//			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter month name ");
		try {
		String m=sc.next();
		Month month=Month.valueOf(m);
		
		Main.showDetails(month);
		
		}catch (Exception e) {
			System.out.println("Invalid Month Name ");
		}
		
	}

}
