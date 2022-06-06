package com.interfaceYouPrblm3;

public interface intrfWithStatic {
	
	
		//abstract method
		void method1();
		
		//default method
		default void method2()
		{
		System.out.println("inside method2");
		}
		
		//static method
		static void method3()
		{
		System.out.println("inside method3");
		}
		


}
