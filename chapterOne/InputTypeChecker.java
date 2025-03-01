package chapterOne;
import java.util.Scanner;

public class InputTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input content:");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            System.out.println("Input type is: Integer");
        } else if (isDouble(input)) {
            System.out.println("Input type is: Double");
        } else {
            System.out.println("Input type is: String");
        }

        scanner.close();
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}