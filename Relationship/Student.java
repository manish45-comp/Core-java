package Relationship;

public class Student {
	private int id;
	private String sname;
	private int std;
	
	public Student(int id, String sname, int std) {
		this.id = id;
		this.sname = sname;
		this.std = std;
	}
	
	
	public int getId() {
		return id;
	}
	public String getSname() {
		return sname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
}
