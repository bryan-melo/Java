package lab3;

import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		
		FileIO a1 = new FileIO("/Users/bryanmelo/Documents/GitHub/Eclipse-2022-Summer-CIS35A/Labs/src/lab3/Salesdat.txt");
		Franchise a2 = a1.readData();
		Driver call = new Driver();	// Call string methods to eliminate clutter
		Scanner input = new Scanner(System.in);
		String[] stores = {"Store 1", "Store 2", "Store 3", "Store 4", "Store 5", "Store 6"};
		
		int store = 0;
		while (store != 7) {
			// First Menu ~ Choose a store
			System.out.println("\nSELECT A STORE");
			System.out.println("===============");
			System.out.print(call.displayStoreMenu());
			store = input.nextInt();
			
			// Check user input
			while (store <= 0 || store > 7) {
				System.out.print("Invalid Number, please try again: ");
				store = input.nextInt();
			}
			if (store  == 7) {
				System.out.println("\nThank you, have a good day!");
				System.exit(0);
			}
			store = store - 1;
	
			int select = 0;	
			// Second Menu ~ Choose what information to display
			while (select != 8) {	
				System.out.println("\n\n" + stores[store] + " Options");
				System.out.print("~~~~~~~~~~~~~~~~");
				System.out.print(call.displayOptionMenu());
				select = input.nextInt();
				// Check user input 
				while (select > 8 || select <= 0) {
					System.out.print("Invalid number, please try again: ");
					select = input.nextInt();
				}
				a2.getStores(store).printValues(a2, store, select);
			}		
		}
	}
	
	public String displayStoreMenu() {
		return "\n(1) Store 1\n(2) Store 2\n(3) Store 3\n(4) Store 4\n(5) Store 5\n"
				+ "(6) Store 6\n(7) Quit Program\n\nEnter a number: ";
	}
	
	public String displayOptionMenu() {
		return "\n(1) Total Sales for Each Week\n(2) Average Daily Sales for Each Week"
				+ "\n(3) Total Sales for all Weeks\n(4) Average Weekly Sales\n(5)"
				+ " Week with Highest Amount in Sales\n(6) Week with Lowest Amount in Sales"
				+ "\n(7) Display all Options\n(8) Exit Store\n\nEnter a number: ";
	}
}
