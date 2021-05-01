package odev2;

public class Instructor extends User{
	

	int nameOfCourse;

	public Instructor(int id, String firstname, String lastName, String password, String email, String courseName,
			int nameOfCourse) {
		super(id, firstname, lastName, password, email, courseName);
		this.nameOfCourse = nameOfCourse;
	}

	
	
	public int getNameOfCourse() {
		return nameOfCourse;
	}

	public void setNameOfCourse(int nameOfCourse) {
		this.nameOfCourse = nameOfCourse;
	}

}
