import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
        Scanner content1 = new Scanner(System.in);
        System.out.println("Enter the first content: ");
        String input1 = content1.nextLine();

        Scanner content2 = new Scanner(System.in);
        System.out.println("Enter the second content: ");
        String input2 = content2.nextLine();

        if (input1.equals(input2)) {
            System.out.println("These contents are same.");
        } else {
            System.out.println("These contents are not same.");
        }

        // Close the scanner
        content1.close();
        content2.close();
    }
}
