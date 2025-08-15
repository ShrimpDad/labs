package lab03_2;

public class RegistrationPlateFactory {
	private static int index = 0;
	private static String[] registrationPlates = { "LA05 XYZ", // London
			"NG58 JKL", // Nottingham
			"MA13 HYP", // Manchester
			"BX06 TUV", // Birmingham
			"CF67 QRS", // Cardiff
			"YS09 PQR", // Yorkshire
			"WD21 NML", // Exeter area (Western region)
			"KR16 FGH", // Northampton
			"SJ04 UVW", // Glasgow
			"LV22 ABC", // Liverpool
			"WX19 XYZ" // Bristol
	};

	public static RegistrationPlate getNextPlate() {
		String plate = registrationPlates[index];
		index += 1;
		RegistrationPlate regPlate = new RegistrationPlate(plate);

		return regPlate;
	}
}
