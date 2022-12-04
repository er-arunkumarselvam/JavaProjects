package ebCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EbCalculator {
//	Set Global Variable
	public static void main(String[] args) {
		EbCalculator electricBill = new EbCalculator();
		int ebInput = electricBill.ebInput();
		double totalCost = electricBill.ebCalculator(ebInput);
		System.out.println("You have Total Consumed " + ebInput + " units. You have pay Rs. " + (int) totalCost);
	}

//	Input Method
	private int ebInput() {
//				Electric Bill Calculator 
		System.out.println("EB Calculator Mini Project");
//				Set Local variable
		int consumedUnit = 0;
//				Get input from user
		Scanner sc = new Scanner(System.in);
//				Exception Block
		try {
			System.out.print("Enter Consumed Units: ");
			consumedUnit = sc.nextInt();
//				Check Input Negative Value or Zero from user
			if (consumedUnit < 0) {
				System.out.println("Consumed Unit only Positive Numbers.");
				System.out.print("ReEnter Consumed Units: ");
				consumedUnit = sc.nextInt();
			}

		}
//				Handling Block
		catch (InputMismatchException ime) {
//				Other data type give input from user
			System.out.println("Consumed Units only numeric value.");

		}
		return consumedUnit;
	}

//	Calculation Method by passing arguments Input Method return value
	private double ebCalculator(int inputUnits) {
//		Set Local Variable
		double totalCost = 0;
//		Consumed Unit from 0 to 100 
		if (inputUnits >= 0 && inputUnits <= 100) {
//			Unit Charge is 0 in this condition
			double unitCharge = 0;
			totalCost = (inputUnits * unitCharge);
			System.out.println("You Consumed Unit is " + inputUnits + " ");
		}
//		Consumed Unit from 101 to 200 
		else if (inputUnits >= 101 && inputUnits <= 200) {
//			Unit Charge is 4.50 in this condition
			double energyCharge = 4.50 / 2;
			double unitCharge = energyCharge;
			totalCost = (100 * 0) + ((inputUnits - 100) * unitCharge);
		}
//		Consumed Unit from 201 to 400 
		else if (inputUnits >= 201 && inputUnits <= 400) {
//			Unit Charge is 4.50 in this condition
			double unitCharge = 4.50;
			totalCost = (100 * 0) + (100 * 2.25) + ((inputUnits - 200) * unitCharge);
		}
//		Consumed Unit from 401 to 500 
		else if (inputUnits >= 401 && inputUnits <= 500) {
//			Unit Charge is 6 in this condition
			double unitCharge = 6;
			totalCost = (100 * 0) + (100 * 2.25) + (200 * 4.50) + ((inputUnits - 400) * unitCharge);
		}
//		Consumed Unit from 501 to 600
		else if (inputUnits <= 501 && inputUnits <= 600) {
//			Unit Charge is 8 in this condition
			double unitCharge = 8;
			totalCost = (100 * 0) + (300 * 4.50) + (100 * 6) + ((inputUnits - 500) * unitCharge);
		}
//		Consumed Unit from 601 to 800
		else if (inputUnits <= 601 && inputUnits <= 800) {
//			Unit Charge is 9 in this condition
			double unitCharge = 9;
			totalCost = (100 * 0) + (300 * 4.50) + (100 * 6) + (100 * 8) + ((inputUnits - 600) * unitCharge);
		}
//		Consumed Unit from 601 to 800
		else if (inputUnits <= 601 && inputUnits <= 800) {
//			Unit Charge is 9 in this condition
			double unitCharge = 9;
			totalCost = (100 * 0) + (300 * 4.50) + (100 * 6) + (100 * 8) + ((inputUnits - 600) * unitCharge);
		}
//		Consumed Unit from 601 to 800
		else if (inputUnits <= 801 && inputUnits <= 1000) {
//			Unit Charge is 10 in this condition
			double unitCharge = 10;
			totalCost = (100 * 0) + (300 * 4.50) + (100 * 6) + (100 * 8) + (200 * 9)
					+ ((inputUnits - 800) * unitCharge);
		}
//		Consumed Unit above 1000 units
		else if (inputUnits > 1000) {
//			Unit Charge is 11 in this condition
			double unitCharge = 11;
			totalCost = (100 * 0) + (300 * 4.50) + (100 * 6) + (100 * 8) + (200 * 9) + (200 * 10)
					+ ((inputUnits - 1000) * unitCharge);
		}
		return totalCost;
	}

}
