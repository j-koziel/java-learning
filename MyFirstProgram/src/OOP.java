public class OOP {
  public static void main(String[] args) {
    // object = an instance of a class which may contain attributes or methods
    Car myCar = new Car();

    System.out.println(myCar.make);
    System.out.println(myCar.model);
    myCar.drive();
    myCar.brake();
  }
}

class Car {
  String make = "Chevrolet";
  String model = "Corvette";
  int year = 2020;
  String color = "blue";
  double price = 50000.00;

  void drive() {
    System.out.println("You drive the car");
  }

  
  void brake() {
    System.out.println("You step on the brakes");
  }
}