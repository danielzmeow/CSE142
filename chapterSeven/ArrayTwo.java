package chapterSeven;
import java.util.*;

public class ArrayTwo {
    public static void main (String[] args) {
        int[] numbers = {2,4,56,43,78,45,23,67,89,12};
        System.out.print("Array: ");
        printArray(numbers);
        System.out.println("Sum: " + sumCalculate(numbers));
        System.out.println(Arrays.toString(numbers));
    }

    public static void printArray (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int sumCalculate (int[] numbers) {
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
