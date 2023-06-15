package interfaces;

public class Main {
    public static void main(String[] args) {
    //    An interface is like a template for what a class must have
    //    It's a bit similar to inheritance with the key difference being that inherited classes have only one super
    //    class, while they can implement multiple interfaces
    //    An interface declares methods which must be implemented in classes where the interface is implemented

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
