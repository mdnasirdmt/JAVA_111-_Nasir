package com.question3;

public class Main extends DynamicPolymorphism{
	
	@Override
	void sing() {
		System.out.println("im a bathroom singer ");
	}

	public static void main(String[] args) {
		
		
		//when parrent class refrence pointing to child class object 
		//then it is called dynamic polymorphism
		//it is used to override the parrent method
		
		
		//example
		DynamicPolymorphism dp= new Main();
		
		dp.sing();
	}

}

/**
 * Dynamic polymorphism is a process or mechanism in which a 
 * call to an overridden method is to 
 * resolve at runtime rather than compile-time. 
 * It is also known as runtime polymorphism or dynamic method dispatch.
 *  We can achieve dynamic polymorphism 
 * by using the method overriding.
 * 
 * 
 * /
 */