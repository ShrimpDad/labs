package lab10_1;

public class Duck extends Bird implements ISwimmable, IFlyable{
	Duck(){
		super();
	}
	
	public String getName(){
		return "Duck";
	}
	
	public void makeNest() {
		System.out.println(getName() + " makes a nest");
	}
	
	@Override
	public void move() {
		System.out.println("The " + getName() + " can move");
	}
	
	@Override
	public void fly() {
		System.out.println("The " + getName() + " can fly");
	}
	
	@Override
	public void swim() {
		System.out.println("The " + getName() + " can swim");
	}
}
