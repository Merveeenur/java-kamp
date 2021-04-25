package odev1;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor( 1, "Engin","Demirog",3);
		
		Course course1 =new Course(1,"Java + React Geliştirme", 0 , "Engin Demirog");
		Course course2 =new Course(2,"C# + Angular Geliştirme", 0 , "Engin Demirog");
		Course course3 =new Course(3,"Programlamaya Giriş", 0 , "Engin Demirog");
		
		Student student1=new Student(1,"Merve Nur","Teke","Java + React Geliştirme,C# + Angular Geliştirme",2);
		Student student2=new Student(2,"Gizem","Bostan","C# + Angular Geliştirme",1);
		Student student3=new Student(3,"Melike","Varlik","Java + React Geliştirme",1);
		Student student4=new Student(4,"Emirhan","Teke","Java + React Geliştirme,Programlamaya Giriş",2);
		
		Course[] courses =new Course[]{course1,course2,course3};
		Student[] students = {student1,student2,student3,student4};
		
		 for (Student student : students) {
			System.out.println(student.name + student.lastName+ " "+"Adlı öğrenci ; "+" " + student.courseName +" " +"Adlı dersi almıştır. " );
		}

		 System.out.println("\n**************************************\n");

		 for (Course course : courses) {
			System.out.println(course.name +" "+"Adlı kursu ; "+ " "+ course.instructorname +" "+"Adlı hoca vermektedir.");
		}
		
		 System.out.println("\n**************************************\n");
		 
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);

		InstructorManager instructorManager=new InstructorManager();
		instructorManager.updateToInstructor(instructor1);
		
		StudentManager studentManager =new StudentManager();
		studentManager.deleteToStudent(student1);
	}

}
