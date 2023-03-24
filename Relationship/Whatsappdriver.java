package Relationship;

import java.util.Scanner;

public class Whatsappdriver {

	public static void main(String[] args) {
		
		WhatsApp w = new WhatsApp();
		Scanner sc = new Scanner(System.in);
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("1.login\n2.logout\n3.update status\n4.display details\n5.update password\n6.Exit\n----------------------------");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : {
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Contact number");
				long cNO = sc.nextLong();
				System.out.println("Write your status");
				String status = sc.next();
				System.out.println("Write your Password");
				int pswd = sc.nextInt();
				w.login(new user(name,cNO,status,pswd));
				System.out.println("login sucsessfull");
				break;
			}
			case 2:{
				w.logout();
				
				break;
			}
			case 3:{
				w.updateStatus();
				
				break;
			}
			case 4:{
				w.displayDetails();
				break;
			}
			case 5:{
				w.updatePass();
				break;
			}
			case 6: {
				exit = false;
				System.out.println("Application close....");
				break;
			}
			default :{
				System.out.println("Enter the valid choice");
				break;
			}
			
			}
		}
		
		
	

	}

}
