
public class Driver {
    public static void main(String[] args) {
		// Testing default constructor
		System.out.println("Testing Coin Toss Simulator");
		System.out.println("---------------------------");

		Coin coin = new Coin();
		System.out.println("\nSide of coin after using default constructor: " + coin.getSideUp());
		
		// Testing toss method
		coin.toss();
		System.out.println("\nAfter one toss: " + coin.getSideUp());
		
		// Testing toss method with loop
		System.out.println("\nTossing " + Coin.NUM_TOSSES + " times:\n");	
		coin.loopToss();
	}
}
