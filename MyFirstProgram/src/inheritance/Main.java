package inheritance;
public class Main {
    public static void main(String[] args) {
    //    inheritance = this is when a class acquires the properties of another class
    //    Classes which inherit from another class are called child classes (they are descendants of the parent class)
    //    Code is reusable (DRY principle)

        Car car = new Car();

        // car.go();

        Bicycle bike = new Bicycle();

        // bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
