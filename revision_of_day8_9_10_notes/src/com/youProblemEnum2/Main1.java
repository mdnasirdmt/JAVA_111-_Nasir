package com.youProblemEnum2;

public class Main1 {
	
	
	public void printCity(City city){
		if(city != null){
		System.out.println("our service is available ");
		city.message();
		System.out.println(city.numberofTowers);
		}
		else
		System.out.println("invalid city");
		}


	public static void main(String[] args) {
		
		Main1 m1=new Main1();
		m1.printCity(City.BIHAR);

	}

}
