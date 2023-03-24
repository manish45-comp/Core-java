package Relationship;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) throws InterruptedException{
		
		Bank b = new Bank("Kotal 811");
		Scanner sc = new Scanner(System.in);
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("1.Create Account\n2.Delete Account\n3.View Account Details\n4.Update Account Information\n5.Withdraw Money\n6.Deposit Money\n7.Change Pin\n8.Balance Enquiery\n9.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Your Name");
				String name = sc.next();
				double rnumber = (double) Math.random();
			    long accountNo = (long) (rnumber*1000000);
				System.out.println("Enter Your Contact Number");
				long contactNumber = sc.nextLong();
				System.out.println("Enter Your City");
				String city = sc.next();
				System.out.println("Enter opening Amount");
				double balance = sc.nextDouble();
				System.out.println("Enter Your Pin");
				int pin = sc.nextInt();
				b.createAccount(new Account(name, accountNo, contactNumber, city, balance, pin));
				break;
			}
			case 2: {
				b.deleteAccount();
				break;
			}
			case 3: {
				b.displayDetails();
				break;
			}
			case 4: {
				b.updateDetails();
				break;
			}
			case 5: {
				b.withdraw();
				break;
			}
			case 6: {
				b.deposit();
				break;
			}
			case 7: {
				b.changePin();
				break;
			}
			case 8: {
				b.balanceEnquiry();
				break;
			}
			case 9: {
				exit= false;
				System.out.println("Application closed..");
				break;
			}
			default:
				System.out.println("Invalid Choice :" + choice);
				break;
			}
		} 
	}

}
