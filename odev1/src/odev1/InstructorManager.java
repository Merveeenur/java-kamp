package odev1;

public class InstructorManager {
	
	
	public void addToInstructor(Instructor instructor) {
		System.out.println("Sisteme eklenen eðitmen :" +instructor.name +" "+ instructor.lastName);
	};
	public void deleteToInstructor(Instructor instructor) {
		System.out.println("Sistemden silinen eðitmen :" +instructor.name +" "+ instructor.lastName);
	};
	public void updateToInstructor(Instructor instructor) {
		System.out.println("Sistemde güncellenen eðitmen :" +instructor.name +" "+ instructor.lastName);
	};

}
