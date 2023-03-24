package Relationship;

import java.util.Scanner;

public class SwiggyApp {

	String hotelName; 
	SwiggyUser su;
	
	public SwiggyApp(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public void createAccount(SwiggyUser su) {
		 if (this.su == null) {
			this.su = su;
			System.out.println("...................................Account created");
		}
		 else {
			 System.out.println("...................................Account Already Exist");
		 }
	}
	
	public void orderFood() {
		if (this.su == null) {
			System.out.println("Create your account first");
		}else {
				double a = Math.random();
				int cID = (int)(a*1000000000);
				su.setcId(cID);
				boolean exit = true;
				Scanner sc = new Scanner(System.in);
				while (exit) {
					
					System.out.println("What You want to order\n1.Biryani\n2.Pizza\n3.Burger\n4.Ice Cream\n5.Muttar Panner\n6.Tandoori\n7.chicken 65\n8.Rolls\n9.Paratha\n10.Dosa");
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					switch(choice) {
							case 1:{
								su.setOrderedFood("Biryani");
								System.out.println("Biryani Added to your Cart");
								exit = false;
								break;
							}
							case 2:{
								su.setOrderedFood("Pizza");
								System.out.println("Pizza Added to your Cart");
								exit = false;
								break;
							}
							case 3:{
								su.setOrderedFood("Burger");
								System.out.println("Burger Added to your Cart");
								exit = false;
							}
							case 4:{
								su.setOrderedFood("Ice Cream");
								System.out.println("Ice Cream Added to your Cart");
								exit = false;
								break;
							}
							case 5:{
								su.setOrderedFood("Muttar Panner");
								System.out.println("Muttar Panner Added to your Cart");
								exit = false;
								break;
							}
							case 6:{
								su.setOrderedFood("Tandoori");
								System.out.println("Tandoori Added to your Cart");
								exit = false;
								break;
							}
							case 7:{
								su.setOrderedFood("chicken 65");
								System.out.println("chicken 65 Added to your Cart");
								exit = false;
								break;
							}
							case 8:{
								su.setOrderedFood("Rolls");
								System.out.println("Rolls Added to your Cart");
								exit = false;
								break;
							}
							case 9:{
								su.setOrderedFood("Paratha");
								System.out.println("Paratha Added to your Cart");
								exit = false;
								break;
							}
							case 10:{
								su.setOrderedFood("Dosa");
								System.out.println("Dosa Added to your Cart");
								exit = false;
								break;
							}
							default :{
								System.out.println("select valid option");
								break;
							}
					}
				}
		}
	}
	
	public void viewCart() {
		if (this.su == null) {
			System.out.println("Create account first");
		}
		else {
			if(su.getOrderedFood() == null) {
				System.out.println("Food not ordered yet");
			}
			else {
				System.out.println("Order Details : ");
				System.out.println("Your order ID is : " + su.getcId());
			    System.out.println("Your order is : " + su.getOrderedFood());
			}
		}
	}
	
	public void displayDetails() {
		if (this.su == null) {
			System.out.println("Create your account first");
		}
		else {
		System.out.println("Your Account details are:");
		System.out.println("Name            :"+su.getName());
		System.out.println("Contact Number  :"+su.getContactNumber());
		System.out.println("Your Address    :"+su.getAddress());
		}
	}
	
	public void cancelOrder() {
		if (this.su == null) {
			System.out.println("Create your account first");
		}
		else {
			if (su.getOrderedFood() == null) {
				System.out.println("Food not ordered yet");
			}
			else {
					Scanner sc  = new Scanner(System.in);
					System.out.println("Do you want to cancel order(y/n)");
					char choice = sc.next().charAt(0);
					if (choice == 'y' || choice == 'Y' ) {
						su.setOrderedFood(null);
						System.out.println("Your order is cancel..visit again");
					}
					else if(choice == 'n' || choice == 'N' ){
						System.out.println("Have a great day");
					}
			}
		}
	}
}
