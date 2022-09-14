package com.starter.academy.learnprogramming;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name");
    String name = scanner.nextLine();
    scanner.nextLine();

    System.out.println("Your name is " + name);
    scanner.close();
  }
}
