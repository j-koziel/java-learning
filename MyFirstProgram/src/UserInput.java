import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); // Creating a new scanner to take in user input

    System.out.println("What is your name? ");
    String name = scanner.nextLine(); // Take in user input as a string

    System.out.println("How old are you? ");
    int age = scanner.nextInt(); // Take in user input as an int
    scanner.nextLine(); // Clearing the input field

    System.out.println("What is your favourite food? ");
    String food = scanner.nextLine();

    scanner.close(); // Closing the scanner
    
    // Display inputs
    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old"); 
    System.out.println("You like " + food);
  }
}
