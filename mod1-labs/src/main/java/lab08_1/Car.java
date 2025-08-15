package lab08_1;

public class Car {
	private String model;
	private int speed;

	Car(String model) {
		setModel(model);
		setSpeed(0);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate(int seconds) {
		speed += 5 * seconds;
	}

	public void getToSixty() {
		setSpeed(60);
	}

	@Override
	public String toString() {
		return "Model: " + getModel() + ", Speed: " + getSpeed();
	}
}
