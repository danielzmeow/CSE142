import java.awt.*;
import DrawingPanel.java;

public class DrawingPanelExample {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 200);

        //Short for panel.getGraphics(), only graphics object can draw on the panel.
        Graphics g = panel.getGraphics();

        //Set the background color of the panel to light gray.
        panel.setBackground(Color.LIGHT_GRAY);

        //Add int x, int y
        drawCar(g, 10, 30);

        
    }

    private static void drawCar(Graphics g, int x, int y) {
        g.fillRect(x, y, 100, 50);

        //Change color to cyan
        g.setColor(Color.CYAN);
        g.fillRect(x+70, y+10, 30, 20);

        //Change color to red
        g.setColor(Color.RED);
        int wheelX = 20;
        g.fillOval(x+10, y+40, 20, 20);
        g.fillOval(x+70, y+40, 20, 20);
    }
}
