package gitpacktest;

import java.util.Scanner;

public class On20200708UserInput {
  public static void main(final String[] args) {

    final Scanner ScnUserSel = new Scanner(System.in);
    int UserSel, Num1, Num2 = 0;

    System.out.println("Welcome ! Please enter a numeric selection from the options below.");
    System.out.println("1. Compare two numbers");
    System.out.println("2. Add two numbers");
    System.out.println("3. Multiply two numbers");

    UserSel = ScnUserSel.nextInt();
    if ((UserSel < 1) || (UserSel > 5)) {
      System.out.println("Sorry: You have selected an invalid option");
    }

    System.out.println("Option you selected is: " + UserSel);

    if (UserSel == 1) {
      System.out.println("Please enter the first number");
      Num1 = ScnUserSel.nextInt();
      System.out.println("Please enter the second number");
      Num2 = ScnUserSel.nextInt();
      if (Num1 > Num2) {
        System.out.println("The first number you entered is greater than the second one.");
      } else {
        System.out.println("The second number you entered is greater than the first one.");
      }
    }

    if (UserSel == 2) {
      System.out.println("Please enter the first number");
      Num1 = ScnUserSel.nextInt();
      System.out.println("Please enter the second number");
      Num2 = ScnUserSel.nextInt();
      System.out.println("The sum of the two numbers is: " + (Num1 + Num2));
    }

    if (UserSel == 3) {
      System.out.println("Please enter the first number");
      Num1 = ScnUserSel.nextInt();
      System.out.println("Please enter the second number");
      Num2 = ScnUserSel.nextInt();
      System.out.println("The product of the two numbers is: " + (Num1 * Num2));
    }
    ScnUserSel.close();

    // This line is to separate closing of the class and main loops.
  }
}