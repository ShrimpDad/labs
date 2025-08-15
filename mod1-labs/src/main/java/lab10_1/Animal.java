package lab10_1;

public abstract class Animal implements IMovable {
	AnimalType animalType;
	String name = getName();

	Animal() {
		this.name = getName();
	};

	public abstract String getName();

	public String getAnimalType() {
		return animalType.name();
	};

	public void move() {

	};
}
