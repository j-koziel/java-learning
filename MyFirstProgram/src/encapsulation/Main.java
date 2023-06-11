package encapsulation;

public class Main {
    public static void main(String[] args) {
    //    Encapsulation -> Attributes of a class will be either hidden or private.
    //    These can only be accessed by methods of that class (getters and setters)
    //    Attributes should be private if there is no reason to make them public/protected
    //    Again this is all about security

        Car car = new Car("Chevrolet", "Camaro", 2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    //    We are asking this class: "Can we pretty please get these attributes? :)"

        // Setters let you change the values of private attributes
        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
