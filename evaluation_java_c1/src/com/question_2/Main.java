package com.question_2;

public class Main {

	public static void main(String[] args) {
		
		Car c=new Car();
		
		Car c1= new Car("2022 abc","audi","Black","turbo");
		
		System.out.println("Car model : "+c1.getModel());
		System.out.println("Car company name :"+c1.getCompanyName());
		System.out.println("Car has turbo : "+c1.getEngine());
		System.out.println("Car color : "+c1.getColor());
		Engine.turboEnable();
	}

}
