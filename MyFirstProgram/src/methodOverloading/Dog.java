package methodOverloading;

public class Dog extends Animal {
    //This is the overriding method
    //Its good practice to add this annotation
    @Override
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}
