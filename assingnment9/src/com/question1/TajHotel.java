package com.question1;

public class TajHotel implements Hotel{
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		
	}

	@Override
	public void chickenBiryani() {
		System.out.println("chicken biryani from taj hotel");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("masala dpsa from taj hotel ");
		
	}
}
