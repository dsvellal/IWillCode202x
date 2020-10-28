package gitpacktest;

import java.util.Scanner;

public class On20200708UserInput {
	public static int getUserIp () {
		final Scanner ScnUserSelIp = new Scanner(System.in);
	    int vNum1 = 0;
	    
		System.out.println("Please enter the number");
		vNum1 = ScnUserSelIp.nextInt(); //On running, the program crashes mentioning this line and line for num2. First number is accepted. Program crashes on second number.
			
	    ScnUserSelIp.close();
	    return (vNum1);
	} // This is for getUserIp
	
  public static void main(final String[] args) {

    final Scanner ScnUserSel = new Scanner(System.in);
    int UserSel = 0;
    int Num1 = 0;
    int Num2 = 0;

    System.out.println("Welcome ! Please enter a numeric selection from the options below.");
    System.out.println("1. Compare two numbers");
    System.out.println("2. Add two numbers");
    System.out.println("3. Multiply two numbers");

    UserSel = ScnUserSel.nextInt();
    if ((UserSel < 1) || (UserSel > 3)) {
      System.out.println("Sorry: You have selected an invalid option");
    }

    System.out.println("Option you selected is: " + UserSel);

    if (UserSel == 1) {
   	
    	Num1 = getUserIp();
    	Num2 = getUserIp();
 
      if (Num1 > Num2) {
        System.out.println("The first number you entered is greater than the second one.");
      } else {
        System.out.println("The second number you entered is greater than the first one.");
      }
    }

    if (UserSel == 2) {
      Num1 = getUserIp();
      Num2 = getUserIp();
      System.out.println("The sum of the two numbers is: " + (Num1 + Num2));
    }

    if (UserSel == 3) {
      Num1 = getUserIp();
      Num2 = getUserIp();
      System.out.println("The product of the two numbers is: " + (Num1 * Num2));
    }
    ScnUserSel.close();

    // This line is to separate closing of the class and main loops.
  }
}