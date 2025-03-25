import java.util.*;

public class SayCheese {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Say Cheese: ");
        String input = console.nextLine();
        String expected = "Cheese";
        if (input.equals(expected)) {
            System.out.println("Yummy!");
        } else {
            System.out.println("Nope!, you say: " + input);
        }
        console.close();
    }
}
