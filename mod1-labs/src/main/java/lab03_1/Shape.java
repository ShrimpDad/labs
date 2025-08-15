package lab03_1;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

public class Shape {
	// Attributes
	public static int worldW = 600, worldH = 600;
	public int x, y, w, h;
	private int dirX, dirY;
	private Color colour;
	private ShapeType shapeType;

	// Constants
	public enum ShapeType {
		RECTANGLE, SQUARE, CIRCLE, OVAL;
	}

	// Constructors
	public Shape(int x, int y, int w, int h, ShapeType shapeType) {
		this(x, y, w, h, 1, 1, shapeType);

	}

	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType) {
		this.shapeType = shapeType;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		Random rand = new Random();
		this.colour = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	}

	// Getters/Setters
	public ShapeType getShapeType() {
		return this.shapeType;
	}

	// Graphics
	public void draw(Graphics g) {
		g.setColor(colour);
		if (this.shapeType == ShapeType.RECTANGLE) {
			g.fillRect(x, y, w, h);
		} else if (this.shapeType == ShapeType.OVAL) {
			g.fillOval(x, y, w, h + h);
		} else if (this.shapeType == ShapeType.CIRCLE) {
			g.fillOval(x, y, w, w);
		}
		;

	}

	public void move() {
		x += dirX;
		y += dirY;

		if (x < 0) {
			x = 0;
			dirX = -dirX;
		} else if (x + w > Shape.worldW) {
			x = Shape.worldW - w;
			dirX = -dirX;
		}

		if (y < 0) {
			y = 0;
			dirY = -dirY;
		} else if (y + h > Shape.worldH) {
			y = Shape.worldH - h;
			dirY = -dirY;
		}
	}
}