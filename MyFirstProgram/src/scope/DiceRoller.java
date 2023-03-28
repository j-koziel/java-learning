package scope;

import java.util.Random;

public class DiceRoller {

    Random random = new Random();
    int number;
    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}
