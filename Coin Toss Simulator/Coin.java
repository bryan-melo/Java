import java.util.Random;

public class Coin {
	// Instance Variable
	private String sideUp;
	
	// Constructor
	public Coin() {
		toss();
	}
	
	// Getter
	public String getSideUp() {
		return this.sideUp;
	}
	
	// Instance Method
	public void toss() {
		int randomNum;
			
		Random rand = new Random();
		randomNum = rand.nextInt(2);	// 0 to 1
			
		if (randomNum == 1) {
			this.sideUp = "heads";
		}
		else {
			this.sideUp = "tails";
		}
	}
	
	static final int NUM_TOSSES = 20; // used in toss method
	
	// Toss method
	public void loopToss() {
		int numHeads = 0;
		int numTails = 0;
		
		for (int i = 0; i < NUM_TOSSES; i++) {
			toss();
			System.out.println("Toss " + (i + 1) + ": "
								+ getSideUp());
			if (getSideUp() == "heads") {
				numHeads++;
			}
			else {
				numTails++;
			}
		}
		// Display results
		System.out.println("\nNumber of heads: " + numHeads);
		System.out.println("Number of tails: " + numTails);
	}	
}
