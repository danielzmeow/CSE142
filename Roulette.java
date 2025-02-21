import java.util.*;

public class Roulette {
    public static void main(String[] args) {
        System.out.println("Roulette game started!");
        Random rNumber = new Random();
        int money = 10;
        int max = money;

        while (money > 0) {
            int bet = Math.min(3, money);
            int spin = rNumber.nextInt(37);
            if (spin > 18) {
                money += bet;
            } else {
                money -= bet;
            }

            max = Math.max(max, money);

            System.out.println("bet: " + bet + ", spin: " + spin + ", money: " + money);
        }
        System.out.println("Game over! Max money: " + max);
    }
}