package chapterEight;
public class newEra {
    public static void main(String[] args) {
        System.out.println("Java & OOP");
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 10;
        //object-oriented programming
        p1.translate(-1, -5);
        //procedural programming
        System.out.println("Point p1: " + p1.x + ", " + p1.y);
    }
}