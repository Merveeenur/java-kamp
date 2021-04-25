package odev1;

public class Instructor {
	
	
	public Instructor() {
		
	}
	public Instructor(int id,String name,String lastName,int nameOfCourse) {
		this();
		this.id=id;
		this.lastName=lastName;
		this.name=name;
		this.nameOfCourse=nameOfCourse;
	
	}
	
	int id;
	String name;
	String lastName;
	int nameOfCourse;
	
}
