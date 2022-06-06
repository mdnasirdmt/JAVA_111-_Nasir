package com.youProblemEnum;

public class Main {
	
	@Override
	public String toString() {
		
		return "Nasir";
	}

	public static void main(String[] args) {
		
		Color color=Color.BLUE;
		Color color1=Color.GREEN;
		Color color2=Color.RED;
		
		Main main=new Main();
		System.out.println(main.toString());
		
		System.out.println(color+" "+color1+" "+color2);

	}

}
