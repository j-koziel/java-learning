import java.util.Scanner;

public class LogicalOperators {
  public static void main(String[] args) {
    // Logical operators are used to compare two or more expressions

    // && AND (both conditions need to be true)
    int temp = 13;

    if (temp > 30) {
      System.out.println("It is hot outside");
    } else if (temp >= 20 && temp <= 30) {
      System.out.println("It is warm outside");
    } else {
      System.out.println("It is cold outside");
    }
    
    // || OR (only one condition needs to be true)
    Scanner scanner = new Scanner(System.in);

    System.out.println("You are plaing a game! Press q or Q to quit");
    String response = scanner.next();

    if (!response.equals("q") && !response.equals("Q")) {
      System.out.println("You are still playing the game *pew pew*");
    } else {
      System.out.println("You quit the game");
    }

    scanner.close();

    // ! NOT reverses a boolean

  }
}