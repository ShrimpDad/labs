package lab07_1;

public class Circle extends Shape {
	protected int radius;

	Circle(int x, int y, int radius) {
		super(1, 1);
		setRadius(radius);
	}

	public double getArea() {
		return (double) (radius * radius * Math.PI);
	}

	public double getCircumference() {
		return (double) (2 * radius * Math.PI);
	}

	public double getDiameter() {
		return (double) (2 * radius);
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String getCharacteristics() {
		String str = super.getCharacteristics();
		return str + "," + radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
