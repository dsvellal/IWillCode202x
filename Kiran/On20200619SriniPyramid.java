package com.philips;

import java.util.Scanner;

public class On20200619SriniPyramid {
  public static void main(final String[] args) {
    final Scanner sin = new Scanner(System.in);

    final int i = sin.nextInt();
    int j = 0;
    int k = 0;
    int count = 1;
    j = i;

    while (k < i) {
      j = i;

      while (j >= (j / 2)) {
        System.out.print(" ");

        j--;
      }
      for (int m = 0; m < count; m++) {
        System.out.print("1");
        System.out.print(" ");
      }
      System.out.println();
      k++;
      count++;
    }
    sin.close();

  }
}