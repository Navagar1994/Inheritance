package org.develop;

          //MULTILEVEL INHERITANCE-----> More than one parent and one child but the level is step by step

public class Seller {
	
	public void sellerName() {
		System.out.println("seller name is manimaran");                          // PARENT-->> PARENT--->>CHILD
                                                                                            
	}
	public void sellerCommission() {
		System.out.println("seller commission is 10 lacks");

	}
	public void sellerConNo() {
		System.out.println("seller contact number is 876345120");
	}
	
	public static void main(String[] args) {
		
		
		Seller s = new Seller();
		s.sellerCommission();
		s.sellerConNo();
		s.sellerName();
	}

}
