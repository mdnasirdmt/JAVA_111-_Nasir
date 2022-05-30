package com.question4;

public class Student extends Person{
	 int studentId;

	 String courseEnrolled;
	 int courseFee;
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student id="+studentId + "course id= "+courseEnrolled+ "course fee= "+ courseFee;
	}
}
