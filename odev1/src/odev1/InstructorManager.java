package odev1;

public class InstructorManager {
	
	
	public void addToInstructor(Instructor instructor) {
		System.out.println("Sisteme eklenen e�itmen :" +instructor.firstname +" "+ instructor.lastName);
	};
	public void deleteToInstructor(Instructor instructor) {
		System.out.println("Sistemden silinen e�itmen :" +instructor.firstname +" "+ instructor.lastName);
	};
	public void updateToInstructor(Instructor instructor) {
		System.out.println("Sistemde g�ncellenen e�itmen :" +instructor.firstname +" "+ instructor.lastName);
	};

}
