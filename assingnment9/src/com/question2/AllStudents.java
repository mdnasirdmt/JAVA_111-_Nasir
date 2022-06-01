package com.question2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		///science student details
		Scanner sc=new Scanner(System.in);
		Student student= new ScienceStudent();
		System.out.println("enter science  student name : ");
		student.name=sc.next();
		System.out.println("enter science  student Address : ");
		student.address=sc.next();
		
		ScienceStudent student1=(ScienceStudent)student;
		System.out.println("enter science  student physics marks  : ");
		student1.phisicsMarks=sc.nextInt();
		System.out.println("enter science  student chemistry marks  : ");
		student1.chemistryMarks=sc.nextInt();
		System.out.println("enter science  student maths marks  : ");
		student1.mathsMarks=sc.nextInt();
		double p=student.getPercentage();
		System.out.println("science student marks percentage is : "+p);
		
		///history student details
		Student student2= new HistoryStudent();
		System.out.println("enter history  student name : ");
		student2.name=sc.next();
		System.out.println("enter history  student Address : ");
		student2.address=sc.next();
		
		HistoryStudent student3=(HistoryStudent)student2;
		System.out.println("enter student history marks  : ");
		student3.historyMarks=sc.nextInt();
		System.out.println("enter student civics  marks  : ");
		student3.civicsMarks=sc.nextInt();
		double p1=student2.getPercentage();
		System.out.println("history student marks percentage is : "+p1);
	}

}
