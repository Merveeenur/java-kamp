package odev1;

public class Student {
	
	public Student() {
		
	};
	
	public Student(int id,String name,String lastName,String courseName,int numberOfCourse) {
		this();
		this.id=id;
		this.name=name;
		this.lastName=lastName;
		this.numberOfCourse=numberOfCourse;
		this.courseName=courseName;
		
	};
	
	int id;
	String name;
	String lastName;
	String courseName;
	int numberOfCourse;
}
