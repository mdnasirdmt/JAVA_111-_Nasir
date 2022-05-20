package com.masai;

public class Demo {
	
	public Demo() {
		System.out.println("inside demo() constructor");
	}
	
	public Demo(String s) {
		System.out.println("my name is : "+s);
	}
	
	public Demo(int i) {
		System.out.println("roll number is : "+i);
	}
	
	public Demo(float f) {
		System.out.println("today temperature  is : "+f);
	}
	

	public static void main(String[] args) {
		
		Demo d1= new Demo();
		 d1= new Demo("Nasir");
		 d1= new Demo(155);
		 d1= new Demo(40.30f);
		
		

	}

}
