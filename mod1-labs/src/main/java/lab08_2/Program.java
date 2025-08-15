package lab08_2;

public class Program {

	public static void main(String[] args) {
		Manager manager1 = new Manager(null, "Tod");
		Manager manager2 = new Manager(null, "Wendle");

		manager2.addEmployee(new Employee("Cashier", "Nathan"));
		manager1.addEmployee(new Employee("HR", "Tim"));
		manager2.addEmployee(new Employee("Cashier", "Graham"));
		manager1.addEmployee(new Employee("Finance", "Ted"));
		manager1.addEmployee(new Employee("Sales", "Tam"));
		manager2.addEmployee(new Employee("Stockroom", "Boris"));

		SkilledWorker skEmp = new SkilledWorker("Mechanic", "Steve");
		skEmp.addSkill("Welding", 3);
		skEmp.addSkill("Knitting", 7);
		manager1.addEmployee(skEmp);

		System.out.println(manager1.getInfo());
		System.out.println(manager2.getInfo());
	}

}
