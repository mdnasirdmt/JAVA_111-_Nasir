package com.question4;

public class AxisBank extends Bank{
	double rateOfInterest;
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	void displayDetails() {
		System.out.println("AxisBank rate Of Interest : "+this.rateOfInterest+" %");
		System.out.println("Barnch Name id :"+this.branchName);
		System.out.println("bank ifsc code is : "+this.IfscCode);
	}
//	public double getRateOfInterest() {
//		return rateOfInterest;
//	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	

}
