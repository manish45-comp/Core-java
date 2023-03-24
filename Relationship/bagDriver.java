package Relationship;

import java.util.Scanner;

public class bagDriver {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
	
		System.out.println("Enter Bag compartment");
		int compart=sc.nextInt();
		System.out.println("Enter Bag brand");
		String brand=sc.next();
		System.out.println("Enter Bag price");
		double price=sc.nextDouble();
		
		System.out.println("Enter Books name");
		String name=sc.next();
		System.out.println("Enter Books price");
		double price2=sc.nextDouble();
		System.out.println("Enter Books author");
		String author=sc.next();
		
		
		
		Bag b1 = new Bag(compart,brand,price);
		
		b1.printdatils(new Books(name,price2,author));

	}

}
