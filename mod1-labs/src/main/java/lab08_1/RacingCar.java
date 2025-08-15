package lab08_1;

public class RacingCar extends Car {
	private String driver;
	private int turboFactor;

	RacingCar(String model, String driver, int turboFactor) {
		super(model);
		setDriver(driver);
		setTurboFactor(turboFactor);
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getTurboFactor() {
		return turboFactor;
	}

	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}

	public void accelerate(int seconds) {
		super.accelerate(seconds);
		setSpeed(getSpeed() * turboFactor);
	}

	@Override
	public String toString() {
		return "Model: " + getModel() + ", Speed: " + getSpeed() + ", Driver: " + getDriver() + ", TurboFactor: "
				+ getTurboFactor();
	}
}
