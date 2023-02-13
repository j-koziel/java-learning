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

    Arrays.TwoDArrays();
  }

  public static void TwoDArrays() {
    // An array of arrays
    String[][] cars = new String[3][3];

    // row 0
    cars[0][0] = "Camaro";
    cars[0][1] = "Corvette";
    cars[0][2] = "Silverado";
    
    // row 1
    cars[1][0] = "Mustang";
    cars[1][1] = "Ranger";
    cars[1][2] = "F-150";

    // row 2
    cars[2][0] = "Ferrari";
    cars[2][1] = "Lambo";
    cars[2][2] = "Tesla";

    for (int i = 0; i < cars.length; i++) {
      System.out.println();
      for (int j = 0; j < cars[i].length; j++) {
        System.out.println(cars[i][j]);
      }
    }
  }
}
