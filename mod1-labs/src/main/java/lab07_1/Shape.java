package lab07_1;

import java.awt.Color;
import java.awt.Point;

public abstract class Shape {
	protected Color colour;
	protected Point position;

	Shape(int x, int y) {
		position = new Point(x, y);

		colour = new Color(125, 125, 125);
	}

	public Color getColour() {
		return this.colour;
	}

	public Point getPosition() {
		return this.position;
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}

	public void getPosition(Point position) {
		this.position = position;
	}

	public String getCharacteristics() {
		return colour.toString() + "," + position.toString();
	}
}
