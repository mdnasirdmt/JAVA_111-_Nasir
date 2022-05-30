package com.question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		double avg=0;
		System.out.println("enter number of student : ");
		int numOfStudent=sc.nextInt();
		String []arr=new String[numOfStudent];
		
		System.out.println("enter student details");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter student name: ");
			arr[i]=sc.next();
			s.setName(arr[i]);
			System.out.println("enter "+arr[i] +" student address: ");
			s.setAddress(sc.next());
			System.out.println("enter "+arr[i] +" student marks: ");
			s.setMarks(sc.nextInt());
			System.out.println("enter "+arr[i] +" student roll: ");
			s.setRoll(sc.nextInt());
			
			
			System.out.println("Name: "+s.getName());
			System.out.println("Address: "+s.getAddress());
			System.out.println("Roll: "+s.getRoll());
			System.out.println("Marks: "+s.getMarks());
			avg+=s.getMarks()/arr.length;
			System.out.println("*************************");
		}
		System.out.println("avrage marks is: "+avg);
	}

}
