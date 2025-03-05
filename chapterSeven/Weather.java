package chapterSeven;
import java.util.*;

public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days of weather data? ");
        int days = input.nextInt();

        int[] temperatures = new int[days];

        int sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day" + (i + 1) + " temperature: ");
            temperatures[i] = input.nextInt();
            sum += temperatures[i];
        }

        double average = (double) sum / (double) temperatures.length;
        System.out.println("Average temperature: " + average);
        
        int count = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }
        System.out.println("Days above average: " + count);

        //Close the scanner
        input.close();
    }
}