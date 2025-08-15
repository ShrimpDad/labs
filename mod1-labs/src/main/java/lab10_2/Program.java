package lab10_2;

import java.util.ArrayList;
import java.util.Collections;

import lab06_1.Account;

public class Program {

	public static void main(String[] args) {

		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account(100, "Bob", 1000));
		accounts.add(new Account(500, "Linda", 3000));
		accounts.add(new Account(300, "David", 2000));
		Collections.sort(accounts);

		for (Account acc : accounts) {
			System.out.println(acc.toString());
		}
	}

}
