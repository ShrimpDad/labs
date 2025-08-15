package lab01_3;

import java.util.Scanner;

public class Utils {

	public Scanner s = new Scanner(System.in);

	public int getInt(String prompt) {
		System.out.println(prompt);
		int result = s.nextInt();
		s.nextLine();
		return result;
	}

	public int getInt() {
		int result = s.nextInt();
		s.nextLine();
		return result;
	}

	public String getString(String prompt) {
		System.out.println(prompt);
		String result = s.nextLine();
		s.nextLine();
		return result;
	}

	public String getString() {
		String result = s.nextLine();
		s.nextLine();
		return result;
	}

	public void close() {
		s.close();
	}
}
