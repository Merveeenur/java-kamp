package odev1;

public class StudentManager {
	
	public void addToStudent(Student student) {
		System.out.println("Sisteme eklenen ��renci :" +student.firstname +" " + student.lastName);
	};
	public void deleteToStudent(Student student) {
		System.out.println("Sistemden silinen ��renci :" +student.firstname  +" " + student.lastName);
	};
	public void updateToStudent(Student student) {
		System.out.println("Sistemde g�ncellenen ��renci :" +student.firstname  +" " + student.lastName);
	};
}
