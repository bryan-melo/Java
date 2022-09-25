import java.util.Scanner;

public class SquareRoot {
	
	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = n;
		
		while (nextGuess - lastGuess > 0.0001) {	
			nextGuess = (lastGuess + n / lastGuess) / 2;
			lastGuess = (nextGuess + n / nextGuess) / 2;
		}
		return nextGuess;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("|  Calculating the Square Root  |");
		System.out.println("---------------------------------");
		
		for (int i = 0; i < 3; i++) {
		System.out.println("\n Test case " + (i + 1));
		System.out.println("-------------");
		System.out.print("Please enter any positive integer: ");
		long numToSqrt = input.nextLong();
		
		System.out.printf("The Square root of %d is %.2f%n%n", numToSqrt, sqrt(numToSqrt));
		}
	}
}
