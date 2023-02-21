public class Methods {
  public static void main(String[] args) {
    // a method is a block of code which is executed when it is called
    String name = "Jonathan";
    int age = 21;

    hello(name, age);
  }

  // type of method -> return type -> method def
  static void hello(String title, int age) {
    System.out.println("Hello " + title);
    System.out.println("You are " + age + " years old");
  }
}