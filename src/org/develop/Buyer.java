package org.develop;

                  // MULTILEVEL INHERITANCE----->>> Child class

public class Buyer  extends Intermediator {
	
	private void buyerName() {
		System.out.println("buyer name is vijayaragavan");

	}
	private void buyerAddress() {
		System.out.println("buyer address is dharmapuri ");

	}
	private void buyerValue() {
		System.out.println("buyer value is i crore ");

	}
	
	public static void main(String[] args) {
		
		Buyer b =  new Buyer();
		
		b.buyerName();
		b.buyerAddress();
		b.buyerValue();
		b.intName();
		b.intAge();
		b.intLocation();
		b.sellerName();
		b.sellerConNo();
		b.sellerCommission();
		
		
	}
}
	
	
	
	


