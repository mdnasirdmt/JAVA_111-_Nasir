package com.question2;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	@Override
	double getPercentage() {
			int total =historyMarks+civicsMarks;
			double marksPercent=(total/2);
			return marksPercent;
	}

}
