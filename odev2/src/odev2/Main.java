package odev2;


public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1=new Instructor( 1,"Engin","Demirog","123456","engin@gmail.com","java ,c#",2);
		Instructor instructor2=new Instructor( 2,"Kerem","Varýþ","123456","kerem@gmail.com","amgular",1);
		
		Student student1=new Student(1,"Merve Nur","Teke","Java + React Geliþtirme,C# + Angular Geliþtirme","45545","merve@gmail.com",1,90);
//		Student student2=new Student(2,"Gizem","Bostan","C# + Angular Geliþtirme","45545","gizem@gmail.com",2,90);
//		Student student3=new Student(3,"Melike","Varlik","Java + React Geliþtirme","45545","melike@gmail.com",3,90);
		
		Course course1 =new Course(1,"Java + React Geliþtirme", 0 , "Engin Demirog");
		Course course2 =new Course(2,"C# + Angular Geliþtirme", 0 , "Engin Demirog");
		Course course3 =new Course(3,"Programlamaya Giriþ", 0 , "Engin Demirog");
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		userManager.delete(instructor2);
		studentManager.add(student1);
		instructorManager.update(instructor1);
		instructorManager.addCourse(course2, instructor1);
		instructorManager.addCourse(course1, instructor1);
		instructorManager.addCourse(course3, instructor2);
	
	}

}
