import java.util.Scanner;

public class MathClass {
  public static void main(String[] args) {
    double x = 3.14;
    double y = 10;

    double z = Math.max(x, y); // maximum of sequence of numbers
    double a = Math.min(x, y); // minimum of sequence of numbers
    double b = Math.abs(y); // the absolute value
    double c = Math.sqrt(y); // square root of a value
    double d = Math.floor(x); // round down
    double e = Math.ceil(x); // round up

    // System.out.println(z);

    double f;
    double g;
    double h;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side f: ");
    f = scanner.nextDouble();
    
    System.out.println("Enter side g: ");
    g = scanner.nextDouble();

    h = Math.sqrt((f * f) + (g * g));

    System.out.println("The hypotenuse is: " + h);

    scanner.close();
  }
}
