package Relationship;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bank {

	String bankName;
	Account a;
	public static final String  ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m"; 

	public Bank(String bankName) {

		this.bankName = bankName;
	}
	
	
	public void createAccount(Account a) throws InterruptedException {
		if (this.a == null) {
			this.a = a;
			System.out.print("Creating Your Account.");
			TimeUnit.SECONDS.sleep(1);
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
			System.out.println( ANSI_GREEN +"Congrats Your Account Created Sucssesfully"+ ANSI_RESET);
		}
		else {
			System.out.println(ANSI_RED+"This Account Already Exist.."+ ANSI_RESET);	
		}
	}
	
	public void deleteAccount() {
		if (this.a == null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Your Pin");
			int pin = sc.nextInt();
			
			if(a.getPin() == pin) {
				this.a=null;
				System.out.println(ANSI_RED+"Account Removed Sucsessfully....."+ ANSI_RESET);
			}
			else {
				System.out.println(ANSI_RED+"Invalid pin"+ANSI_RESET);
			}
		}
	}
	
	public void displayDetails() {
		if (this.a==null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Your Pin");
			int pin = sc.nextInt();
			
			if(a.getPin() == pin) {
				System.out.println("-------------------" +bankName+"----------------------");
				System.out.println("Account Holder Name :    "+a.getName());
				System.out.println("Account Number :         "+a.getAccountNumber());
				System.out.println("Branch :                 "+a.getCity());
				System.out.println("Holder's Contact Number :"+a.getContactNumber());
				System.out.println("------------------------------------------------------");
			}
		}
	}
	
	public void updateDetails() {
		if (this.a == null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Your Pin");
			int pin = sc.nextInt();
			if(a.getPin() == pin) {
				Scanner s2 = new Scanner(System.in);
				System.out.println("What You Want To Update.....");
				boolean exit = true;
				while (exit) {
					System.out.println("1.Your Name\n2.Contact Number\n3.Exit menu");
					int choice = s2.nextInt();
					switch(choice) {
										case 1:{
											System.out.println("Enter New Name");
											String name = s2.next();
											a.setName(name);
											System.out.println(ANSI_GREEN +"Name Updated Sucssesfully"+ ANSI_RESET);
											break;
										}
										case 2:{
											System.out.println("Enter New Contact Number");
											long cno = s2.nextLong();
											a.setContactNumber(cno);
											System.out.println(ANSI_GREEN +"Contact Number Sucssesfully"+ ANSI_RESET);
											break;
										}
										case 3:{
											exit = false;
											break;
										}
										default : {
											System.out.println("Invalid Choice");
											break;
										}	
									}
							}
				}
			else{
				System.out.println(ANSI_RED+"Invalid pin"+ANSI_RESET);
			}
		}
	}
	public void withdraw() {
		if (this.a == null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Your Pin");
			int pin = sc.nextInt();
			if(a.getPin() == pin) {
				System.out.println("Enter Amount to Withdraw");
				double withdrawBalance = sc.nextDouble();
				double balance = a.getBalance();
				if(withdrawBalance<=balance) {
					balance -= withdrawBalance;
					a.setBalance(balance);
					System.out.println(ANSI_GREEN+withdrawBalance+ANSI_RESET + " Amount Debited Sucsessfuly...");
				}else {
					System.out.println("Insuficient Balance");
				}
				
			}else {
				System.out.println(ANSI_RED+"Invalid pin"+ANSI_RESET);
			}
			
		}
		
	}
	public void deposit() {
		if (this.a == null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Your Pin");
			int pin = sc.nextInt();
			if(a.getPin() == pin) {
				System.out.println("Enter amount to deposit");
				double depositbalance = sc.nextDouble();
				double balance = a.getBalance();
				balance+=depositbalance;
				a.setBalance(balance);
				System.out.println(ANSI_GREEN+depositbalance+ANSI_RESET + " Amount credited Sucsessfuly...");
			}else {
				System.out.println(ANSI_RED+"Invalid pin"+ANSI_RESET);
			}
			
		}
	}
	
	
	
	public void changePin() {
		if (this.a ==null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Your old Pin");
			int pin = sc.nextInt();
			if(a.getPin() == pin) {
				System.out.println("Enter The Your New Pin");
				int newpin = sc.nextInt();
				a.setPin(newpin);
				System.out.println(ANSI_GREEN+"Your Pin Changed Sucsessfuly.."+ANSI_RESET);
			}else {
				System.out.println(ANSI_RED+"Invalid pin"+ANSI_RESET);
			}
		}
		
	}
	public void balanceEnquiry() {
		if (this.a==null) {
			System.out.println(ANSI_RED+"Create Your Account First"+ANSI_RESET);
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Pin");
			int pin = sc.nextInt();
			if(a.getPin() == pin) {
				System.out.println(ANSI_GREEN +"Your Account Balance is : "+ a.getBalance()+ANSI_RESET);
			}
		}
	}
	
}
