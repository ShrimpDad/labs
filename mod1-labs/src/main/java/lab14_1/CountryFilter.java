package lab14_1;

import java.util.List;
import java.util.stream.Collectors;

public class CountryFilter {
	public static List<Country> filterByRegion(List<Country> countries, String region) {
		return countries.stream().filter(country -> country.getRegion().equalsIgnoreCase(region))
				.collect(Collectors.toList());
	}
}