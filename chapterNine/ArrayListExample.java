import java.util.*;

public class ArrayListExample {
    public static void main(String[] Args) {
        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string:");
        String consoleInput = console.nextLine();
        list.add(consoleInput);
        console.close();
        list.remove("Hello");
        System.out.println(list);
        */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(17);
        numbers.add(89);
        numbers.add(5);
        numbers.add(63);
        numbers.add(28);
        numbers.add(91);
        numbers.add(34);
        numbers.add(76);
        numbers.add(12);
        minToMax(numbers);
        System.out.println("Sorted numbers: " + numbers);
        System.out.println("Sorted? " + isSorted(numbers));
    }

    public static void minToMax(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i ++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static boolean isSorted(ArrayList<Integer> list) {
        boolean isSorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isSorted = false;
            }
        }
        return isSorted;
    }
}