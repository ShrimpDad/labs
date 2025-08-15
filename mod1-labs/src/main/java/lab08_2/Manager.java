package lab08_2;

import java.util.ArrayList;

public class Manager extends Employee {
	ArrayList<Employee> employees = new ArrayList<>();

	Manager(String jobTitle, String name) {
		super("Manager", name);
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public String getInfo() {
		String returnString = "\r";
		returnString += super.toString();

		for (Employee employee : getEmployees()) {
			returnString += "\rManages: " + employee.getInfo();
		}

		return returnString;
	}

}
