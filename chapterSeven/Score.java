package chapterSeven;
import java.util.*;
import java.io.*; // Added import for FileNotFoundException

public class Score {
    public static void main(String[] args) throws FileNotFoundException {
        // import file
        File inputText = new File("chapterSeven/text.txt");
        Scanner inputFile = new Scanner(inputText);

        // print each line
        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            formattedPrint(computeScores(line));
        }

        // close the scanner
        inputFile.close();
    }

    public static int[] computeScores(String line) {
        int[] scores = new int[line.length()];
        for(int i = 0; i < line.length(); i++) {
            char nextChar = line.charAt(i);
            if (nextChar == '1') {
                scores[i] = 1;
            } 
        }
        return scores;
    }

    public static void formattedPrint (int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.print(inputArray[inputArray.length - 1]);
        System.out.println();
    }
}
