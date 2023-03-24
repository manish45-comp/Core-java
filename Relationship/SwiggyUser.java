package Relationship;

public class SwiggyUser {

	private int cId;
	private String name;
	private String address;
	private long contactNumber;
	private String orderedFood;	
	
	public SwiggyUser(String name, String address, long contactNumber, String orderedFood) {
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.orderedFood = orderedFood;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getOrderedFood() {
		return orderedFood;
	}

	public void setOrderedFood(String orderedFood) {
		this.orderedFood = orderedFood;
	}

	
}

