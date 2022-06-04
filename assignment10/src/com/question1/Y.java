package com.question1;

public interface Y {
	
	void printName();
	
	default void printMobile() {
		System.out.println("mobile number is 7008018121");
	}
	
	static void printGender() {
		System.out.println("gender is male");
	}

}
