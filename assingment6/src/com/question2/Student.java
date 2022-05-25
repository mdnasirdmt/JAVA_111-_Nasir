package com.question2;

public class Student {
	String studId;
	String StudName;
	double examFee;
	
	void displayDetails(){
		System.out.println("exam fee is: "+examFee);
	}
	double payFee(int i) {
		double rem=this.examFee-i;
		
		return rem;
		
	}
	
	public Student() {
		
	}
}

class DayScholar extends Student{
	double hostelFee;
	double transportFee() {
		return examFee;
	}
	public DayScholar() {
		
	}
}

class Hosteller extends Student{
	double hostelFee;
	public Hosteller() {
		
	}
	
}

class Main{
	public static void main(String[] args) {
		DayScholar ds=new DayScholar();
		ds.studId="fp0_155";
		ds.StudName="Nasir";
		ds.examFee=10000;
		ds.displayDetails();
		double payFee=ds.payFee(5000);
		System.out.println("Remainig fee is : "+payFee);
		double transportFee=ds.transportFee();
		System.out.println("Transport Fee is :"+transportFee);
		System.out.println();
		
		Hosteller h=new Hosteller();
		h.studId="fp02_158";
		h.StudName="Khan";
		h.examFee=200000;
		h.displayDetails();
		double payfee=h.payFee(4000);
		System.out.println("Remainig fee is :"+payfee);
	}
}

