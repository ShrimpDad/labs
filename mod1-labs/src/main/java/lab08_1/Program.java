package lab08_1;

import java.util.ArrayList;

public class Program {

	private static ArrayList<Car> cars = new ArrayList<>();

	public static void main(String[] args) {

		Car normCar = new Car("Fiat 500");
		Car raceCar = new RacingCar("F1", "Verstappen", 2);

		cars.add(normCar);
		cars.add(raceCar);

		process();

	}

	public static void process() {
		for (Car car : cars) {
			car.getToSixty();
			car.accelerate(2);
			System.out.println(car.toString());
			if (car instanceof RacingCar) {
				System.out.println(((RacingCar) car).getDriver() + " is the driver");
			}
		}
	}
}
