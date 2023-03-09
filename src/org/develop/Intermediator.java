package org.develop;

           // MULTIILEVEL INHERITANCE----> child class

public class Intermediator extends Seller {
	
	public void intName() {
		System.out.println("intermediator name is siva");

	}
	public void intAge() {
		System.out.println("intermediator age is 22");

	}
	public void intLocation() {
		System.out.println("intermediator location is thenkasi");

	}
	
	public static void main(String[] args) {
		
		Intermediator i = new Intermediator();
		
		i.intName();
		i.intAge();
		i.intLocation();
		i.sellerName();
		i.sellerConNo();
		i.sellerCommission();
		
		
		
	}

}
