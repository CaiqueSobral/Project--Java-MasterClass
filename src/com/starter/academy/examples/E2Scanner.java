package com.starter.academy.examples;

import java.util.Scanner;

public class E2Scanner {
  public static void exemple() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name");
    String name = scanner.nextLine();

    System.out.println("How old are you?");
    int age = scanner.nextInt();

    System.out.println("Your name is " + name);
    System.out.println("You are " + age + " years old");
    scanner.close();
  }
}
