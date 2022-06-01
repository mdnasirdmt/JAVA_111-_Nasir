package com.question2;

public class ScienceStudent extends Student{
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	@Override
	double getPercentage(){
		int total =phisicsMarks+chemistryMarks+mathsMarks;
		double marksPercent=(total/3);
		return marksPercent;
	}
}
