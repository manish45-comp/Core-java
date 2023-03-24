package Relationship;

import java.util.Scanner;

public class Schooldriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		School s2 = new School("KJ College");
		
		while (true) {
		System.out.println("Enter choice\n1.Take admission \n2.Cancel admission\n3.update\n4.display\n5.Exit");
			int choice  = sc.nextInt();
			switch (choice) {
			case 1: {
					System.out.println("Enter the  student name");
					String name = sc.next();
					System.out.println("Enter the  student Id");
					int id = sc.nextInt();
					System.out.println("Enter the  student standard");
					int std = sc.nextInt();
					s2.takeAddm(new Student(id,name,std));
					break;
				}
	
			case 2:{
				s2.cancelAddm();
				break;
			}
			case 3:{
				s2.updateStd();
				break;
			}
			case 4:{
				s2.displayDetails();
				break;
			}
			case 5:{
				break;
			}
			default :{
				System.out.println("enter valid choice");
			}
			
			}
		}

	}

}
