import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random rnd = new Random();

        for(int i = 0; i < 4; i++){
            int h = rnd.nextInt(300);
            int j = rnd.nextInt(310);
            int k = rnd.nextInt(320);
            int l = rnd.nextInt(330);

            rectangleOne(graphics,h,j,k,l);
        }
    }

    public static void rectangleOne(Graphics graphics, int h, int j, int k, int l){
        graphics.drawRect(h, j, k, l);
    }





    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}