/*
 * STUDENT OBJECT DETAILS
Create a class Student with 3 instance variables:
roll: int
name: String
marks: int
Create a non-static method inside the Student class:
displayStudentDetails: void

inside the above method print all the details of the student in the following format:

Roll is :

Name is :

Marks is :

From the main method of the Student class create 2 Student class objects and
 sets the proper details to both objects and
  call the above displayStudentDetails method on the both student objects.

After calling the method on both student objects, make both the object eligible for the garbage collector.
 * 
 * 
 */


package com.masai;
import java.util.*;
public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("Roll is: "+ roll);
		System.out.println("Name is : "+ name);
		System.out.println("Marks is : "+ marks);
	}

	public static void main(String[] args) {
		//taking input of 1st student details
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st student  roll : ");
		int roll=sc.nextInt();
		System.out.println("enter 1st student name : ");
		String name=sc.next();
		System.out.println("enter 1st student marks : ");
		int marks=sc.nextInt();
		
		Student s1=new Student();
		s1.displayStudentDetails(roll,name,marks);
		
		//taking input of 1st student details
		System.out.println("enter 2nd student  roll : ");
		int roll1=sc.nextInt();
		System.out.println("enter 2nd student name : ");
		String name1=sc.next();
		System.out.println("enter 2nd student marks : ");
		int marks1=sc.nextInt();
		
		Student s2=new Student();
		s2.displayStudentDetails(roll1,name1,marks1);
		
		

	}

}
