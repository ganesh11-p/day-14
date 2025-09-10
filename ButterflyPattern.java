package com.codegnan.Patters;

public class ButterflyPattern {

	public static void main(String[] args) {
		// Upper part
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			// inner for loop prints left wing
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			int spaces = 2 * (rows - i);
			// print spaces between upper left wing and upper right wing
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}

			// inner for loop prints right wing
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Lower part
		for (int i = rows; i >= 1; i--) {
			// inner for loop prints left wing
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			int spaces = 2 * (rows - i);
			// print spaces between lower left wing and upper right wing
			for (int j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}

			// inner for loop prints right wing
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
