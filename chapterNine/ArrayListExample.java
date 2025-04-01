import java.util.*;

public class ArrayListExample {
    public static void main(String[] Args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string:");
        String consoleInput = console.nextLine();
        list.add(consoleInput);
        System.out.println(list);
        console.close();
    }
}