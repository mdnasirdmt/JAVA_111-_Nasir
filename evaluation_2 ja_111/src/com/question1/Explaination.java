/*
 * 
 * Q1) Explain the difference between IS-A and Has-A relationship 
 * with the help of an
example and explain about access modifiers 
and their accessibility?/
 */

package com.question1;

public class Explaination extends Has_A_Rel{
	
	
	
//	Has_A_Rel h=new Has_A_Rel();

	public static void main(String[] args) {
		Has_A_Rel h=new Has_A_Rel();
		System.out.println(h.x);
		h.method1();
		
	}

}
//Has A relation 
//when we create a object of class in differnet class then it is called Has A Relation


///IS A Relation
//when we create sub class of of class using extend keyword then it is called IS A RELATION 
//in this method we inherit the parrent class properties to child class.


//Access Modifier
//in java there is 4 type of access modifer
//1. public = in public we can access from any where in java project.
//2. private= using private we can access in class only out side of class we canot access.
//3. protected= using this we can acess in side package only.
//4. default= by default we can access within packege and outside of packege by creating sub class.S


