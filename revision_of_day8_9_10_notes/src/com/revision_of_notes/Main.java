package com.revision_of_notes;

public class Main {
	
	public static void getNoise(Animal animal){
		animal.makeNoise();
		}
		

	public static void main(String[] args) {
		
		
		Animal animal =new Dog();
		Main.getNoise(animal);
		
		Animal animal1 =new Cat();
		Main.getNoise(animal1);
			
		

	}

}
