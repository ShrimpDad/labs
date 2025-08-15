package lab09_1;

public class Seagull extends Bird {
	Seagull() {
		super();
	}

	public String getName() {
		return "Seagull";
	}

	public void makeNest() {
		System.out.println(getName() + " makes a nest and steals a chip");
	}
}
