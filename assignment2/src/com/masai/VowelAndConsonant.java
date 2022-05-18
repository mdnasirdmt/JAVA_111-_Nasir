/*
 * VOWEL AND CONSONANT
Write a java application with a non-static method that will accept a character (a-z or A-Z) and 
print if that character is vowel or consonant, if we supply other than (a-z or A-Z) 
then that method should print the error message.

Call the above method from the main method of the same class 3 times,

first time by supplying a vowel

the second time by supplying a consonant

third time by supplying an invalid character
 * 
 * 
 */


package com.masai;
import java.util.*;
public class VowelAndConsonant {
	
	
	void checkVowel(char c) {
		
		if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='&'||c=='*') {
			System.out.println("Error");
			
		}
		else if(c=='a'|| c=='A' || c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
			System.out.println("Vowel ");
			
		}
		else {
			System.out.println("Consonant");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character : ");
		char c = sc.next().charAt(0);
		
		VowelAndConsonant vac=new VowelAndConsonant();
		vac.checkVowel(c);
	

		
	

	}

}
