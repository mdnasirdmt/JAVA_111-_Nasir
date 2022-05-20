package com.masai;

public class Question4 {
	
	void OddEven(int num) {
		if(num%2==0) {
			
			int i=num;
			while(i%10!=0) {
				i++;
			}
			System.out.println(i);
		}
		else if(num<0) {
			System.out.println("Error");
		}
		else if(num%2!=0) {
			System.out.println(num);
		}
		
	}

	public static void main(String[] args) {
		
		Question4 q=new Question4();
		q.OddEven(12);

	}

}
