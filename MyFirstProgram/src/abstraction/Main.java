package abstraction;

public class Main {
    public static void main(String[] args) {
        //    The abstract keyword can be used with classes and methods
        //    Abstract classes cannot be instantiated, but they can have child classes
        //    It adds a layer of security to your code
        //    Abstract methods are declared but without an implementation
        //    They are just a general idea of what the child classes should look like

        // Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();
    }
}
