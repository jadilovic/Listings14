package Code;

public class BankAcc {

	
	private int balance;
	
	public BankAcc(int i) {
		balance = i;
	}

	public BankAcc() {
		balance = 0;
	}

	public int getBalance(){
		return balance;
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance += i;
	}

	public boolean withdraw(int i) {
		if(i > 1000)
			return false;
		balance -= i;
		if(balance < 0)
			balance -= 5;
		return true;
	}
}
