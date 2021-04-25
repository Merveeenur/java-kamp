package odev1;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id,String name,double price,String instructorname) {
		this();
		this.id=id;
		this.name=name;
		this.price=price;
		this.instructorname=instructorname;
	
	}
	String name;
	int id;
	double price;
	String instructorname;
	

}
