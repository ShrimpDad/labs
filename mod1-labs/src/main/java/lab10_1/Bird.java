package lab10_1;

public abstract class Bird extends Animal {
	Bird() {
		super();
		animalType = AnimalType.Bird;
	}

	public String getName() {
		return "Bird";
	}

	public abstract void makeNest();

	public void move() {

	};

}
