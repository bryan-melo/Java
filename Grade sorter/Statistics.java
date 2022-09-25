package Lab5;

public class Statistics {
	
	public int [] lowscores = new int [5];
	public int [] highscores = new int [5];
	public float [] avgscores = new float [5];

	public void findlow(Student [] a) {
		for (int i = 0; i < lowscores.length; i++) {
			lowscores[i] = 100;
			for (int j = 0; j < a.length; j++) {
				if (a[j].getScores()[i] < lowscores[i]) {
					lowscores[i] = a[j].getScores()[i];
				}
			}
		}
	}

	public void findhigh(Student [] a) {		
		for (int i = 0; i < highscores.length; i++) {
			highscores[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j].getScores()[i] > highscores[i]) {
					highscores[i] = a[j].getScores()[i];
				}
			}
		}
	}

	public void findavg(Student [] a) {
		for (int i = 0; i < avgscores.length; i++) {
			avgscores[i] = 0;
			for (int j = 0; j < a.length; j++) {
				avgscores[i] += a[j].getScores()[i];
			}
			avgscores[i] /= a.length;
		}	
	}
		
	public void printLowScores() {
		for (int i = 0; i < lowscores.length; i++) {
			System.out.print(lowscores[i] + " ");
		}
	}
	
	public void printHighScores() {
		for (int i = 0; i < highscores.length; i++) {
			System.out.print(highscores[i] + " ");
		}
	}
	
	public void printAvgScores() {
		for (int i = 0; i < avgscores.length; i++) {
			String s = String.valueOf(avgscores[i]);
			for (int j = 0; j < 4; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	public void print() {	
		System.out.print("\n\nHigh Score ");
		printHighScores(); 
		System.out.print("\nLow Scores ");
		printLowScores();
		System.out.print("\nAverage Scores ");
		printAvgScores();
	}
}
