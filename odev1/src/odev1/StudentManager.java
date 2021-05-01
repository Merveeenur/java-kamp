package odev1;

public class StudentManager {
	
	public void addToStudent(Student student) {
		System.out.println("Sisteme eklenen öğrenci :" +student.firstname +" " + student.lastName);
	};
	public void deleteToStudent(Student student) {
		System.out.println("Sistemden silinen öğrenci :" +student.firstname  +" " + student.lastName);
	};
	public void updateToStudent(Student student) {
		System.out.println("Sistemde güncellenen öğrenci :" +student.firstname  +" " + student.lastName);
	};
}
