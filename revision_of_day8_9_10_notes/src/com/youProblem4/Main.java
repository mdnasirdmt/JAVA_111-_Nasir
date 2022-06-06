package com.youProblem4;

public class Main {
	
	static void display(String s1,String ...strings) {
		
		System.out.println("var.. args method \n"+s1);
		for(String s:strings) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		String[] str= {"hello ","hey","good"};
		Main.display("aftrenoon",str);
		

	}

}
