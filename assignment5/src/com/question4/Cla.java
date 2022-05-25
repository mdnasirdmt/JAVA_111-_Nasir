package com.question4;

public class Cla {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int num1=Integer.parseInt(args[1]);
		int fact=1;
		if(args.length==1) {
			for(int i=num; i>=1; i--) {
				fact*=i;
			}
			System.out.println("factorila is : "+fact);
		}
		else if(args.length==2){
			int value = Math.abs(num-num1);
			for(int i=value; i>=1; i--) {
				fact*=i;
			}
			System.out.println("factorila is : "+fact);
		}
	
		

	}

}
