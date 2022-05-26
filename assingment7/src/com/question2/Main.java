package com.question2;

public class Main extends ClassCastException{
	
	void singer() {
		System.out.println("im  A.R rahman fan");
	}
	
	void actor() {
		System.out.println("srk");
	}
	

	public static void main(String[] args) {
		
		//dynamic polymorphism // parrent refrence to child object
		ClassCastException cce = new Main();
		cce.singer();
		
		
		//object down casting
		Main main= (Main)cce;
		main.actor();
		
		
		
		//Class Cast Exception// when we try to cast parrent object to child class type to 
		//then its called calss cast exception
		
//		exapmle:
//		Main main= new ClassCastException();
		

	}

}

/*
 * ClassCast Exception in Java is one of the unchecked exceptions 
 * that occur when we try to convert
 *  one class type object into another class type. 
 *  ClassCast Exception is thrown when we
 *   try to cast an object of the parent class to the child class object.
 * 
 * */
