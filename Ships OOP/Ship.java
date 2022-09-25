package lab4Part2;

public class Ship {
	private String shipType = "Ship";
	private String shipName;
	private int yearBuilt;
	
	Ship(String shipName, int yearBuilt) {
		this.shipName = shipName;
		this.yearBuilt = yearBuilt;
	}

	// Setters
	protected void setShipName(String shipName) { this.shipName = shipName; }
	protected void setYearBuilt(int yearBuilt) { this.yearBuilt = yearBuilt; }
	
	// Getters
	protected String getShipType() { return shipType; }
	protected String getShipName() { return shipName; }
	protected int getYearBuilt() {	return yearBuilt; }
	
	// Display
	public void display() {
		System.out.println("This is a " + shipType + " and it is named " + shipName + '.');
		System.out.println(shipName + " was built in " + yearBuilt + ".\n");
	}
}
