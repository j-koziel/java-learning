public class OOP {
  public static void main(String[] args) {
    // object = an instance of a class which may contain attributes or methods
//    Car myCar = new Car();

//    System.out.println(myCar.make);
//    System.out.println(myCar.model);
//    myCar.drive();
//    myCar.brake();

    Human human1 = new Human("Rick", 65, 70);
    Human human2 = new Human("Morty", 16, 50);

    human2.eat();
    human1.drink();
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

class Human {
  String name;
  int age;
  double weight;
  Human(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  void eat() {
    System.out.println(this.name + " is eating");
  }

  void drink() {
    System.out.println(this.name + " is drinking");
  }

}
