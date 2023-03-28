package scope;


public class Main {
    public static void main(String[] args) {}
    DiceRoller diceRoller;

    {
        diceRoller = new DiceRoller();
    }
}
