package com.question3;

import java.util.Arrays;

public class PrimeInArray {

	public static void main(String[] args) {
		PrimeInArray pia=new PrimeInArray();
		int[] arr = {10,12,5,50,11,14,15};
		int[] arr1=pia.findAndReturnPrimeNumbers(arr);
		if(arr1==null) {
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			for(int i:arr1) {
				System.out.println(Arrays.toString(arr1));
			}
		}
		

	}

	private int [] findAndReturnPrimeNumbers(int[] arr) {
		int []a = null;
		int fact=0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=1; j<=arr[i]; j++) {
				if(arr[i]%j==0) {
					fact++;
					break;
				}	
			}
		}
		if(fact>2) {
			return a;
		}
		return arr;
	}

}
