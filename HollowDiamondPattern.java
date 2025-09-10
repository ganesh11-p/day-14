package com.codegnan.Patters;

public class HollowDiamondPattern {

	public static void main(String[] args) {
		int n = 7; // height (should be odd for symmetry)

        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == n - i || j == n + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == n - i || j == n + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

}
