package scope;

public class MainDice {
    public static void main(String[] args) {
        DiceRoller diceRoller;

        {
            diceRoller = new DiceRoller();
        }
    }

}
