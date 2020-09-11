package com.iwillcode;

import java.util.Scanner;

public class ChooseTypeOfTriangleToPrint {
	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.println("What is the length of the triangle");
		final int length = scanner.nextInt();
		System.out.println("Type 1: for right-angled triangle, Type 2: for inverted right-angled triangle");
		final int type = scanner.nextInt();
		if (type == 1) {
			printRightAngledTriangle(length, true);
		} else if (type == 2) {
			printRightAngledTriangle(length, false);
		} else {
			System.out.println("You have selected an option that I do not understand! Exiting! Bye!");
		}
		scanner.close();
	}

	private static void printRightAngledTriangle(final int length, boolean increment) {
		int rowsOfTriangle = length;
		while (rowsOfTriangle >= 0) {
			int onesToPrint = rowsOfTriangle;
			if (increment) { // Inverted
				while (length > onesToPrint) {
					System.out.print("1 ");
					onesToPrint = onesToPrint + 1;
				}
			} else { // Non-inverted.
				while (onesToPrint > 0) {
					System.out.print("1 ");
					onesToPrint = onesToPrint - 1;
				}
			}
			System.out.println();
			rowsOfTriangle = rowsOfTriangle - 1;
		}
	}
}