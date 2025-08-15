package lab10_1;

public class Penguin extends Bird implements ISwimmable {
	Penguin() {
		super();
	}

	public String getName() {
		return "Penguin";
	}

	public void makeNest() {
		System.out.println(getName() + " makes a nest");
	}

	@Override
	public void move() {
		System.out.println("The " + getName() + " can move");
	}

	@Override
	public void swim() {
		System.out.println("The " + getName() + " can swim");
	}
}
