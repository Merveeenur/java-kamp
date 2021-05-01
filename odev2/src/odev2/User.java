package odev2;

public class User {
	
	int id;
	String firstName;
	String lastName;
	String password;
	String email;
	String courseName;
	
	public User() {
		
	}
	
	public User(int id, String firstname, String lastName, String password, String email,String courseName) {
		this();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.courseName=courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
}
