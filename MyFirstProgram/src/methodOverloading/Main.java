package methodOverloading;

public class Main {
    public static void main(String[] args) {
    //    method overriding is when you declare a method in a subclass which is also defined in the parent class.
    //    This allows a child class to have its own implementation of a method in a parent class
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();

    }
}
