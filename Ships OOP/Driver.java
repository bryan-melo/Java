package lab4Part2;

public class Driver {

	public static void main(String[] args) {
		Ship[] shipArray = new Ship[6];
		shipArray[0] = new Ship("War", 2000);
		shipArray[1] = new Ship("Clara", 2008);
		shipArray[2] = new CargoShip("Mission", 2008, "Electronics", 14462, 10000);
		shipArray[3] = new CargoShip("Fronze", 1970, "Machinery", 18800, 3000);
		shipArray[4] = new CruiseShip("Ocean", 1990, 4500, 3000);
		shipArray[5] = new CruiseShip("Alice", 2000, 6500, 6500);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Ship #" + (i + 1));
			shipArray[i].display();
		}
	}
}
