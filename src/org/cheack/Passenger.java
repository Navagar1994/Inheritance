package org.cheack;

          //SINGLE INHERITANCE----->>>>Child class

public class Passenger extends Transport {
	
	private void passengerName() {
		System.out.println("passenger name is jonathan swift");
	}
	private void passengerAdd() {
		System.out.println("passenger address is thambaram sanitorium");
	}
	private void passengerConNo() {
		System.out.println("passenger contact number is 9876543210");
	}
	
	public static void main(String[] args) {
		
		Passenger p = new Passenger();
		
		p.passengerName();
		p.passengerAdd();
		p.passengerConNo();
		p.transportName();
		p.transportLocation();
		p.transportNo();
	}

}
