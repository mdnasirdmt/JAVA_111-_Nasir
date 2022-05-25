/*
 * 
 * Q1)Write the logic to reverse the String given in the parameter without
the help of predefined reverse method and return the reversed
String:(HINT use Array)
 * 
 */

package com.question1;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to reverse : ");
		 String str=sc.nextLine();
		String s= reverseStr(str);
		System.out.println(s);
		
	}

	private static String reverseStr(String str) {
		String str1="";
		for(int i=str.length()-1; i>=0; i--) {
			str1+=str.charAt(i);
		}
		
		return str1;

	}
}
