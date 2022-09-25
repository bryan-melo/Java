import java.util.Scanner;


public class Main {
	// Main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Please enter name: ");
		String iName = input.nextLine();
			
		System.out.print("Please enter address: ");
		String iAddress = input.nextLine();
			
		System.out.print("Please enter age: ");
		int iAge = input.nextInt();
			
		System.out.print("Please enter phone number: ");
		long iPhoneNumber = input.nextLong();
			
			
		// Instance variables + 3 different methods/test cases
		Personal_Data userData1 = new Personal_Data(iName, iAddress, iAge, iPhoneNumber);
		Personal_Data userData2 = new Personal_Data("Robert", "21250 Stevens Creek Blvc, Cupertino, CA 95014", 35, 1234567899);
		Personal_Data userData3 = new Personal_Data();
			
		userData3.setName("Mario");
		userData3.setAddress("3207 Cabrillo Avenue, Santa Clara, CA 95051");
		userData3.setAge(100);
		userData3.setPhoneNumber(1235557777);
			
		// Print out 3 test cases
		System.out.println("Printing 3 test cases\n\n");
		System.out.println(userData1.printData());
		System.out.println(userData2.printData());
		System.out.println(userData3.printData());
	}
}
