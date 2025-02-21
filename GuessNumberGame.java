import java.util.*;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("Plz guess an even one-digital number:");
        Random rNumber = new Random();
        int answer = 2 * rNumber.nextInt(5);
        System.out.println("Answer is " + answer + ".");

        //get into while loop. Not necessary to initialize guess.
        int guess = -1;
        int times = 0;

        while (guess != answer) {
            times += 1;
            System.out.println("You guess is?");
            Scanner console = new Scanner(System.in);
            guess = console.nextInt();
        }

        //As long as it jumps out of the loop, it means the guess is right. No test required.
        System.out.println("Bingo! You got it right in " + times + " times.");
    }
}