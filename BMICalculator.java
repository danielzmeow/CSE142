import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        double weightInKg = weight.nextDouble();

        Scanner height = new Scanner(System.in);
        System.out.println("Enter your height in meters: ");
        double heightInMeters = height.nextDouble();

        weight.close();
        height.close();

        int BMI = calculateBMI(weightInKg, heightInMeters);
        String status = getBMIStatus(BMI);
        System.out.println(status);
    }

    public static int calculateBMI(double weightInKg, double heightInMeters) {
        double BMI = weightInKg / (heightInMeters * heightInMeters);
        return (int) BMI;
    }

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
}
