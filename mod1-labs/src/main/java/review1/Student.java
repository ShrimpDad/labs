package review1;

public class Student extends Person {

	private int studentID;

	Student(String name, String email, int studentID) {
		super(name, email);
		this.studentID = studentID;
	}

}
