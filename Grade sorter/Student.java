package Lab5;

public class Student {
	// Instance Variables
	private int SID;	// Student ID #
	private int scores[] = new int[5];	// Quiz Scores

	// Setters
	public void setSID(int SID) { this.SID = SID; }
	public void setScores(int[] scores) { this.scores = scores; }
	
	// Getters
	public int getSID() { return SID; }
	public int[] getScores() { return scores; }

	// Methods
	public void print() {
		System.out.print(SID + "\t");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
	}
}
