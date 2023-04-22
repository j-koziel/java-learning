package objectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);

//        You can pass in objects as parameters to methods
//        to do this properly you need to set up the methods to
//        accept the argument with the data type of the object (class instance)
    }
}
