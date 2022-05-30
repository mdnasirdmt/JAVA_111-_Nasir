package com.question4;

public class Main {
	
	

	public static void main(String[] args) {
	
		Student student=new Student();
		
		Instructor inst= new Instructor();
		
		Person newStudent= generatePerson(student);
		Person newTeacher = generatePerson(inst);
		
//		
		System.out.println(newStudent.toString());
		System.out.println(newTeacher.toString());
	}
	
	public static Person generatePerson(Person person) {
		Person persion = new Person();
		
		Student student = new Student();
		student.courseEnrolled="111";
		student.courseFee=10000;
		student.studentId=155;
		
		Instructor instructor=new Instructor();
		instructor.instructorId=157;
		instructor.salary=50000;
		
		persion.add.city="banglore";
		persion.add.pinCode="500004";
		persion.add.state="karnatak";
		persion.name="abcd";
		persion.gender="male";
	
//		System.out.println(persion.toString());
		
		return person;
		
	}

}
