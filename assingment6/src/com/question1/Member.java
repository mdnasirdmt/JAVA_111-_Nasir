package com.question1;

public class Member {
	String	Name ; 
	int	Age ; 
	String	Phone_number ; 
	String	Address ; 
	double	Salary ; 
	void printSalary(){
		
		System.out.println("Name is : "+Name);
		System.out.println("Age is : "+Age);
		System.out.println("Phone number is : "+Phone_number);
		System.out.println("Address is : "+Address);
		System.out.println("Salary is : "+Salary);
		
		System.out.println();
	}
	void type() {
		System.out.println("Employeee data ");
		System.out.println("***************");
	}
	void type1() {
		System.out.println("Manager  data ");
		System.out.println("***************");
	}
}


class Employee extends Member{
	String	Specialisation ; 
}

class Manager extends Member{
	String	Department ; 
}


class Main{
	public static void main(String[] args) {
		//employee data
		Employee emp=new Employee();
		emp.Name="Nasir";
		emp.Age=25;
		emp.Salary=50000;
		emp.Address="Bihar";
		emp.Specialisation="full stack web devloper using java";
		emp.type();
		emp.printSalary();
		
		//manager data
		Manager mng=new Manager();
		mng.Name="Md Nasir uddin";
		mng.Age=25;
		mng.Phone_number="7008018121";
		mng.Salary=100000;
		mng.Department="project manager";
		mng.Address="Bihar saharsa";
		mng.type1();
		mng.printSalary();
	}
}