/*
 * JAVA SWITCH CASE
Write a static method that will take a city as a parameter: and implement this method as follows:
if city.equals("Mumbai") then print
	"Financial city"
if city.equals("Kolkata") then print
	"City of Joy"
if city.equals("Delhi") then print
	"Capital of the country"
if city.equals("Bangalore") then print
	"Cyber City"
otherwise
	"May be Other Indian City"
This method should be implemented using switch-case
Call the above method from the main method by supplying a proper city name.
 * 
 * 
 */


package com.masai;
import java.util.*;
public class SwitchLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your city name : ");
		String city=sc.next();
		
		printCity(city);

	}

	private static void printCity(String city) {

		switch(city) {
		case "Mumbai":
			System.out.println("Financial city");
			break;
		case "Kolkata":
			System.out.println("City of Joy");
			break;
		case "Delhi":
			System.out.println("Capital of india");
			break;
		case "Bangalore":
			System.out.println("Cyber city");
			break;
		default:
			System.out.println("May be Other Indian City");
		
		}
		
	}

}
