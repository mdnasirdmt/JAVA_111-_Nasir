package com.question4;

public class Person {

	String 	name ;

	String gender;
	Address add= new Address();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name ="+name + "Gender="+ gender+ "Address= "+ add;
	}
}
