package odev1;

public class Student{
	int id;
	public Student(int id, String firstname, String lastName, String courseName, int numberOfCourse) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.courseName = courseName;
		this.numberOfCourse = numberOfCourse;
	}
	String firstname;
	String lastName;
	String courseName;
	int numberOfCourse;
	
	public Student() {
		
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNumberOfCourse() {
		return numberOfCourse;
	}
	public void setNumberOfCourse(int numberOfCourse) {
		this.numberOfCourse = numberOfCourse;
	}
}
