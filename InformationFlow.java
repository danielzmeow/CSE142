public class InformationFlow {
    public static void main(String[] args) {
        drawLine(5);
        System.out.println();
        drawBox(5, 10);
        System.out.println();
        sayHello("Daniel");
    }

    private static void drawLine(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawBox(int row, int column) {
        drawLine(column);
        for (int i = 0; i < (row - 2); i++) {
            System.out.print("*");
            for (int j = 0; j < (column - 2); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        drawLine(column);
    }

    private static void sayHello(String name) {
        System.out.println("Hello, " + name + ", How are you?");
    }
}
