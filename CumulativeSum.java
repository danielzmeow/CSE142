import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        //Start a scanner object to get max value
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int max = console.nextInt();
        console.close();
        //Print the cumulative sum
        System.out.println("Cumulative sum: " + sumToMax(max));
    }     
    
    //Return the sum of all numbers from 1 to max
    private static int sumToMax(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        //Return the sum
        return sum;
    }
}
