package Relationship;

public class MobileEarlyDriver {

	public static void main(String[] args) {
		
		Mobileearly m = new Mobileearly(
					new Battery("China",696969),
					"Samsung",
					12000,
					"black"
				);
		System.out.println(m.mobileCompany);
		System.out.println(m.price);
		System.out.println(m.color);
		System.out.println(m.b.bCompany);
		System.out.println(m.b.bNo);
	}

}
