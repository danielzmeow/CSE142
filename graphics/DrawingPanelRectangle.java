package graphics;
import java.awt.*;

import graphics.DrawingPanel.java;

public class DrawingPanelRectangle {
    public static void main (String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 400);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();
        drawPattern(g, 50, 50, 100);
    }

    private static void drawPattern(Graphics g, int x, int y, int size) {
        g.setColor(Color.RED);
        g.fillRect(x, y, size, size);
        g.setColor(Color.GREEN);
        g.fillOval(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
        g.drawOval(x, y, size, size);
        g.drawLine(x, y, x + size, y + size);
        g.drawLine(x + size, y, x, y + size);
    }
}
