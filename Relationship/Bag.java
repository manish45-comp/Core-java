package Relationship;

public class Bag {
	
	int compartment;
	String brand;
	double price;
	Books b;
	public Bag(int compartment, String brand, double price) {

		this.compartment = compartment;
		this.brand = brand;
		this.price = price;
	}
	
	public void printdatils(Books b){
		
		System.out.println("Bag compartment :"+compartment);
		System.out.println("Bag brand :"+brand);
		System.out.println("Bag price :"+price);
		System.out.println("Books Name :"+b.name);
		System.out.println("Books price :"+b.price);
		System.out.println("Books author :"+b.author);

	}
}
