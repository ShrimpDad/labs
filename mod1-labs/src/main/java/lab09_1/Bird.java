package lab09_1;

public abstract class Bird extends Animal {
	Bird() {
		super();
		animalType = Animal.AnimalType.Bird;
	}

	public String getName() {
		return "Bird";
	}

	public abstract void makeNest();

}
