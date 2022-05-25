package gamblingsimulator;

public class GamblingSimulator {
    final static int STAKE_MONEY = 100;

    public boolean winOrloss() {
        if (Math.random() < 0.5)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        GamblingSimulator gambler = new GamblingSimulator();
        int betPrice = STAKE_MONEY - 1;
        for (betPrice = 1; betPrice <= 100; betPrice++) {
            System.out.println("You have started the Game with $1");
            if (gambler.winOrloss()){
                System.out.println("You have Win the game");
            }else
                System.out.println("You Loose the game");
        }
    }
}