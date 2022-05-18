/*
 * CHECK WEATHER
Assume you have access to two boolean variables, isSnowing, 
and isRaining, and one double variable, temperature. 
isSnowing is true when it's snowing and false otherwise, 
isRaining is true when it's raining and false otherwise, 
and temperature gives the outdoor temperature in degrees Fahrenheit. 
Write code that prints: “Let's stay home." if it's raining, snowing, 
or below 50 degrees Fahrenheit (10 degrees Celsius), 
and prints: Let's go out!" otherwise.
 * 
 * 
 * 
 * 
 */

package com.masai;
import java.util.*;
public class CheckWeather {

	public static void main(String[] args) {
		boolean isRaining=false;
		boolean isSnowing = false;
//		double temperature=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weather i.e : snowing/ raining/ : ");
		String w=sc.next();
		System.out.println("enter temperatue : ");
		double tem=sc.nextDouble();
		
		if(w=="snowing") {
			isSnowing=true;
		}
		else if(w=="raining") {
			isRaining=true;
		}
		
		if((isSnowing) || (isRaining) || (tem>50)) {
			System.out.println("Let's stay home");
		}
		else {
			System.out.println("Let's go out!");
			
		}
	}

}


