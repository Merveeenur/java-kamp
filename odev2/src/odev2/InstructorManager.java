package odev2;

public class InstructorManager extends UserManager{
	
	public void addCourse(Course course,Instructor instructor) {
		System.out.println(instructor.getFirstName()+" adl� e�itmen "+course.getName()+ " adl� kursu eklendi");
	}

}
