import java.util.*;

public class AbsoluteValue {

    public static void main(String[] args) {
        int[] numbers = { 2, -4, 56, -43, 78, -45, 23, -67, 89, -12 };
        absValue(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] absValue(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(numbers[i]);
        }

        return numbers;
    }
}
