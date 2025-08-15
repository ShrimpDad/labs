package lab06_1;

public class Account implements Comparable<Account> {
	int id;
	double balance;
	String owner;

	Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}

	public Account(int id, String owner, double balance) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}

	// for lab10_2
	@Override
	public int compareTo(Account other) {
		// return (int)(this.balance - other.balance); // by balance low-high
		// return (int)(this.id - other.id); // by id low-high
		return (int) (this.owner.charAt(0) - other.owner.charAt(0)); // by name alphabetical a-z
	}

	// for lab10_2
	@Override
	public String toString() {
		return id + " " + owner + " : £" + balance;
	}

	void deposit(double amount) {
		this.balance += amount;
	}

	void withdraw(double amount) {
		System.out.printf("Trying to withdraw: £ %g%n", amount);
		if (amount > balance) {
			throw new IllegalArgumentException("Error : Insufficient funds");
			// return;
		}
		this.balance -= amount;
	}

	void close() {
		System.out.printf("This account %d is closed%n", this.id);
	}

	void getDetails() {
		System.out.printf("This account %d is for %s has a balance of: £ %g%n", this.id, this.owner, this.balance);
	}

}