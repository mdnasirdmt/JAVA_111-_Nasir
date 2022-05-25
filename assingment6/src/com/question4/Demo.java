/*
 * Create a Class Bank with the following fields:
branchName: String
IfscCode: String
and a non-static method:

displayDetails(): void
The above method will display the details of the bank(branchName,
ifscCode)
Create 2 child classes of the above Bank class: AxisBank, ICICIBank
with the following fields
rateOfInterest: double

In both the classes override the displayDetails() method to display their
details(branchName, ifscCode, rateOfInterest )
Inside the Axis Bank define another method :
getCreditCard(): void
This method will simply print “Get the Credit Card from the Axis bank”

Create a Demo class and define the following method:
public static Bank getBank(String bank);
implement the above method such as if we supply “axis” then it should return
Axis bank object and if supply “icici” then it should return ICICI bank object
and if we supply any invalid value then it should return null.
Note: returned bank object should have all the details.Call the above method
from the main method of Demo class by taking input from the user and
print the Bank details by calling displayDetails() method. If the returned bank
object is Axis bank then call the getCreditCard() method.
 * 
 * */
package com.question4;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Bank bank=new Bank();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bank name: axis or icici: ");
		String b=sc.next();
		Bank bankName=getBank(b);
		if(bankName != null) {
			AxisBank axis=new AxisBank();
			axis.setRateOfInterest(5);
			axis.branchName= "Bihar branch";
			axis.IfscCode="axis0015733";
			axis.displayDetails();
			axis.getCreditCard();
			System.out.println();
		}
		if(bankName!= null){
			ICICIBank ici=new ICICIBank();
			ici.setRateOfInterest(7);
			ici.branchName= "saharsa branch";
			ici.IfscCode="ICICI0015733";
			ici.displayDetails();
		}


	}
	
	public static Bank getBank(String bankName) {
		if(bankName.equals("icici")) {
			return new ICICIBank();
		}
		else if(bankName.equals("axis")) {
			return new AxisBank();
		}
		
		return null;

	}
	
}
