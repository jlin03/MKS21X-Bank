public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	
	public BankAccount(double bal, int aID, String pass) {
		accountID = aID;
		password = pass;
		balance = bal;
	}
	
	public String toString() {
		return(accountID + "\t" + balance);
	}
	
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	public int getID() {
		return accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double d) {
		if(d < 0) {
			return false;
		}
		else {
			balance += d;
			return true;
		}
	}
	
	public boolean withdraw(double w) {
		if(w > balance || w < 0) {
			return false;
		}
		else {
			balance -= w;
			return true;
		}
	}

	private boolean authenticate(String pass) {
		return(pass == this.password);
	}
	
	public boolean transferTo(BankAccount other, double amount, String pass) {
		if(this.authenticate(pass) && this.withdraw(amount)) {
			other.deposit(amount);
			return true;
		}
		else {
			return false;
		}


	}





	
}
