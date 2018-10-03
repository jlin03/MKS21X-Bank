public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	
	public BankAccount(int aID, String pass, double bal) {
		accountID = aID;
		password = pass;
		balance = bal;
	}
	
	public String toString() {
		return(accountID + "/t" + balance);
	}
	
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	public int getID() {
		return balance;
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
		if(w > balance) {
			return false;
		}
		else {
			balance -= w;
			return true;
		}
	}
	
}