package lab14_1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class JSONReader

{
	public static List<Customer> readCustomers(String filePath) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(filePath), new TypeReference<List<Customer>>() {
		});
	}
	
	public static List<Country> readCountries(String filePath) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new File(filePath), new TypeReference<List<Country>>() {
		});
	}
}