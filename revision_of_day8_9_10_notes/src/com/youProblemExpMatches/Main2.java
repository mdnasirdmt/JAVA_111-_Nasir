package com.youProblemExpMatches;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main2 {

	public static void main(String[] args) {
		
//		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
//		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
//		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)
		
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8953038949"));//true
		System.out.println(Pattern.matches("[789][0-9]{9}", "7953403899"));//true
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true
		System.out.println("by metacharacters ...");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
		System.out.println(Pattern.matches("[789]{1}\\D{9}", "7@#$%%^&*("));//true (starts from 3)
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "798273657@"));//false (starts from 3)
	}

}
