package chapterFive;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FunctionalProgramming {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        System.out.println("numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        arrayExample();

        rangeExample();

        System.out.println();

        funnyExample();

        /*
        for (int i = 1; i <= 3466432; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            } 
        }
        */
    }

    public static void arrayExample() {
        int [] numbers = {4,6,7,3,2,4,5,9,3};
        System.out.println("numbers:");
        System.out.println(Arrays.stream(numbers)
        //.filter(number -> number % 2 == 0)
            .distinct()
            .sorted()
            .map(n -> n * 2)
            .summaryStatistics());
    }

    public static void rangeExample() {
        IntStream.range(1, 6)
            .forEach(System.out::print);
            //.forEach(n -> System.out.println(n));
    }

    public static int factorial(int n) {
        return IntStream.range(1,n+1)
            .reduce(1, (a,b) -> a*b);
    }

    public static boolean isPrime(int n) {
        return IntStream.range(1, n+1)
            .filter(m -> n % m == 0)
            .count() == 2;
    }

    public static void printPrimeSum (IntStream stream) {
        long startTime = System.currentTimeMillis();

        int sum = stream
            .filter(FunctionalProgramming::isPrime)
            .sum();

        double elapsed = System.currentTimeMillis() - startTime;

        System.out.println("Sum of prime numbers: " + sum + " ,Time: " + elapsed + "ms");
    }

    public static void funnyExample() {
        printPrimeSum(IntStream.range(1, 65789).parallel());

        printPrimeSum(IntStream.range(1, 65789));
    }
}