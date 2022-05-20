package com.masai;

public class Students {
	int roll;
	String name;
	String address;
	String collegeName;
	
	public static Students getStudent(boolean isFromNIT) {
		
		if(isFromNIT) {
		Students s1=new Students();
		s1.roll=155;
		s1.name="Nasir";
		s1.address="patna";
		s1.collegeName="NIT";
		
		return s1;
		}
		else {
			
			Students s1=new Students();
			s1.roll=111;
			s1.name="Raju";
			s1.address="Mumbai";
			s1.collegeName="IIT";
			
			return s1;
			
		}
	
	}

	public static void main(String[] args) {
		
		Students s= getStudent(true);
		System.out.println("name : "+s.name);
		System.out.println("Roll :"+s.roll);
		System.out.println("Adress : "+s.address);
		System.out.println("college : "+s.collegeName);
		
		System.out.println("************************");
		
		Students s1= getStudent(false);
		System.out.println("name : "+s1.name);
		System.out.println("Roll :"+s1.roll);
		System.out.println("Adress : "+s1.address);
		System.out.println("college : "+s1.collegeName);
		

	}

}
