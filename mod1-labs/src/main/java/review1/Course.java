package review1;

import java.util.HashMap;

public class Course {
	private String courseName;
	private HashMap<Student, Integer> students;

	Course(String courseName) {
		this.courseName = courseName;
		this.students = new HashMap<>();
	}

	public void addStudent(Student student, int grade) {
		if (students.containsKey(student)) {
			System.out.println("Error: Cannot add student twice to course");
		} else if (grade < 0 || grade > 100) {
			System.out.println("Error: Cannot add grade outside of range 0-100");
		} else {
			students.put(student, grade);
		}

	}

	public void removeStudent(Student student, int grade) {
		if (!students.containsKey(student)) {
			System.out.println("Error: Student already removed");
		} else {
			students.remove(student);
		}

	}

	public void printStudentList() {
		System.out.println("\r-------\r" + courseName + ": \r-------");
		students.forEach((student, grade) -> {
			System.out.printf("%-20s Grade: %-3d%n", student.getDetails(), grade);
		});
	}

}
