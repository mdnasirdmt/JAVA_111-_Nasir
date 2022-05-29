package com.question2;

public 


final class  Child extends Parrent{
	@Override
	public void method1() {
		System.out.println("it is child class methode1 overridden from parrent class ");
//		System.out.println();
	}
	
	@Override
	public void method3() {
		System.out.println("it is parrent class methode3 ovverridden from parrent class ");
	}
	
	public void method4(){
		System.out.println("it is child class methode4  ");
	}
	
	public static void main(String[] args) {
		Parrent p=new Child();
		p.method1();
		Parrent p1=new Parrent(155);
		p1.method1();
		p1.method2();
		
		p.method3();
		p1.method3();
		
		Child c=(Child)p;
		c.method4();

	}

}
