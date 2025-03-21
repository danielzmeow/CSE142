package chapterEight;

public class newEra {
    public static void main(String[] args) {
        System.out.println("Java & OOP");
        Point p1 = new Point(5, 10);
        //object-oriented programming
        p1.translate(-1, -5);
        //procedural programming
        System.out.println("Point p1: " + p1.convert());
    }
}