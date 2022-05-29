package com.question3;

public class MultipleInheritance {
	void method1() {
		System.out.println("MultipleInheritance class method");
	}
	
}

class parrent{
	void method1() {
		System.out.println("parrent methode");
	}

}
class child extends MultipleInheritance,parrent{
	
	child c=new child();
	c.method1();
	
}



// due to multiple inheritance jvm will confuse
//which class methode will call 
//and it will give ambigous error 


/*
 * 
 Q3) Why is multiple inheritance not
 supported in Java at class level ?
 
 **/
