package com.philips;

public class FourNumbers {
  public static void main(final String[] args) {
    final int num1 = 100;
    final int num2 = 98;
    final int num3 = -100;
    final int num4 = 99;

    // Which of these is the greatest number -- assignment
    // Which of these is the smallest number -- assignment

    if ((num1 >= num2) && (num1 >= num3) && (num1 >= num4)) {
      System.out.println(num1 + " is the greatest number.");
    } else if ((num2 >= num1) && (num2 >= num3) && (num2 >= num4)) {
      System.out.println(num2 + " is the greatest number.");
    } else if ((num3 >= num1) && (num3 >= num2) && (num3 >= num4)) {
      System.out.println(num3 + " is the greatest number.");
    } else if ((num4 >= num1) && (num4 >= num2) && (num4 >= num3)) {
      System.out.println(num4 + " is the greatest number.");
    }
    if ((num1 <= num2) && (num1 <= num3) && (num1 <= num4)) {
      System.out.println(num1 + " is the smallest number.");
    } else if ((num2 <= num1) && (num2 <= num3) && (num2 <= num4)) {
      System.out.println(num2 + " is the smallest number.");
    } else if ((num3 <= num1) && (num3 <= num2) && (num3 <= num4)) {
      System.out.println(num3 + " is the smallest number.");
    } else if ((num4 <= num1) && (num4 <= num2) && (num4 <= num3)) {
      System.out.println(num4 + " is the smallest number.");
    }
  }
}