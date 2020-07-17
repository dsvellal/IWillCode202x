public class DoWhileExample {
  public static void main(final String[] args) {
    // 1. Initialisation
    // 2. Termination condition
    // 3. Increment/decrement

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
