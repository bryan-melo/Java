package lab4Part1;


public class SavingsAccount {

	static double annualInterestRate;
	private double savingsBalance;
	
	// Constructors	
	public SavingsAccount(double balance, double interestRate) {
		this.savingsBalance = balance;
		SavingsAccount.annualInterestRate = interestRate;
	}
	
	// Setters
	protected void setSavingsBalance(double ammount) { savingsBalance = ammount; }
	public void setAnnualInterestRate(double rate) { annualInterestRate = rate; }
	
	// Getters
	protected double getSavingsBalance() { return savingsBalance; }
	public double getAnnualInterestRate() { return annualInterestRate; }

	// Methods
	public void calculateMonthlyInterest() {
		savingsBalance += savingsBalance * annualInterestRate / 12;
		System.out.printf("\nNew balance after interest: $%.2f%n", savingsBalance);
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
	public void deposit(double ammountDeposited) {
		savingsBalance += ammountDeposited;
		System.out.printf("Balance after deposit: $%.2f%n", savingsBalance);
	}
	
	public void withdraw(double ammountWithdrawn) {
		savingsBalance -= ammountWithdrawn;
		System.out.printf("New balance after withdrawal: $%.2f%n", savingsBalance);
	}
}
