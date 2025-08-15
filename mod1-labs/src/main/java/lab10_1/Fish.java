package lab10_1;

public class Fish extends Animal implements ISwimmable  {
	Fish(){
		super();
		animalType = AnimalType.Fish;
	}
	
	public String getName(){
		return "Fish";
	}
	
	public void swimAbout() {
		System.out.println(getName() + " swims about a bit");
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
