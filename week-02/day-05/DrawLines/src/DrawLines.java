import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawLines{
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < WIDTH ; i+=WIDTH/15) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0,i,i*(3/2),HEIGHT);

        }
        for (int j = WIDTH; j > 0 ; j-=WIDTH/15) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(WIDTH,j*(3/2),j,0);

        }

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