import java.util.Scanner;

public class NestedLoops {
  public static void main(String[] args) {
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

  }
}
