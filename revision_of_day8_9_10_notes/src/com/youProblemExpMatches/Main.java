package com.youProblemExpMatches;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n);
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n);
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
	
	}

		

	

}
