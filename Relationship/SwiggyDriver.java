package Relationship;

import java.util.Scanner;

public class SwiggyDriver {

	public static void main(String[] args) {
		SwiggyApp sa = new SwiggyApp("sairat Biryani");
		
		Scanner sc = new Scanner(System.in);
		boolean exit =true;
		while(exit) {
			System.out.println("----------------------------------");
			System.out.println("1.Create Account\n2.Display Details\n3.Order Food\n4.View Cart\n5.Cancel order\n6.Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Your Name");
				String name = sc.next();
				System.out.println("Enter Your Contact Number");
				long cno = sc.nextLong();
				System.out.println("Enter Your Address");
				sc.nextLine();
				String address = sc.nextLine();			
				sa.createAccount(new SwiggyUser(name,address,cno,null));
				break;
			}
			case 2 :{
				sa.displayDetails();
				break;
			}
			case 3:{
				sa.orderFood();
				break;
			}
			case 4:{
				sa.viewCart();
				break;
			}
			case 5 :{
				sa.cancelOrder();
				break;
			}
			case 6 :{
				exit = false;
				System.out.println("Application closed");
				break;
			}
			default:
				System.out.println("invalid choice.......Try again");
			}
			
			
		}
		
		
	}

}
