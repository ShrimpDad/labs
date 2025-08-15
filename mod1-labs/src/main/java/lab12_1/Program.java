package lab12_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		String[] courses = readCSV("src/main/resources/course.txt");
		String[] trainers = readCSV("src/main/resources/trainer.txt");

		boolean appendToEnd = true;
		String delimiter = "/";
		try (BufferedWriter fileWriter = new BufferedWriter(
				new FileWriter("src/main/resources/trainersAndCourses.txt", appendToEnd))) {

			// Write all course info
			for (String course : courses) {
				fileWriter.write(course + delimiter);

			}

			// Write to new line
			fileWriter.newLine();
			// fileWriter.write("\n"); // add new line // use buffer to wrap for newline
			// features

			// Write all trainer info
			for (String trainer : trainers) {
				fileWriter.write(trainer + delimiter);
			}

		} catch (IOException exception) {
			String errorMessage = exception.getClass().getName() + ": " + exception.getMessage();
			System.out.println(errorMessage);
		}
	}

	private static String[] readCSV(String inFile) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
			String line = br.readLine();
			if (line != null) {
				return line.split(",");
			}
		}
		return new String[0];
	}

}