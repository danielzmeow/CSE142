import graphics.DrawingPanel.java;
import java.awt.*;

public class DrawingPanelCar {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 200);

        //Short for panel.getGraphics(), only graphics object can draw on the panel.
        Graphics g = panel.getGraphics();

        //Set the background color of the panel to light gray.
        panel.setBackground(Color.LIGHT_GRAY);

        //Add int x, int y
        for (int i = 0; i < 300; i++) {
            panel.clear();
            drawCar(g, 10 + i, 30, 100);
            panel.sleep(30);
        }
    }

    private static void drawCar(Graphics g, int x, int y, int width) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, width / 2);

        //Change color to cyan
        g.setColor(Color.CYAN);
        g.fillRect(
            x + (7 * width) / 10,
            y + width / 10,
            (3 * width) / 10,
            width / 5
        );

        //Change color to red
        g.setColor(Color.RED);
        g.fillOval(x + width / 10, y + (4 * width) / 10, width / 5, width / 5);
        g.fillOval(
            x + (7 * width) / 10,
            y + (4 * width) / 10,
            width / 5,
            width / 5
        );
    }
}
