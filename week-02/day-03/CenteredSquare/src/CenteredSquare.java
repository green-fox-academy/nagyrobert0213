import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.

        int numOfLines = 4;

        graphics.setColor(Color.green);
        graphics.drawLine(160, 343 / 2, 160, 343 / 2 + 10);
        graphics.setColor(Color.green);
        graphics.drawLine(160, 343 / 2 + 10, 160 + 10, 343 / 2 + 10);
        graphics.setColor(Color.green);
        graphics.drawLine(160 + 10, 343 / 2 + 10, 160 + 10, 343 / 2);
        graphics.setColor(Color.green);
        graphics.drawLine(160 + 10, 343 / 2, 160, 343 / 2);


    }

    public static void center(Graphics graphics, int x, int y){
        graphics.setColor(Color.GREEN);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}