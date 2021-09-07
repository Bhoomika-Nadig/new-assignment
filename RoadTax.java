package com.x_workz.controlStatements;

public class RoadTax {

	public static void main(String[] args) {
		String state = "KA";
		if (state == "KA") {
			System.out.println(" Karnataka RoadTax is : 4000Rs");
		} else if (state == "AP") {
			System.out.println(" Andrapradesh  RoadTax is : 5000Rs");
		} else if (state == "UP") {
			System.out.println("Uttarpradesh  RoadTax is : 30000Rs");
		} else if (state == "TN") {
			System.out.println("RoadTax TamilNadu is : 3000Rs");
		} else {
			System.out.println(" state name");
		}
	}

}