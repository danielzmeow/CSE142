package chapterSix;
import java.io.*;
import java.util.*;

public class LineBasedProcessing {
    public static void main (String[] args) throws FileNotFoundException {

        //Add Movie File and Scanner
        File movieFile = new File("chapterSix/imbd.txt");
        Scanner inputMovie = new Scanner(movieFile);

        //Add User Contents
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a movie title: ");
        String userSearchMovie = console.nextLine();
        System.out.println("Movie title: " + userSearchMovie);

        //Search Movie
        System.out.println(searchMovie(inputMovie, userSearchMovie));

        //Close Scanners
        console.close();
        inputMovie.close();
    }

    public static String searchMovie (Scanner inputMovieContents, String searchMovieContents) {
        while (inputMovieContents.hasNextLine()) {
            String line = inputMovieContents.nextLine();
            if (line.toLowerCase().contains(searchMovieContents.toLowerCase())) {
                return line;
            }
        }
        return ("Movie not found");
    }
}
