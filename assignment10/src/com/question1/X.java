package com.question1;

public interface X {
	void sayHello();
	
	default void sayBay() {
		System.out.println("bay everyone ");
	}
	
	static void sayWelcome() {
		System.out.println("welcome to india ");
	}
	

}
