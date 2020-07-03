package com.IWillCode;

import java.util.Scanner;

public class On20200619ChooseTriangle {
  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("What is the length of the triangle");
    final int length = scanner.nextInt();

    System.out.println("Type 1: for right-angled triangle, Type 2: for inverted right-angled triangle");
    final int type = scanner.nextInt();

    if (type == 1) {
      printRightAngledTriangle(length);
    } else if (type == 2) {
      printInvertedRightAngledTriangle(length);
    } else {
      System.out.println("You have selected an option that I do not understand! Exiting! Bye!");
    }
    scanner.close();
  }

  private static void printInvertedRightAngledTriangle(final int length) {
    int i = length;
    while (i >= 0) { // Controls the length
      int j = i;
      while (j > 0) { // Controls what happens at every level of the length
        System.out.print("1 ");
        j = j - 1;
      }
      System.out.println();
      i = i - 1;
    }

  }

  private static void printRightAngledTriangle(final int length) {
    int i = 1;
    while (i <= length) { // Controls the length
      int j = 1;
      while (j <= i) { // Controls what happens at every level of the length
        System.out.print("1 ");
        j = j + 1;
      }
      System.out.println();
      i = i + 1;
    }
  }
}
