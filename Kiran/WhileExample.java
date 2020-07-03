package com.IWillCode;

public class WhileExample {
  public static void main(final String args[]) {

    final int TrglSize = 10;
    int Looper = 1;
    int ForLooper = 1;

    for (ForLooper = 1; ForLooper <= TrglSize; ForLooper++) {
      Looper = 0;
      while (Looper < ForLooper) {
        System.out.print("1");
        Looper++;
      }
      System.out.print("\n");
    }
  }
}