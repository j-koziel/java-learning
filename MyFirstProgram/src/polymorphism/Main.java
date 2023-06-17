package polymorphism;

public class Main {
    public static void main(String[] args) {
    //    Polymorphism is a greek work
    //    Poly means many
    //    Morph means form
    //    This is simply the ability of an object to identify as more
    //    than one type.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();


        // They all share the vehicle type
        Vehicle[] racers = {car, bicycle, boat};

    //    instead of doing this:
    //    car.go();
    //    bicycle.go();
    //    boat.go();

    //    do this: looping
        for (Vehicle x : racers) {
            x.go();

        }




    }
}
