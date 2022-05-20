package com.masai;

public class Student {
	JavaBean jb=new JavaBean();

	public Student(int roll, int age, String name, int marks) {
		
		if((age>18 && age <60) && (marks>0 && marks<500)){
			System.out.println(name);
			System.out.println(roll);
			System.out.println(age);
			System.out.println(marks);
		}
		else {
			System.out.println("please enter  age and marks in range ,\n 18<age<60, 0<marks<500");
		}

		
		System.out.println("*******************");
	}
	
	public Student() {
		System.out.println(jb.name);
		System.out.println(jb.roll);
		System.out.println(jb.age);
		System.out.println(jb.marks);
		
	}

	public static void main(String[] args) {	
		Student s1=new Student(58, 28, "srk", 98);
		Student s2=new Student();

	}

}
