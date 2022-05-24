package com.question_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter number of student you want to enter : ");
		int n=sc.nextInt();
		System.out.println("==========================================");
		int []arr=new int[n];
		int c=0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter roll number:  ");
			s.setRollNumber(sc.nextInt());
			
			System.out.println("Enter the Name :");
			s.setStudentName(sc.next());
			
			System.out.println("Enter the marks : ");
			s.setMarks(sc.nextInt());
			
			System.out.println();
			
			System.out.println("student details :"+ ++c);
			System.out.println("student roll : "+s.getRollNumber());
			System.out.println("student name : "+s.getStudentName());
			System.out.println("student marks : "+s.getMarks());
			
			System.out.println("==========================================");
			
	
		}
		

	}

}
