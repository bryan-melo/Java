package lab4Part2;

public class CruiseShip extends Ship {
	private String shipType = "Cruise Ship";
	private int passengerCapacity;
	private int passengersOn;
	
	CruiseShip(String shipName, int yearBuilt, int passengerCapacity, int passengerOn) { 
		super(shipName, yearBuilt); 
		this.passengerCapacity = passengerCapacity;
		this.passengersOn = passengerOn;
	}
	
	// Setters
	protected void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }
	protected void setPassengersOn(int passengersOn) { this.passengersOn = passengersOn; }
	
	// Getters
	protected String getShipType() { return shipType; }
	protected int getPassengerCapacity() { return passengerCapacity; }
	protected int getPassengersOn() { return passengersOn; }

	@Override
	public void display() {
		System.out.println("This is a " + shipType + " and it is named " + getShipName());
		System.out.println(getShipName() + " was built in " + getYearBuilt());
		System.out.println("It has a passenger capacity of " + passengerCapacity + " passengers.");
		System.out.println("It currently has " + passengersOn + " and " + (passengerCapacity - passengersOn) + " spots left.\n");
	}
}
