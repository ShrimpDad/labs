package lab02_1;

public class Program {

	public static void main(String[] args) {
		Account account = new Account(1, "Chris");
		account.deposit(200);
		account.withdraw(100);
		System.out.println(account.getDetails());

		Account[] accounts = new Account[3];

		accounts[0] = account;
		accounts[1] = new Account(2, "Taylor", 200.0);
		accounts[2] = new Account(3, "Alex", 300.0);

		for (Account acc : accounts) {
			System.out.println(acc.getDetails());
		}

		Account myAccount = new Account(4, "Larry", 1000);
		myAccount.addInterest();
		System.out.println(myAccount.getDetails());

		Account partnerAccount = myAccount;
		partnerAccount.addInterest();
		System.out.println(myAccount.getDetails());

		processAccount(myAccount);
		System.out.println(myAccount.getDetails());

		int k = 100;

		incInt(k);

		System.out.println(k);

		Bank bank = new Bank();
		bank.addAccount("Ron", 20);
		bank.addAccount("Tim", 30);
		bank.addAccount("Kim", 40);
		Account accountResponse = bank.getAccount("Kim");
		System.out.println(accountResponse.getDetails());

		if (bank.addAccount("Mel", 50) == null) {
			System.out.println("Error adding account");
		}
		if (bank.getAccount("Oscar") == null) {
			System.out.println("Error finding account");
		}

	}

	static void processAccount(Account acc) {
		acc.addInterest();
	}

	private static void incInt(int x) {
		x++;
	}
}
