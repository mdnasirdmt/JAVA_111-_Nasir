/*
 * CRICKET SCORE
Write a Java class with a static method that will take 5 positive numbers as a parameter which will represent: 1s, 2s, 3s, fours and sixes scored by the batsman.

implement the above method to compute the total run scored by that batsman.

Call this method from the main method of that class and print the result.
 * 
 */

package com.masai;
import java.util.*;
public class CricketScore {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  score 1st : ");
		int firstScore=sc.nextInt();
		System.out.println("enter  score 2nd : ");
		int secondScore=sc.nextInt();
		System.out.println("enter  score 3rd : ");
		int thirdScore=sc.nextInt();
		System.out.println("enter  score 4th: ");
		int fourtScore=sc.nextInt();
		System.out.println("enter  score 5th : ");
		int fifthScore=sc.nextInt();
		
		totalRun(firstScore,secondScore,thirdScore,fourtScore,fifthScore);
		
		

	}

	private static void totalRun(int firstScore, int secondScore, int thirdScore, int fourtScore, int fifthScore) {
		
		int total_Runs= firstScore+secondScore+thirdScore+fourtScore+fifthScore;
		System.out.println(total_Runs);
				
		
	}

}
