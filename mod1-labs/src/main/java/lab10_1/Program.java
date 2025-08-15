package lab10_1;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Penguin());
		animals.add(new Duck());
		animals.add(new Fish());

		for (Animal animal : animals) {
			System.out.println("-------------");
			System.out.println(animal.getName() + " is a " + animal.getAnimalType());

			if (animal instanceof Bird ) {//b) {
				((Bird)animal).makeNest();
				//b.makeNest();
			} else if (animal instanceof Fish ) {//f) {
				((Fish) animal).swimAbout();
				//f.swimAbout();
			}

			if (animal instanceof IMovable ) {//m) {
				((IMovable)animal).move();
			}
			if (animal instanceof IFlyable ) {//f) {
				((IFlyable)animal).fly();
			}
			if (animal instanceof ISwimmable ) {//s) {
				((ISwimmable)animal).swim();
			}
		}
	}

}
