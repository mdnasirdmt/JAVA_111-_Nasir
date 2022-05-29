package com.question1;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public Student() {
		
	}

	public Student(int roll, String name, int marks, char grade) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	
	public void displayDetails() {
		Student s1= new Student(155, "Nasir",550, 'A');
		char g=calculateGrade();
		this.grade=g;
	}
	private char calculateGrade() {
		
		if(marks>=500 ) {
			
			return 'A';
		}
		else if(marks<500 && marks>=400) {
			return 'B';
		}
		else if(marks<400) {
			return 'C';
		}
		return 'F';
		
	}
	
	@Override
	public String toString() {
		System.out.println();
		return " Studen roll number is: "+roll +" \n Studen Name  is: "+name + "\n Studen Marks  is: "+marks+ "\n Studen Grade  is: "+grade;
	}

}
