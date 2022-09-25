package lab4Part1;

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		SpecialSavings saver1 = new SpecialSavings(2000, 0.04);
		SpecialSavings saver2 = new SpecialSavings(3000, 0.04);
		
		// Saver 1
		System.out.printf("User 1%nBalance: $%.2f%n", saver1.getSavingsBalance());
		System.out.print("\nHow much would you like to deposit? ");
		saver1.deposit(input.nextDouble());
	
		System.out.print("\nHow much would you like to withdraw? ");
		saver1.withdraw(input.nextDouble());
		saver1.specialMonthlyInterestRate();
		
		// Saver 2
		System.out.printf("\n\nUser 2%nBalance: $%.2f%n", saver2.getSavingsBalance());		
		System.out.print("\nHow much would you like to deposit? ");
		saver2.deposit(input.nextDouble());
		
		System.out.print("\nHow much would you like to withdraw? ");
		saver2.withdraw(input.nextDouble());
		saver2.specialMonthlyInterestRate();
	}
}
