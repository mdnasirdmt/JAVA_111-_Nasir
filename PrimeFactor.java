/*
 * PRIME FACTORIAL
The prime factors of a number are all of the integers below that number that are divisible into the number as well as 1. For example, the prime factors of 12 are 1,2,3,4,6, and 12.
Write a Java class with a static method that will take a number and print all the prime factorial of that number.
The Supplied number should be between 2 and 100. otherwise, it should print ?Invalid number?.
Call this method from the main method by suppling any valid argument.
 * 
 */


package com.masai;
import java.util.*;
public class PrimeFactor {

	public static void main(String[] args) {
		System.out.println("enter number : ");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		factor(num);
		

	}

	private static void factor(int num) {

		if(num>=2) {
			for(int i=1; i<num; i++) {
				if(num%i==0) {
					System.out.println(i+ " ");
				}
			}
			
		}
		else {
			System.out.println("invalid number");
		}
		
		
	}

}
