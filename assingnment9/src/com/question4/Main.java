package com.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area area= new Area();
		System.out.println("enter rectangle length and breadth : ");
//		int a1=area.rectangleArea(sc.nextInt(), sc.nextInt());
		System.out.println(area.rectangleArea(sc.nextInt(), sc.nextInt()));
		System.out.println("enter square side : ");
//		int a2=area.squareArea(sc.nextInt());
		System.out.println(area.squareArea(sc.nextInt()));
		System.out.println("enter circle radious : ");
//		int a3=area.circleArea(sc.nextInt());
		System.out.println(area.circleArea(sc.nextInt()));

	}

}
