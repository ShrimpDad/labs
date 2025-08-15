package lab07_1;

public class Sphere extends Circle {

	Sphere(int x, int y, int radius) {
		super(x, y, radius);
	}

	public double getVolume() {
		return Math.pow(radius, 3);
	}
}
