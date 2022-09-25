package Lab5;

public class driver {

	public static void main(String[] args) {
		Student[] lab2 = new Student[40];
		
		lab2 = Util.readFile("/Users/bryanmelo/Documents/GitHub/Eclipse-2022-Summer-CIS35A/Labs/src/Lab5/sample.txt", lab2);
		
		Statistics statlab2 = new Statistics();
		
		statlab2.findlow(lab2);
		statlab2.findhigh(lab2);
		statlab2.findavg(lab2);
		
		System.out.println("Stud\tQ1\tQ2\tQ3\tQ4\tQ5\n");
		for (Student student : lab2) {
			student.print();
		}
		statlab2.print();
	}
}
