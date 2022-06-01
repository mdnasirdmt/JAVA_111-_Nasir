package com.question4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int a=length*breadth;
		return a;
	}

	@Override
	public int squareArea(int side) {
		int a=side*side;
		return a;
	}

	@Override
	public int circleArea(int radius) {
		double pi=3.14;
		double a=pi*radius*radius;
		return (int) a;
	}
	

}
