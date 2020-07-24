package com.sample.java.code;

import java.util.Scanner;

public class hello_world {

  public static void main(String[] args) {

    final Scanner scanner = new Scanner(System.in);


 

    System.out.println("Please enter a number: ");

    try {

      final int number = scanner.nextInt();

      System.out.println("Entered number is: " + number);

    } catch (final Exception e) {

      System.out.println("Sorry, you entered something that's not an integer!");

      System.out.println("Please run the program again, and enter an integer");

    }

  }

}