public class Variables {
    public static void main(String[] args) throws Exception {
        
        // The main data types which variables can have
        byte x = 127; // bytes range from -128 - 127
        double y = 3.14; // doubles can have 15 numbers after the dec. point
        boolean z = true; // booleans are binary of course
        char symbol = '@'; // char is a single character
        String name = "Bro"; // sequence of chars
        
        // Switching variables
        String water = "water";
        String koolAid = "Kool-Aid";
        String temp; // temporary variable which will hold one of the values so that the other value can be put in instead

        temp = water; // storing water in temp
        water = koolAid; // putting koolaid into empty water
        koolAid = temp; // koolaid being given temp (the water)

        System.out.println("x: " + water);
        System.out.println("y: " + koolAid);
         
    }
} 