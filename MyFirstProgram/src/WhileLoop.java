import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    // While loop -> Executes a block of code as long as a condition is true

    Scanner scanner = new Scanner(System.in);
    String name = "";

    do {
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    } while (name.isEmpty());

    System.out.println("Hello " + name);

    scanner.close();

  }
}
