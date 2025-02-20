import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        while (number != -1) {
            sum = sum + number;
            System.out.print("Enter a number: ");
            number = console.nextInt();
        }
        System.out.println("Sum = " + sum);
        console.close();
    }
}