import java.util.Scanner;

public class DrawPattern {
    //Public Variables
    private static int column = 12;

    public static void main(String[] args) {
        //Add a scanner to input the column
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input column (Must be multiple of 4): ");
        column = scanner.nextInt();
        scanner.close();
        
        //Main drawing parts
        drawLine();
        drawTopHalf();
        drawBottomHalf();
    }

    private static void drawLine() {
        System.out.print("#");
        for (int i = 0; i < column; i++) {
            System.out.print("*");
        }
        System.out.println("#");
    }

    private static void drawTopHalf() {
        for (int i = 0; i < (column / 4); i++) {
            System.out.print("#");

            for (int k = ((column - 4 * (i + 1)) / 2); k > 0; k--) {
                System.out.print(" ");
            }

            System.out.print("<>");

            for (int j = 0; j < (4*i); j++) {
                System.out.print("*");
            }

            System.out.print("<>");

            for (int k = ((column - 4 * (i + 1)) / 2); k > 0; k--) {
                System.out.print(" ");
            }

            System.out.println("#");
        }
    }

    private static void drawBottomHalf() {
        for (int i = 0; i < (column / 4); i++) {
            System.out.print("#");

            for (int k = 0; k < (2 * i); k++) {
                System.out.print(" ");
            }

            System.out.print("<>");

            for (int j = (column - 4 * (i + 1)); j > 0; j--) {
                System.out.print("*");
            }

            System.out.print("<>");

            for (int k = 0; k < (2 * i); k++) {
                System.out.print(" ");
            }

            System.out.println("#");
        }
    }
}