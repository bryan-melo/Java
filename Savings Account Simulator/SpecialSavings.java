package lab4Part1;


public class SpecialSavings extends SavingsAccount {

	// Constructor
	public SpecialSavings(double balance, double interestRate) {
		super(balance, interestRate);
		
	}
	
	// Methods
	public void specialMonthlyInterestRate() {
		if (getSavingsBalance() > 10000) {
			setSavingsBalance(getSavingsBalance() + (getSavingsBalance() * 0.10 / 12));
			System.out.printf("\nNew balance after 10%% interest: $%.2f%n", getSavingsBalance());
		}
		else {
			setAnnualInterestRate(0.04);
			calculateMonthlyInterest();
		}
	}
}
	
