public class StringMethods {
  public static void main(String[] args) {
    String name = "Jonathan";

    // boolean result = name.equalsIgnoreCase("jonathan");
    // int result = name.length();
    // char result = name.charAt(0);
    // int result = name.indexOf("J");
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase();
    // String result = name.toLowerCase();
    // String result = name.trim();
    String result = name.replace("o", "a");

    System.out.println(result);
  }
}
