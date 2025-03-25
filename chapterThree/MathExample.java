public class MathExample {

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        double days = convertToDays(millis);
        int weeks = (int) (days / 7);
        System.out.println(
            "Current time in days: " + String.format("%.2f", days)
        );
        System.out.println("Current time in weeks: " + (int) weeks);
    }

    public static double convertToDays(double millis) {
        double answers = (millis / 1000 / 60 / 60 / 24);
        return answers;
    }
}
