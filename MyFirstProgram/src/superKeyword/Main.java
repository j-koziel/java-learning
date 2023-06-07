package superKeyword;

public class Main {
    public static void main(String[] args) {
    //    super is a keyword which refers to the parent class or superclass of an object
    //    The super keyword allows you to call the constructor of the parent class without having to assign the same
    //    fields and values again.
    //    It also allows you to call methods of the parent class which gives more flexibility in specific implementation
    //    of methods.
        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "everything");

        System.out.println(hero2.toString());
    }
}
