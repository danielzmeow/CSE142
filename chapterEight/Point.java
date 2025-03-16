package chapterEight;

public class Point {
    int x;
    int y; 

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    } 

    public String convert() {
        return "(" + x + ", " + y + ")";
    }
}
