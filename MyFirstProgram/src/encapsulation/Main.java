package encapsulation;

public class Main {
    public static void main(String[] args) {
    //    Encapsulation -> Attributes of a class will be either hidden or private.
    //    These can only be accessed by methods of that class (getters and setters)
    //    Attributes should be private if there is no reason to make them public/protected
    //    Again this is all about security

        //Car car = new Car("Chevrolet", "Camaro", 2021);
        //System.out.println(car.getMake());
        //System.out.println(car.getModel());
        //System.out.println(car.getYear());

    //    We are asking this class: "Can we pretty please get these attributes? :)"

        // Setters let you change the values of private attributes
        //car.setYear(2022);

        //System.out.println(car.getMake());
        //System.out.println(car.getModel());
        //System.out.println(car.getYear());

        /////////////////////////////////////////////
        // Copy objects
        /////////////////////////////////////////////

        Car car1 = new Car("Chevrolet", "Camaro", 2021);
        //Car car2 = new Car("Ford", "Mustang", 2022);

        // DON'T DO THIS
        //car2 = car1;
        // All this basically does is pointing to the same car in memory.
        // It does not actually copy the values it just references the same object

        //car2.copy(car1);

        // Copy constructor
        // Use an overloaded constructor as a copy constructor which will copy values from the provided object to the
        // new object
        Car car2 = new Car(car1);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
