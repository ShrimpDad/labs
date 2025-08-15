package lab09_1;

public class Duck extends Bird {
	Duck() {
		super();
	}

	public String getName() {
		return "Duck";
	}

	public void makeNest() {
		System.out.println(getName() + " makes a nest");
	}
}
