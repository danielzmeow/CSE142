import java.util.*;

public class Lucky {

    public static void main(String[] args) {
        Random rNumber = new Random();
        boolean lucky = lucky(rNumber);
        System.out.println("Lucky: " + lucky);
        System.out.println(digitalSum(2345));
    }

    public static boolean lucky(Random rNumber) {
        for (int i = 1; i <= 10; i++) {
            int next = rNumber.nextInt(30);
            System.out.print(next + " ");
            if (next == 7) {
                return true;
            }
        }
        return false;
    }

    public static int digitalSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
