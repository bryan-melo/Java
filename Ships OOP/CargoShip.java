package lab4Part2;

public class CargoShip extends Ship {
	private String shipType = "Cargo Ship";
	private String cargoType;
	private int shipWeightCapacity;
	private int cargoWeight;
	
	CargoShip(String shipName, int yearBuilt, String cargoType, int shipWeightCapacity, int cargoWeight) { 
		super(shipName, yearBuilt); 
		this.cargoType = cargoType;
		this.shipWeightCapacity = shipWeightCapacity;
		this.cargoWeight = cargoWeight;
	}
	
	// Setters
	protected void setCargoType(String cargoType) { this.cargoType = cargoType; }
	protected void setShipWeightCapacity(int shipWeightCapacity) {	this.shipWeightCapacity = shipWeightCapacity; }
	protected void setCargoWeight(int cargoWeight) { this.cargoWeight = cargoWeight; }
	
	// Getters
	protected String getShipType() { return shipType; }
	protected String getCargoType() { return cargoType; }
	protected int getShipWeightCapacity() { return shipWeightCapacity; }
	protected int getCargoWeight() { return cargoWeight; }

	@Override
	public void display() {
		System.out.println("This is a " + shipType + " and it is named " + getShipName() + '.');
		System.out.println(getShipName() + " was built in " + getYearBuilt() + '.');
		System.out.println("It transports " + cargoType + '.');
		System.out.println("It has a weight capacity of " + shipWeightCapacity + " TEU.");
		System.out.println("It currently has " + cargoWeight + " TEU. of cargo loaded.\n");
	}
}
