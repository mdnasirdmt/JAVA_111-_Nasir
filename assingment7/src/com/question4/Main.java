package com.question4;

public class Main {

	public static void main(String[] args) {
		
		Animal [] animal=new Animal[3];
		
		animal[0]=new Dog();
		animal[1]=new Cat();
		animal[2]=new Tiger();
		
		animal[0].makeNoise();
		animal[0].eat();
		animal[0].walk();

		animal[1].makeNoise();
		animal[1].eat();
		animal[1].walk();
		
		animal[2].makeNoise();
		animal[2].eat();
		animal[2].walk();
		

	}

}
