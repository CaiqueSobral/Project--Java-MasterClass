package academy.examples;

import java.util.Scanner;

public class E2Scanner {
  public static void exemple() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name");
    String name = scanner.nextLine();

    System.out.println("Your name is " + name);
    scanner.close();
  }
}
