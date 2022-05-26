package com.question1;

public class Main {

	public static void main(String[] args) {
		

		Bird b1 = new Parrot();
		b1.fly();
		
		//object downCasting 
		Parrot p = (Parrot)b1;
		p.sing();
		
	}	

	

}
