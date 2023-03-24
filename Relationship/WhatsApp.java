package Relationship;

import java.util.Scanner;

public class WhatsApp {

	user u;

		public void login(user u) {
				if (this.u == null) {
					this.u = u;
					System.out.println("..........login succsessfull");
				}
				else
				{
					System.out.println("Already loged in");
				}
		}
		
		public void logout() {
			if(this.u==null) {
				System.out.println("Login first");
			}
			else {
				
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter password");
				int pswd = sc.nextInt();
				if(u.getpswd() == pswd) {
					this.u=null;
					System.out.println(".....log out sucsessfuly");
				}
				else {
					System.out.println("Incorrect password");
				}

			}

		}
		
		public void updateStatus() {
			if (this.u == null) {
				System.out.println("Login first");
			}else {
				
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter password");
				int pswd = sc.nextInt();
				if(u.getpswd()==pswd) {
					Scanner s1 = new Scanner(System.in);
					System.out.println("write yout status...");
					String status = s1.next();
					u.setStatus(status);
					System.out.println("Status updated sucsessfully");
				}
				else {
					System.out.println("Incorrect password");
				}
			}
		}
		
		public void displayDetails() {
			if (this.u == null) {
				System.out.println("Login first");
			}
			else {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter password");
				int pswd = sc.nextInt();
				if(u.getpswd()==pswd) {
					System.out.println("User Name : " + u.getName());
					System.out.println("User Contact number : " + u.getcNo());
					System.out.println("User Status : " + u.getStatus());
				}
				else {
					System.out.println("Incorrect password");
				}
			}
		}
		public void updatePass() {
			if (this.u == null) {
				System.out.println("Login first");
			}
			else {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter old password");
				int oldpswd = sc.nextInt();
				if(u.getpswd()==oldpswd) {
					System.out.println("Enter new password");
					int newpswd = sc.nextInt();
					u.setPswd(newpswd);
					System.out.println("Password updated");
				}
				else {
					System.out.println("Incorrect password");
				}
			}
		}
}

