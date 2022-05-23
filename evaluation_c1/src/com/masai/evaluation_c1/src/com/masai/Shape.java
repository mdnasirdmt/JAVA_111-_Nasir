package com.masai;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle();
		r.breadth=5;
		r.length=6;
		
		Circle c=new Circle();
		c.radius=5;
		
		Square s=new Square();
		s.side=10;
		
		s.area();
		c.area();
		r.area();
		
		

	}

}
