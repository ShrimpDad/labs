package review1;

public class Person {
	private String name;
	private String email;

	Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getDetails() {
		return this.name + " (" + this.email + ")";
	}

}
