package com.question2;
import java.util.*;


public class ArraySum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter row : ");
			int r=sc.nextInt();
			System.out.println("enter column : ");
			int c=sc.nextInt();
			System.out.println("enter row and columns value :");
			int [][]arr=new int[r][c];
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("sum of columns value in array: ");
			for(int i=0; i<arr.length; i++) {
				int sum=0;
				for(int j=0; j<arr[i].length; j++) {
					if(arr[j][i]%2==0) {
						sum+=arr[j][i];
					}
				}
				System.out.println(sum);
			}
		}
		
		

		
		
		
		

	}

}
