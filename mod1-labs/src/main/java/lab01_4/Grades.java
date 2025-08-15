package lab01_4;

public class Grades {
	public static void main(String[] args) {
		String[] names = { "Alice", "Benny", "Chris", "Daryl", "Edith" };
		Integer[] marks = { 40, 55, 65, 75, 101 };

		int index = 0;
		for (int mark : marks) {
			System.out.println(names[index] + " scored " + mark + " = " + getGrade(mark));
			index++;
		}
	}

	public static String getGrade(int mark) {
		if (mark < 0 || mark > 100) {
			return "Error: marks must be between 1..100";
		}

		String result = "";

		if (mark < 50) {
			result = "Fail";
		} else if ((mark >= 50) && (mark <= 60)) {
			result = "Pass";
		} else if ((mark >= 61) && (mark <= 70)) {
			result = "Merit";
		} else if ((mark >= 71) && (mark <= 100)) {
			result = "Distinction";
		}

		return result;
	}
}
