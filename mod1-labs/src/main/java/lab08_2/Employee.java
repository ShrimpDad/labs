package lab08_2;

public class Employee {
	private int id;
	private static int idCount;
	private String jobTitle;
	private String name;

	Employee(String jobTitle, String name) {
		setJobTitle(jobTitle);
		setName(name);
		setID();
	}

	public int generateID() {
		idCount += 1;
		return idCount;
	}

	public int getID() {
		return id;
	}

	public String getInfo() {
		return toString();
	}

	private void setID() {
		this.id = generateID();
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	private void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return getJobTitle() + " " + getName() + " (" + getID() + ")";
	}
}
