public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	
	public BankAccount(int aID, String pass, double bal) {
		accountID = aID;
		password = pass;
		balance = bal;
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
	
	
}