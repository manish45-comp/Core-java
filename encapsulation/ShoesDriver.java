package encapsulation;

import java.util.Scanner;

public class ShoesDriver {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Shoes s1 = new Shoes();
		
		System.out.println(s1.getColor());
		System.out.println(s1.getBrand());
		System.out.println(s1.getSize());
		
		
		System.out.println("Enter choice");
		int choice = sc.nextInt();
		if (choice == 1) {
		System.out.println("Enter the color  to Modify");
		String color =	sc.next();
		s1.setColor(color);
		}
		else if (choice == 2) {
		System.out.println("Enter the color  to Modify");
		String color =	sc.next();
		s1.setColor(color);
		}
		else if (choice == 3) {
		System.out.println("Enter the color  to Modify");
		String color =	sc.next();
		s1.setColor(color);
		}
		else {
			System.out.println("Enter Valid choice");
		}
		
		System.out.println(s1.getColor());
		System.out.println(s1.getBrand());
		System.out.println(s1.getSize());
		
	}

}
