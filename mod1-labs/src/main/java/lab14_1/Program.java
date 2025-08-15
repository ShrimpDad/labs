package lab14_1;

import java.io.IOException;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        streamCustomers();
        
        streamCountries();
        
    }
    
    public static void streamCountries() {
    	String jsonFile = "src\\main\\resources\\countries.json";

        try {
            // Read the JSON file
            List<Country> countries = JSONReader.readCountries(jsonFile);

            // Filter customers by region
            String region = "Europe";
            List<Country> filteredCountries = CountryFilter.filterByRegion(countries, region);

            // Display the filtered customers
            System.out.println("Countries in " + region + ":");
            filteredCountries.forEach(country ->
                System.out.println(country.getName() + " (Population: " + country.getPopulation() + ")")
            );

        } catch (IOException e) {
            System.err.println("Error reading the JSON file: " + e.getMessage());
        }
    }
    
    public static void streamCustomers() {
    	String jsonFile = "src\\main\\resources\\customerData.json";

        try {
            // Read the JSON file
            List<Customer> customers = JSONReader.readCustomers(jsonFile);

            // Filter customers by city
            String targetCity = "London";
            List<Customer> filteredCustomers = CustomerFilter.filterByCity(customers, targetCity);

            // Display the filtered customers
            System.out.println("Customers in " + targetCity + ":");
            filteredCustomers.forEach(customer ->
                System.out.println(customer.getName() + " (ID: " + customer.getId() + ")")
            );

        } catch (IOException e) {
            System.err.println("Error reading the JSON file: " + e.getMessage());
        }
    }
    
}
