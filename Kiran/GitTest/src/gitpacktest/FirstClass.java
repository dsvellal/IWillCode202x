package com.IWillCode;

public class FirstClass {
  public static void main(final String[] args) {
    final int age = -16;

    if ((age > 0) && (age < 13)) {
      System.out.println("You are a kid");
    } else if ((age >= 13) && (age < 20)) {
      System.out.println("You are a teenager");
    } else if (age >= 20) {
      System.out.println("You are an adult");
    } else {
      System.out.println("You don't exist!");
    }
  }

}