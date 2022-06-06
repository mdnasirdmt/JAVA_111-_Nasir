package com.youProblemExpMatches;
import java.util.regex.Pattern;
public class SplitBymatches {

	public static void main(String[] args) {
		String str="Hello how are you whats up";
		String[] str1=str.split(" "); //using space
		for (String i : str1) {
			System.out.println(i);
		}
		System.out.println("**********");
		
		Pattern p = Pattern.compile("\\s");//using meta 
		String[] s = p.split("Hello how are you");
		for(String s1:s) {
		System.out.println(s1);
		}

	}

}
