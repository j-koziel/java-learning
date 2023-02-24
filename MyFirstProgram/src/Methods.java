public class Methods {
  public static void main(String[] args) {
    // a method is a block of code which is executed when it is called
    String name = "Jonathan";
    int age = 21;

    // hello(name, age);

    // double x = add(1.0, 2.0, 3.0, 4.0);

    // System.out.println(x);

    // printf method -> an optional method to control, format and display text
    // two arguments -> format string + some value you want in the string
    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Jonathan";
    int myInt = 50;
    double myDouble = 1000;

    // conversion characters to match certain data types
    // System.out.printf("%b", myBoolean);
    // System.out.printf("%c", myChar);
    // System.out.printf("%s", myString);
    // System.out.printf("%d", myInt);
    // System.out.printf("%f", myDouble);

    // width
    // minimum number of chars to be written as output
    // System.out.printf("hello %10s", myString);

    // precision
    // sets number of digits of precision when outputting decimals 
    // System.out.printf("You have this much money %.2f", myDouble);

    // flags
    // adds an effect to the output based on the flag
    System.out.printf("You have this much money %,f", myDouble);
  }

  // type of method -> return type -> method def
  static void hello(String title, int age) {
    System.out.println("Hello " + title);
    System.out.println("You are " + age + " years old");
  }

  // overloaded methods
  // methods which have the same name but different paramaters
  // This is allowed as each method needs to have a unique method signature
  // method name + parameters = method signature
  static int add(int a, int b) {
    System.out.println("This is overloaded method #1");
    return a + b;
  }

  static int add(int a, int b, int c) {
    System.out.println("This is overloaded method #2");
    return a + b + c;
  }

  static int add(int a, int b, int c, int d) {
    System.out.println("This is overloaded method #3");  
    return a + b + c + d;
  }

  static double add(double a, double b) {
    System.out.println("This is overloaded method #1");
    return a + b;
  }

  static double add(double a, double b, double c) {
    System.out.println("This is overloaded method #2");
    return a + b + c;
  }

  static double add(double a, double b, double c, double d) {
    System.out.println("This is overloaded method #3");  
    return a + b + c + d;
  }
}