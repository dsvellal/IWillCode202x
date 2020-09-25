package com.iwillcode;

import java.util.Scanner;

public class ReturnMultipleUserInputValuesWay1 {
  final static Scanner ScnUserSel = new Scanner(System.in);
  static int vNum1;
  static int vNum2;

  public static void getUserIp() {
    System.out.println("Please enter the first number");
    vNum1 = ScnUserSel.nextInt();
    System.out.println("Please enter the second number");
    vNum2 = ScnUserSel.nextInt();
  } // This is for getUserIp

  public static void main(final String[] args) {

    int UserSel;

    System.out.println("Welcome ! Please enter a numeric selection from the options below.");
    System.out.println("1. Compare two numbers");
    System.out.println("2. Add two numbers");
    System.out.println("3. Multiply two numbers");

    UserSel = ScnUserSel.nextInt();
    if ((UserSel < 1) || (UserSel > 3)) {
      System.out.println("Sorry: You have selected an invalid option");
    }

    System.out.println("Option you selected is: " + UserSel);

    getUserIp();

    if (UserSel == 1) {
      if (vNum1 > vNum2) {
        System.out.println("The first number you entered is greater than the second one.");
      } else if (vNum1 == vNum2) {
        System.out.println("The first number you entered is equal to the second one.");
      } else {
        System.out.println("The first number you entered is lesser than the second one.");
      }
    }

    if (UserSel == 2) {
      System.out.println("The sum of the two numbers is: " + (vNum1 + vNum2));
    }

    if (UserSel == 3) {
      System.out.println("The product of the two numbers is: " + (vNum1 * vNum2));
    }
    ScnUserSel.close();

    // This line is to separate closing of the class and main loops.
  }
}