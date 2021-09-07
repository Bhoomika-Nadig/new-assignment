package com.x_workz.controlStatements;

public class GstCalculators {

	public static void main(String[] args) {

		int price = 30000;
		double taxAmount;
		String typeOfindustry = "manufacture";
		if (typeOfindustry == "manufacture") {
			taxAmount = price * 0.1 / 100;
			System.out.println("Tax Amount is " + taxAmount);
			if (typeOfindustry == "edu") {
				taxAmount = price * 0.5 / 100;
				System.out.println("Tax Amount is " + taxAmount);
			} else if (typeOfindustry == "sales") {
				taxAmount = price * 0.8 / 100;
				System.out.println("Tax Amount is " + taxAmount);
			} else if (typeOfindustry == "edu") {
				taxAmount = price * 0.12 / 100;
				System.out.println("Tax Amount is " + taxAmount);
			} else if (typeOfindustry == "health") {
				taxAmount = price * 0.15 / 100;
				System.out.println("Tax Amount is " + taxAmount);

			}
		}
	}
}