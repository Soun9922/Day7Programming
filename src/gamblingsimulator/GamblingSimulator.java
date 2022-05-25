package gamblingsimulator;

public class GamblingSimulator {
        final static int STAKE_MONEY = 100;
    public static void main(String[] args) {
        int betPrice = STAKE_MONEY - 1;
        for (betPrice = 1; betPrice <= 100; betPrice++) {
            System.out.println("You have started the Game with $1");
        }
    }
}