package odev1;

public class CourseManager {
	
	public void addToCourse(Course course) {
		System.out.println("Sisteme eklenen ders :" +course.name);
		
	};
	public void deleteToCourse(Course course) {
		System.out.println("Sistemden silinen ders :" +course.name);
		
	};
	public void updateToCourse(Course course) {
		System.out.println("Sistemde güncellenen ders :" +course.name);
		
	};

}
