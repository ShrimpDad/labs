package lab06_1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1, 100, "Mark");

		account.getDetails();
		doWithdrawal(account, 50);
		account.getDetails();
		doWithdrawal(account, 60);
		account.getDetails();

	}

	static void doWithdrawal(Account account, double amount) {
		try {
			account.withdraw(amount);
		} catch (IllegalArgumentException exn) {
			System.out.println(exn.getMessage());
			return;
		} catch (Exception exn) {
			System.out.println("Generic error");
			return;
		} finally {
			account.close();
		}
	}

}
