package com.youProblemExp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Prblm1 {
				
		
		public static void main(String[] args) {
			Prblm1 prblm1=new Prblm1();
//			Pattern p = Pattern.compile("a*");
			Pattern p = Pattern.compile("a?");
//		Pattern p = Pattern.compile("\\s");
//		Pattern p = Pattern.compile("\\S");
//		Pattern p = Pattern.compile("\\d");
//		Pattern p = Pattern.compile("\\D");
//		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
//		Pattern p = Pattern.compile("[0-9]");
//		Pattern p = Pattern.compile("[abcx]");
//		Pattern p = Pattern.compile("[^abcx]");
//		Pattern p = Pattern.compile("[^abcx]");
		
//		Matcher m = p.matcher("7b@z #9x");
		Matcher m = p.matcher("abaabaaab");
		while (m.find()) {
			System.out.println(m.start() + "-------" + m.group());
		}

	}

}
