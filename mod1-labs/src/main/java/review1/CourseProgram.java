package review1;

import java.util.ArrayList;

public class CourseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Course> courses = new ArrayList<>();
		Course course1 = new Course("MAT101");
		Course course2 = new Course("MAT102");

		courses.add(course1);
		courses.add(course2);

		Student student1 = new Student("Gary", "gary@mail", 1);
		Student student2 = new Student("Larry", "larry@mail", 1);
		Student student3 = new Student("Barry", "barry@mail", 1);

		course1.addStudent(student1, 90);
		course2.addStudent(student1, 70);

		course1.addStudent(student2, 60);
		course2.addStudent(student2, 101);
		course2.addStudent(student2, -10);

		course1.addStudent(student3, 90);
		course1.addStudent(student3, 90);
		course2.addStudent(student3, 80);

		course1.removeStudent(student3, 90);
		course1.removeStudent(student3, 90);
		course1.addStudent(student3, 90);

		for (Course course : courses) {
			course.printStudentList();
		}
	}

}
