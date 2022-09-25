package lab4Part1;

public class Driver1 {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00, 0.04);
		SavingsAccount saver2 = new SavingsAccount(3000.00, 0.04);
		
		System.out.println("Annual Interest Rate at 4%\n");
		System.out.printf("User 1%nBalance: $%.2f%n", saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		
		System.out.printf("%nUser 2%nBalance: $%.2f%n", saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		
		System.out.println("\n\nAnnual Interest Rate at 5%\n");
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
	}

	
}
