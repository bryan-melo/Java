public class Personal_Data {

	private String name;
	private String address;
	private int age;
	private long phoneNumber;
	
	// Constructors
	public Personal_Data() {
		this.name = "";
		this.address = "";
		this.age = 0;
		this.phoneNumber = 0000000000;	// (000) 000 - 0000
	}
	
	public Personal_Data(String name, String address, 
						int age, long phoneNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// Display
	public String printData() {
		return ("\n\nName: " + this.name + "\nAddress: " + this.address
				+ "\nAge: "+ this.age + "\nPhone Number: " + this.phoneNumber);
	}
}
