package com.IWillCode;

public class OperatorTest {

  public static void main(final String[] args) {
    // Conditional operators
    // > - greater than
    // < - lesser than
    // == - equals to
    // != - not equal to
    // >= - greater than or equal to
    // <= - lesser than or equal to
    // ! - (only for boolean) - negation

    /*
     * Binary operators && - check if both left-side & right-side are true, only then condition becomes true, else, it's
     * always false || - check if both left-side & right-side are false, only then condition becomes false, else it's
     * always true
     */

    final int age = 18;
    final int salary = 500000;

    final boolean validAge = (age >= 0);

    if (!validAge) {
      System.out.println("Not a valid age!");
      System.exit(1);
    } else {
      // Do something
      if ((age <= 18) && (salary <= 10000)) {
        System.out.println("It's ok, you still have time. Work hard!");
      } else {
        System.out.println("Your age is greater than 18, and/or your salary is greater than 10000");
        if (salary != 500000) {
          System.out.println("You are not yet at the CxO position!");
        } else {
          System.out.println("You made it! You are at the CxO position!");
        }
      }
    }
  }

}