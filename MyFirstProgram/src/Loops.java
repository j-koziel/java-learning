import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    // FOR LOOPS
    // for loop only executes a limited amount of times
    for (int i = 10; i >= 0; i -= 2) {
      System.out.println(i);
    }

    // WHILE LOOPS
    // While loop -> Executes a block of code as long as a condition is true

    Scanner scanner = new Scanner(System.in);
    String name = "";

    do {
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    } while (name.isEmpty());

    System.out.println("Hello " + name);

    scanner.close();

    // NESTED LOOPS
    Loops.nestLoops();
  }

  public static void nestLoops() {
    // Loops inside of loops
    Scanner scanner = new Scanner(System.in);
    int rows;
    int columns;
    String symbol = "";

    System.out.println("Enter a # of rows: ");
    rows = scanner.nextInt();

    System.out.println("Enter a # of columns: ");
    columns = scanner.nextInt();

    System.out.println("Enter a symbol to use: ");
    symbol = scanner.next();

    for (int i = 1; i<= rows; i++) {
      System.out.println();
      for (int j = 1; j <= columns; j++) {
        System.out.print(symbol);
      }
    }

    scanner.close();
  }
}
