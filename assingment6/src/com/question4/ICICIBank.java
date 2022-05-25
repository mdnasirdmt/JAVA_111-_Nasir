package com.question4;

public class ICICIBank extends Bank{
	double rateOfInterest;
	void displayDetails() {
		System.out.println("ICICIBank rate Of Interest : "+this.rateOfInterest+" %");
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
