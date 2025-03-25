import java.util.*;

public class BMICalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        int BMI1 = basicBMI();

        System.out.println("Enter your name: ");
        String userName2 = scanner.nextLine();
        int BMI2 = basicBMI();

        if (BMI1 > BMI2) {
            System.out.println(userName + " has a higher BMI of " + BMI1);
        } else if (BMI2 > BMI1) {
            System.out.println(userName2 + " has a higher BMI of " + BMI2);
        } else {
            System.out.println(
                userName + " and " + userName2 + " have the same BMI of " + BMI1
            );
        }
    }

    public static int calculateBMI(double weightInKg, double heightInMeters) {
        double BMI = weightInKg / (heightInMeters * heightInMeters);
        return (int) BMI;
    }

    public static int basicBMI() {
        System.out.println("Enter your weight in kg: ");
        double weightInKg = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline

        System.out.println("Enter your height in meters: ");
        double heightInMeters = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline

        int BMI = calculateBMI(weightInKg, heightInMeters);
        return BMI;
    }
    /*
    public static String getBMIStatus(int BMI) {
        if (BMI < 18.5) {
            return "Underweight";
        } else if (BMI >= 18.5 && BMI < 25) {
            return "Normal weight";
        } else if (BMI >= 25 && BMI < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    */

}
