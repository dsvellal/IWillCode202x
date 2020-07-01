public class DoWhileExample {
  public static void main(final String[] args) {
    // 1. Initialisation
    // 2. Termination condition
    // 3. Increment/decrement

    // for loop - all three happens in 1-line
    // while loop - all three happens in 3 different lines
    // do while loop - all three happens in 3 lines

    final int length = 0;
    int i = 0; // Initialisation
    do {
      System.out.println("do-while i=" + i);
      i = i + 1; // Increment
    } while (i < length); // Condition

    int j = 0; // Initialisation
    while (j < length) { // Condition
      System.out.println("while j=" + j);
      j = j + 1; // Increment
    }
  }
}
