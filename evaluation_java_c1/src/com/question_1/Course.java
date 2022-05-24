package com.question_1;

import java.util.Scanner;

public class Course {
	int courseId;
	String	courseName;
	int	courseFee;
//	Course c=new Course();
	public static void main(String[] args) {
		
		Course c=new Course();

		authenticate("Admin","1234");
		authenticate("admin","12345");

	}
	
	
	void displayCourseDetails(){		
		System.out.println("course Id is : "+courseId);
		System.out.println("course Name is: "+courseName);
		System.out.println("course Fee is: "+courseFee);
	}
	
	 static void authenticate(String username,String password){
		 Scanner sc = new Scanner(System.in);
		if(username.equals("Admin") && password.equals("1234")) {
			 
			
				
				Course c1=new Course();
//				System.out.println("hello");

				c1.courseId=sc.nextInt();
				
				c1.courseName=sc.next();
				c1.courseFee=sc.nextInt();
				c1.displayCourseDetails();
				
				
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}
	
}

