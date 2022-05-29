package com.question2;

public class Parrent {
	
	public void method1(){
		System.out.println("it is parrent class methode1 ");
		System.out.println("the final number is: "+number);
		
	}
	public final void method2(){
			System.out.println("it is parrent class methode2 ");
		}
	public void method3(){
		System.out.println("it is parrent class methode3 ");
	}

	final int number;
	
	public Parrent() {
		this.number = 0;
		// TODO Auto-generated constructor stub
	}
	
	public Parrent(int number) {
		this.number=number;
	}

}
