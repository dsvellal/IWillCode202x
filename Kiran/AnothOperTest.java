package com.IWillCode;

public class AnothOperTest {
  public static void main(final String[] args) {
    final int RAMSize = 16;

    if (RAMSize < 0) {
      System.out.println("How can RAM size be negative ?!");
    }
    if (RAMSize <= 2) {
      System.out.println("This is a slow laptop!");
    } else if ((RAMSize > 2) && (RAMSize <= 4)) {
      System.out.println("Laptop is not bad");
    } else if ((RAMSize > 4) && (RAMSize <= 8)) {
      System.out.println("Latop is good !");
    } else {
      System.out.println("Laptop rocks !");
    }
  }
}
