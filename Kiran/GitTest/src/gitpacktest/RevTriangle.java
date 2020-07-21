package gitpacktest;

public class RevTriangle {
  public static void main(final String args[]) {

    final int TrglSize = 4;
    int OutLoopCtr = TrglSize;

    /*
     * while (OutLoopCtr >= 1) { while (InLoopCtr <= TrglSize) { System.out.print("1"); InLoopCtr++; }
     * System.out.print("\n"); OutLoopCtr--; }
     */

    /*
     * while (i <= length) { // Controls the length int j = 1; while (j <= i) { // Controls what happens at every level
     * of the length System.out.print("1 "); j = j + 1; } System.out.println(); i = i + 1 }
     *
     */
    while ((OutLoopCtr <= TrglSize) && (OutLoopCtr > 0)) { // Controls the length
      int InLoopCtr = 1;
      while (InLoopCtr <= OutLoopCtr) { // Controls what happens at every level of the length
        System.out.print("1 ");
        InLoopCtr = InLoopCtr + 1;
      }
      System.out.println();
      OutLoopCtr = OutLoopCtr - 1;
    }
  }
}