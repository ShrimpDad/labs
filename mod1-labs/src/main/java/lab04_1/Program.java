package lab04_1;

public class Program {

	public static void main(String[] args) {

		// Save off artist string for convenience
		String artist = "artist";

		// Create new String Builder
		StringBuilder stringBuilder = new StringBuilder("Bruce Springsteen ");

		// Append with the StringBuilder
		stringBuilder.append("is the " + artist + " ever");

		// Insert with the StringBuilder
		stringBuilder.insert(stringBuilder.indexOf(artist), "greatest ");

		// Replace with the StringBuilder
		stringBuilder.replace(stringBuilder.indexOf(artist), stringBuilder.indexOf(artist) + artist.length(),
				"rock singer");

		// Output String
		System.out.println(stringBuilder.toString());

	}

}
