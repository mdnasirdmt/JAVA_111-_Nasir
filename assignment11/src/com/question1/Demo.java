package com.question1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String adhar, String mob) {
		
//		Pattern pattern=Pattern.compile(name);
	boolean b1=	Pattern.matches("[a-zA-Z]{3,8}",name);
	boolean b2=Pattern.matches("[0-9]{12}",adhar);
	boolean b3=Pattern.matches("[6789]{1}[0-9]{9}", mob);
		
//		System.out.println(b1+" "+b2+" "+b3);
//		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
		
	if(b1 && b2 && b3) {
		return true;
	}
	else{
		return false;
	}
		
	}
	
	public static void main(String[] args) {
		Demo demo =new Demo();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name: ");
		String name=sc.next();
		
		
		System.out.println("enter aadhaar number : ");
		String adhar=sc.next();
//				
		System.out.println("enter mobile number : ");
		String mob=sc.next();
		
//		citizen.mobileNumber=mob;
		
		
	boolean b=	demo.validate(name, adhar, mob);
	
	if(b==true) {
		Citizen citizen=new Citizen();
		
		citizen.setName(name);
		citizen.setAadharNumber(adhar);
		citizen.setMobileNumber(mob);
		
		
		System.out.println(citizen.getName());
		System.out.println(citizen.getAadharNumber());
		System.out.println(citizen.getMobileNumber());

	}
	else {
		System.out.println("plz enter correct details ");
	}

	}

}
