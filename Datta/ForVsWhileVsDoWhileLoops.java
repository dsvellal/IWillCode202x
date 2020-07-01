import java.util.Scanner;

public class ForVsWhileVsDoWhileLoops {
  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please specify the height of the triangle (in integer): ");
    final int heightOfTriangle = scanner.nextInt();

    if (heightOfTriangle < 2) { // Validation
      System.out.println("Please specify a number greater than or equal to 2");
      System.exit(1);
    }

    for (int currentHeight = 0; currentHeight < heightOfTriangle; currentHeight++) { // Initialisation,
                                                                                     // termination
                                                                                     // condition,
                                                                                     // increment/decrement
      int noOfSpaces = currentHeight; // Initialisation
      while (noOfSpaces < (heightOfTriangle - 1)) { // Termination condition
        System.out.print(" "); // Notice the system.out.print, and not system.out.println!
        noOfSpaces++; // Increment/decrement
      }

      int noOfOnes = 0; // Initialisation
      do {
        System.out.print("1 ");
        noOfOnes++; // Increment/decrement
      } while (noOfOnes <= currentHeight); // Termination condition

      System.out.println(); // Empty line after printing one line
    }

    scanner.close();

  }
}
