public class WrapperClasses {
  public static void main(String[] args) {
    // A wrapper class ix a way to use primitive data types
    // as reference data types -> useful methods which can be used
    // with collections

    // reference data types are slower to access
    // each primitive data type has a wrapper class

    // boolean -> Boolean
    // char -> Character
    // int -> Integer
    // double -> Double

    // autoboxing = automatic conversion which the 
    // java compiler makes between primitive types and their corresponding
    // wrapper classes
    
    // unboxing -> the reverse of unboxing (converting wrapper class to primitive)

    Boolean a = true;
    Character b = '@';
    Integer c = 123;
    Double d = 3.14;
    String e = "Jonathan";

    if (b == '@') {
      System.out.println("This is true");
    }
    
  }
}
