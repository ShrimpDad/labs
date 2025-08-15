package lab09_1;

public class Fish extends Animal {
	Fish() {
		super();
		animalType = Animal.AnimalType.Fish;
	}

	public String getName() {
		return "Fish";
	}

	public void swim() {
		System.out.println(getName() + " swims a bit");
	}
}
