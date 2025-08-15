package lab07_1;

public class Rectangle extends Shape {
	protected int sideA;
	protected int sideB;

	Rectangle(int x, int y, int sideA, int sideB) {
		super(x, y);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public int getArea() {
		return sideA * sideB;
	}

	@Override
	public String getCharacteristics() {
		String str = super.getCharacteristics();
		return str + "," + sideA + "," + sideB;
	}

	public int getPerimeter() {
		return (2 * sideA) + (2 * sideB);
	}
}
