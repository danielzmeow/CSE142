import java.io.*;
import java.util.*;

public class LineBasedProcessing {

    public static void main(String[] args) throws FileNotFoundException {
        //Add Movie File and Scanner
        File movieFile = new File("chapterSix/imbd.txt");
        Scanner inputMovie = new Scanner(movieFile);

        //Add User Contents
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a movie title: ");
        String userSearchMovie = console.nextLine();

        //Search Movie
        String line = searchMovie(inputMovie, userSearchMovie);

        //find all movies matching the search
        if (!line.equals("Movie not found")) {
            System.out.println("#\tRating\tTitle (Year)");
            while (!line.equals("Movie not found")) {
                printMovie(line);
                line = searchMovie(inputMovie, userSearchMovie);
            }
        } else {
            System.out.println(line);
        }

        //Close Scanners
        console.close();
        inputMovie.close();
    }

    //The second call to searchMovie starts from where the first call left off (not from the beginning)
    public static String searchMovie(
        Scanner inputMovieContents,
        String searchMovieContents
    ) {
        while (inputMovieContents.hasNextLine()) {
            String line = inputMovieContents.nextLine();
            if (
                line.toLowerCase().contains(searchMovieContents.toLowerCase())
            ) {
                return line;
            }
        }
        return ("Movie not found");
    }

    public static void printMovie(String movie) {
        Scanner data = new Scanner(movie);
        try {
            double rating = data.nextDouble();
            int year = data.nextInt();
            int rank = data.nextInt();
            System.out.print(rank + "\t" + rating + "\t");
            while (data.hasNext()) {
                String title = data.next();
                System.out.print(title + " ");
            }
            System.out.println(year);
        } catch (InputMismatchException e) {
            System.out.println("Error: Incorrect data format in movie entry.");
        } finally {
            data.close();
        }
    }
}
