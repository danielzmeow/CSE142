package chapterEight;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setPoint(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    } 

    public String convert() {
        return "(" + x + ", " + y + ")";
    }
}
