package odev1;

public class Instructor {
	int id;
	public Instructor(int id, String firstname, String lastName, int nameOfCourse) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.nameOfCourse = nameOfCourse;
	}

	String firstname;
	String lastName;
	int nameOfCourse;
	
	public Instructor() {}

	

	public int getNameOfCourse() {
		return nameOfCourse;
	}

	public void setNameOfCourse(int nameOfCourse) {
		this.nameOfCourse = nameOfCourse;
	}
	
}
