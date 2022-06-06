package com.youProblemEnum2;

public class Main {

	public static void main(String[] args) {
		//color
		Color color[]=Color.values();
		for (Color color2 : color) {
			System.out.println(color2);
		}
		
		System.out.println();
		
		//item
		Item[] item=Item.values();
		for (Item item2 : item) {
			System.out.println();
			item2.info();
			System.out.println(item2.toString());
		}
		

	}

}
