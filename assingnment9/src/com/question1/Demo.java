package com.question1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount>1000) {
			TajHotel taj=new TajHotel();
			return taj;
		}else if(amount>200 && amount<1000){
			RoadSideHotel road=new RoadSideHotel();
			return road;
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		Demo demo=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount : ");
		int amnt=sc.nextInt();
		
		Hotel hotel=demo.provideFood(amnt);
		if(hotel instanceof TajHotel) {
			((TajHotel) hotel).welcomeDrink();
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}else if(hotel instanceof RoadSideHotel){
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}
	}

}
