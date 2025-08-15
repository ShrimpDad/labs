package lab03_2;

public class Vehicle {
	int speed;
	int lane;
	int distanceTravelled;
	RegistrationPlate registrationPlate;

	Vehicle(int speed, int lane) {
		this.speed = speed;
		this.lane = lane;
		this.registrationPlate = RegistrationPlateFactory.getNextPlate();
	}

	public void accelerate(int speedIncrement) {
		speed += speedIncrement;
		if (speed > 200) {
			this.speed = 200;
		}

	}

	public void brake(int speedDecrement) {
		speed -= speedDecrement;
		if (speed < 0) {
			speed = 0;
		}
	}

	public String getDetails() {
		return "Speed: " + speed + "\rLane: " + lane + "\rDistance Travelled: " + distanceTravelled + "\rPlate: "
				+ registrationPlate.getNumber();
	}
}
