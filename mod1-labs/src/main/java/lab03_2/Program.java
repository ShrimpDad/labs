package lab03_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[3];

		vehicles[0] = new Vehicle(20, 10);
		vehicles[1] = new Vehicle(20, 10);
		vehicles[2] = new Vehicle(20, 10);

		for (Vehicle vehicle : vehicles) {
			try {
				log(vehicle.getDetails());
			} catch (IOException e) {
				System.out.println("Logging failed: " + e.getMessage());
			}
		}

	}

	private static void log(String msg) throws IOException {
		File file = new File("log.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(msg + "\r\n");
		br.close();
		fr.close();
	}

}
