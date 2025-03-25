import java.util.*;

public class Weather {

    public static void main(String[] args) {
        //get days of weather data
        Scanner input = new Scanner(System.in);
        System.out.print("How many days of weather data? ");
        int days = input.nextInt();

        //create array to hold temperatures
        int[] temperatures = new int[days];

        //get temperatures for each day
        int sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day" + (i + 1) + " temperature: ");
            temperatures[i] = input.nextInt();
            sum += temperatures[i];
        }

        //calculate and display average temperature
        double average = (double) sum / (double) temperatures.length;
        System.out.println("Average temperature: " + average);

        //count and display number of days above average
        int count = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }
        System.out.println("Days above average: " + count);

        //close the scanner
        input.close();
    }
}
