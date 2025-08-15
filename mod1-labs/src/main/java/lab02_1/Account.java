package lab02_1;

public class Account {
	int id;
	String owner;
	double balance;

	Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}

	Account(int id, String owner) {
		this(id, owner, 0.00);
	}

	void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Error: Cannot deposit negative amount");
			return;
		}
		this.balance += amount;
	}

	void withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Error: Cannot withdraw, amount exceeds balance");
			return;
		}
		this.balance -= amount;
	}

	public String getDetails() {
		String details = this.id + " " + this.owner + " " + this.balance;
		return details;
	}

	public void addInterest() {
		this.balance += this.balance *= 0.025;
	}

}
