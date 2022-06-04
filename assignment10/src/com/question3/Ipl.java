package com.question3;

import java.util.Scanner;

public class Ipl {

	void homeTeamStadium(Stadium stadium){
		
		switch (stadium) {
		case EDEN_GARDENS_STADIUM:
			System.out.println("“This is the home ground of KKR”");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("“This is the home ground of Mumbai Indians”");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("“This is the home ground of CSK”");
			break;
			
		case M_CHINNASWAMY_STADIUM:
			System.out.println("“This is the home ground of RCB”");
			break;
		default:
			System.out.println("please enter corret name of stadium ");
		}
		
	}
	
	
	public static void main(String[] args) {
		try {
		Ipl ipl =new Ipl();
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		Stadium stadium =Stadium.valueOf(str);
		
		ipl.homeTeamStadium(stadium);
		}
		catch (Exception e) {
			System.out.println("please enter correct name as mention in enum class ");
		}
	}

}
