import java.util.Scanner;

public class NumberUpdate {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = console.nextInt();
        console.close();
        updateRule(n);
    }

    public static int updateRule(int n) {
        System.out.println("Update in progress");
        int change;
        //No matter what change will be given a value comparing with if - else if, so it can works
        if (n < 0) {
            change = 42;
        } else {
            change = -13;
        }
        n = n + change;
        return n;
    }
}
