public class Driver {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(45829, "password", 2381.82);
		
		System.out.println(account1.getID());
		// 45829
		
		System.out.println(account1.getBalance());
		// 2381.82
	
		System.out.println(account1);
		// 45829	2381.82
		
		System.out.println(testDeposit(-50, account1));
		// Deposit failure
		
		System.out.println(testWithdraw(5000, account1));
		// Withdrawal failure
		
		System.out.println(testDeposit(900, account1));
		// Deposit success
		
		System.out.println(account1.getBalance());
		// 3281.82
		
		System.out.println(testWithdraw(3000, account1));
		// Withdrawal success
		
		System.out.println(account1.getBalance());
		// 281.82
		
	}
	
	public static String testDeposit(double d, BankAccount a) {
		if(a.deposit(d)) {
            return("Deposit success");
        }
		else {
            return("Deposit failure");
        }
	}
	
	public static String testWithdraw(double w, BankAccount a) {
		if(a.withdraw(w)) {
            return("Withdrawal success");
        }
		else {
            return("Withdrawal failure");
        }
	}
	
	
	
	
}