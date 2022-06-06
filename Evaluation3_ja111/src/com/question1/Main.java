package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size ");
		int[] arr=new int[sc.nextInt()];
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter array element ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the index you want to access ");
		try {
			int ind= sc.nextInt();
			int x=arr[ind];
			System.out.println(x);
			
		}catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	
		
	}

}
