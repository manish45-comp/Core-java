package Relationship;

import java.util.Scanner;

public class School {

	String name;
	
	Student s;

	public School(String name) {
		this.name = name;
	}
	
	public void takeAddm(Student s) {
		if (this.s==null) {
			this.s=s;
			System.out.println("Admission successful..");
		}
		else {
			System.out.println("Admission already taken..");
		}
		
	}
	
	public void cancelAddm() {
		if (this.s==null) {
			System.out.println("Admission is not taken yet..");
		}else {
			this.s=null;
			System.out.println("Admission cancel..");
		}
	}
	
	public void updateStd() {
		if (this.s == null) {
			System.out.println("Admission not taken yet");
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the stadard to update");
			int std = sc.nextInt();
			s.setStd(std);
			System.out.println("Standard modify successfuly..");
		}
	}
	
	public void displayDetails() {
		if (this.s == null) {
			System.out.println("Admission is not taken yet");
		}
		else {
			System.out.println("------" + name + "------");
			System.out.println("student Name : " + s.getSname());
			System.out.println("student ID : " + s.getId());
			System.out.println("student Standard : " + s.getStd());
		}
	}
	
	
}
