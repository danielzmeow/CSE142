public class ForLoop {

    public static void main(String[] args) {
        nestedLoop(5, 10);
    }

    private static void squaredNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " squared is " + i * i);
        }
    }

    private static void nestedLoop(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
