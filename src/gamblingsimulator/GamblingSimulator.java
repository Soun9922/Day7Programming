package gamblingsimulator;

public class GamblingSimulator {
    public boolean winOrloss() {
        if (Math.random() < 0.5)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        GamblingSimulator gambler = new GamblingSimulator();
        int stakeMoney =100;
        int betPrice = 1;
        for (betPrice = 1; betPrice <= 100; betPrice++) {
            System.out.println("You have started the Game with $1");
            if (gambler.winOrloss()) {
                betPrice++;
                System.out.println("You have Win the game");
                System.out.println("You have won : "+betPrice);
                if (betPrice == 50){
                    System.out.println("You will not playing for the rest of the day.");
                }
            } else {
                betPrice--;
                System.out.println("You Loose the game");
                System.out.println("You have loose : "+betPrice);
            }
        }
    }
}