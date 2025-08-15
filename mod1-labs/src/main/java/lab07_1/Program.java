package lab07_1;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		int sideA = 10;
		int sideB = 10;
		int radius = 4;

		Rectangle rectangle = new Rectangle(x, y, sideA, sideB);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());

		Circle circle = new Circle(x, y, radius);

		Sphere sphere = new Sphere(x, y, radius);

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(sphere);
		shapes.add(circle);
		shapes.add(rectangle);

		for (Shape shape : shapes) {
			System.out.println(shape.getCharacteristics());
		}

	}

}
