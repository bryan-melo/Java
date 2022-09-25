import java.util.Scanner;
import java.lang.Math;

public class LoanAmortizationSchedule {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for loan information
		for (int i = 0; i < 3; i++) {
			System.out.println("\nTest case " + (i + 1));
			System.out.println("-------------");
		
			System.out.print("\nLoan Amount: ");
			double amount = input.nextDouble();
		
			System.out.print("Number of Years: ");
			int numberOfYears = input.nextInt();
			int months = numberOfYears * 12;	
		
			System.out.print("Annual Interest Rate: ");
			double monthlyInterest = input.nextDouble() * 0.01 / months;

			// Calculations
			double x = Math.pow((1 + monthlyInterest), months);	// to simplify equation
			double monthlyPayment = amount * (monthlyInterest * x) / (x - 1);
			double totalPayment = monthlyPayment * months;
		
			// Print to Console						
			double principal;
			double interest;
			double balance = amount;
		
			System.out.printf("%nMonthly Payment: %.2f%n", monthlyPayment);
			System.out.printf("Total Payment: %.2f%n%n", totalPayment);
			System.out.println("Payment\t\tInterest\tPrincipal\tBalance");
		
			for (int j = 1; j <= months; j++) {
				interest = monthlyInterest * balance;
				principal = monthlyPayment - interest;
				balance = balance - principal;
				System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f%n", j, interest, principal, balance);
			}
			System.out.println("\n");
		}
	}

}