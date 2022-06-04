package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mobile mob= new Mobile();
		System.out.println("enter company name ");
		String s=sc.next();
		System.out.println("enter model name ");
		String s1= sc.next();
		mob.searchOutdatedModel(s, s1);

	}

}
