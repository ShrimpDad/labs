package lab01_2;

public class Program {

	public static void main(String[] args) {
		int mark = 5220;
		System.out.println(getGrade(mark));
		System.out.printf("For your mark %d/100 grade is: %s", mark, getGrade(mark));
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