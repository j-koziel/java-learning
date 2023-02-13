public class Arrays {
  public static void main(String[] args) {
    // Array = used to store multiple values into a singel variable

    String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

    cars[0] = "Mustang";

    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }

    String[] newCars = new String[3];

    newCars[0] = "Camaro";
    newCars[1] = "Corvette";
    newCars[2] = "Tesla"; 

    // System.out.println(newCars[2]);
  }
}
