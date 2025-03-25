import java.io.*;
import java.util.*;

public class FileExample {

    public static void main(String[] args) {
        try {
            File numberFile = new File("chapterSix/numbers.txt");
            Scanner input = new Scanner(numberFile);

            double sum = 0.0;
            while (input.hasNext()) {
                double number = input.nextDouble();
                System.out.println("Number: " + number);
                sum += number;
            }
            System.out.println("Sum: " + sum);

            input.close();
        } catch (FileNotFoundException error) {
            System.out.println("File not found: " + error.getMessage());
        }
    }
}
