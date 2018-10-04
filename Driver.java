public class Driver {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(45829, "password", 2381.82);
		
		System.out.println(account1.getID());
		// 45829
		
		System.out.println(account1.getBalance());
		// 2381.82
	
		System.out.println(account1);
		// 45829	2381.82
		
		testDeposit(-50);
		// Deposit failure
		
		testWithdraw(5000);
		// Withdrawal failure
		
		testDeposit(900);
		// Deposit success
		
		System.out.println(account1.getBalance());
		// 3281.82
		
		testWithdraw(3000);
		// Withdrawal success
		
		System.out.println(account1.getBalance());
		// 281.82
		
	}
	
	public static String testDeposit(double d) {
		if(account1.deposit(d)) {
            println("Deposit success");
        }
		else {
            println("Deposit failure");
        }
	}
	
	public static String testWtihdraw(double w) {
		if(account1.withdraw(w)) {
            println("Withdrawal success");
        }
		else {
            println("Withdrawal failure");
        }
	}
	
	
	
	
}