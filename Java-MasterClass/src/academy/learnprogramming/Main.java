package academy.learnprogramming;

public class Main {
  public static void main(String[] args) {
    System.out.println("The number was " + checkNumber(10));
  }

  public static String checkNumber(int numberChecked) {
    if(numberChecked > 0) return "positive";
    if(numberChecked < 0) return "negative";
    return "0";
  }
}
