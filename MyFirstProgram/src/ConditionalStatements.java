import java.util.Scanner;

public class ConditionalStatements {
  public static void main(String[] args) {
    // LOGICAL OPERATORS
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

    // IF STATEMENTS
    // decision making -> true = execute, false = skip
    int age = 13;

    if (age == 75) {
      System.out.println("Ok Boomer!");
    } else if (age >= 18) {
      System.out.println("You are an adult!");
    } else if (age >= 13) {
      System.out.println("You are a teenager!");
    } else {
      System.out.println("You are not an adult!");
    }

    // SWITCH STATEMENTS
    // test a variable for equality against a list of values
    String day = "Pizza";

    switch(day) {
      case "Sunday": System.out.println("It is Sunday");
      break;
      case "Monday": System.out.println("It is Monday");
      break;
      case "Tuesday": System.out.println("It is Tuesday");
      break;
      case "Wednesday": System.out.println("It is Wednesday");
      break;
      case "Thursday": System.out.println("It is Thursday");
      break;
      case "Friday": System.out.println("It is Friday");
      break;
      case "Saturday": System.out.println("It is Saturday");
      break;
      default: System.out.println("That is not a day!");
    }
  }
}
