package Relationship;

public class Account {
	
	
	private String name;
	private long accountNumber;
	private long contactNumber;
	private String city;
	private double balance;
	private int pin;
	
	public Account(String name, long accountNumber, long contactNumber, String city, double balance, int pin) {

		this.name = name;
		this.accountNumber = accountNumber;
		this.contactNumber = contactNumber;
		this.city = city;
		this.balance = balance;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
	

}
