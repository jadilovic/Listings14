package Code;

public class BankAccount {

	private int balance = 0;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {

		if (amount < this.balance) {
			balance -= amount;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int getBalance() {
		return balance;
	}
}