package odev2;

public class Course {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInstructorname() {
		return instructorname;
	}

	public void setInstructorname(String instructorname) {
		this.instructorname = instructorname;
	}

	String name;
	int id;
	double price;
	String instructorname;
	
	
	public Course() {
		
	}
	
	public Course(int id,String name,double price,String instructorname) {
		this();
		this.id=id;
		this.name=name;
		this.price=price;
		this.instructorname=instructorname;
	
	}
	

}
