package lab03_1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends JPanel {

	// Attributes
	ArrayList<Shape> shapes = new ArrayList<>(); // Initialise x number of shapes ( should encapsulate )

	// Main
	public static void main(String[] args) {
		new Game();
	}

	// Game Logic
	Game() {

		// For each shape in shapes ( should encapsulate )
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {

			// Set size
			int w = 20 + rand.nextInt(31);
			int h = w;

			// Set position
			int x = rand.nextInt(Shape.worldW - w);
			int y = rand.nextInt(Shape.worldH - h);

			// Set speed
			int dx = 1 + rand.nextInt(20);
			int dy = 1 + rand.nextInt(20);

			// Set direction
			if (rand.nextBoolean())
				dx = -dx;
			if (rand.nextBoolean())
				dy = -dy;

			// Set shape type
			Shape.ShapeType[] types = Shape.ShapeType.values();
			Shape.ShapeType randomType = types[rand.nextInt(types.length)];

			// Invoke full constructor
			shapes.add(new Shape(x, y, w, h, dx, dy, randomType));
		}

		// Setup frame
		JFrame frame = new JFrame();
		this.setPreferredSize(new Dimension(Shape.worldW, Shape.worldH));
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();

			}
		};
		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});

		// Allow window to update world size
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Shape.worldW = getWidth();
				Shape.worldH = getHeight();
			}
		});
	}

	// Graphics
	public void draw() {
		for (Shape shape : shapes) {
			shape.move();
		}
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Draw World from origin
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		// Draw each shape
		for (Shape shape : shapes) {
			shape.draw(g);
		}
	}
}