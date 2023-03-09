package org.cheack;

             //SINGLE INHERITANCE--->>>>> combination of one parent one child

public class Transport {
		
	public void transportName() {
		System.out.println("transport name is kpn");
	}
	public void transportLocation() {
		System.out.println("transport location is chennai");
	}
	public void transportNo() {
		System.out.println("transportr no is tn 29 az 4533");
	}

	public static void main(String[]args) {
		
		Transport t = new Transport();
		t.transportName();
		t.transportLocation();
		t.transportNo();
	}
	
	
}
