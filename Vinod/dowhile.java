public class DoWhile {
  public static void main(final String[] args) {
    final int length = 0;
    int i = 0;
    do {
      System.out.println("do-while i=" + i);
      i = i + 1;
    } while (i < length);

    int j = 0; 
    while (j < length) { 
      System.out.println("while j=" + j);
      j = j + 1; 
    }
  }
}
