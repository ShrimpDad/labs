package lab05_2;

import java.util.HashMap;

public class Zoo {

	HashMap<String, Integer> animalMap = null;

	String[] originalAnimals = { "Zebra", "Lion", "Buffalo" };

	String[] newAnimals = { "Zebra", "Gazelle", "Buffalo", "Zebra" };

	Zoo() {
		this.animalMap = new HashMap<>();

		addAnimals(originalAnimals);
		addAnimals(newAnimals);

	}

	void addAnimals(String[] animals) {
		for (String animal : animals) {
			int value = 1;
			if (this.animalMap.containsKey(animal)) {
				value = this.animalMap.get(animal);
				this.animalMap.put(animal, value + 1);
			} else {
				this.animalMap.put(animal, value);
			}
		}
	}

	public void displayAnimalData() {
		for (String key : this.animalMap.keySet()) {
			System.out.printf("Animal %-12s %d%n", key, this.animalMap.get(key));
		}

	}

}
