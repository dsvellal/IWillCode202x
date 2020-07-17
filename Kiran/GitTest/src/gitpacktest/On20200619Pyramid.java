package gitpacktest;

public class On20200619Pyramid {

  public static void main(final String args[]) {
    int Looper = 1;
    int InLoop = 1;
    final int PyrSize = 4;

    while (Looper <= PyrSize) {
      InLoop = 1;
      System.out.print(" ");
      while (InLoop <= Looper) {
        System.out.print("* ");
        InLoop++;
      }
      System.out.println("\n");
      Looper++;
    }
  }
}