package lab09_1;

public abstract class Animal {
	AnimalType animalType;
	String name = getName();

	Animal() {
		this.name = getName();
	};

	enum AnimalType {
		Fish, Amphibian, Reptil, Mammal, Bird, Invertebrate
	}

	public abstract String getName();

	public String getAnimalType() {
		return animalType.name();
	};
}
