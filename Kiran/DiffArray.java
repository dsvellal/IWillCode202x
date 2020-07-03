package com.IWillCode;

public class DiffArray {
  public static void main(final String[] args) {
    final int NumArray[] = { -5, -7, -3, -9, -1 };
    int ArrayLength = 0;
    int LoopCount = 0;
    int DiffNums = 0;

    ArrayLength = NumArray.length;

    System.out.println("The size of the array is " + ArrayLength);

    for (LoopCount = 0; LoopCount < (ArrayLength); LoopCount++) {
      if (LoopCount == (ArrayLength - 1)) {
        System.out.println("Element number " + LoopCount + " of the array is being considered below.");
        DiffNums = NumArray[0] - NumArray[LoopCount];
        if (DiffNums < 0) {
          DiffNums = DiffNums * -1;
        }
        System.out.println("Difference is " + DiffNums);
      } else {
        System.out.println("Element number " + LoopCount + " of the array is being considered below.");
        DiffNums = NumArray[LoopCount + 1] - NumArray[LoopCount];
        if (DiffNums < 0) {
          DiffNums = DiffNums * -1;
        }
        System.out.println("Difference is " + DiffNums);
      }
    }
  }
}