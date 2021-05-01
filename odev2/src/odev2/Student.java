package odev2;

public class Student extends User{
	
	
	int studentId;
	int points;
	
	public Student() {
		
	}
	public Student(int id, String firstname, String lastName, String password, String email, String courseName,
			int studentId, int points) {
		super(id, firstname, lastName, password, email, courseName);
		this.studentId = studentId;
		this.points = points;
	}
	
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

}
