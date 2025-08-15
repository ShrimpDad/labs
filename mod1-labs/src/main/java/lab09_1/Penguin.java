package lab09_1;

public class Penguin extends Bird {
	Penguin() {
		super();
	}

	public String getName() {
		return "Penguin";
	}

	public void makeNest() {
		System.out.println(getName() + " makes a nest");
	}
}
