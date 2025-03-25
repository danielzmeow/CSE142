import java.util.*;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        System.out.println(number);
        console.close();
    }
}
