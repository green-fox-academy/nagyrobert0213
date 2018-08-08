import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        rectangleOne(graphics,40, 40);
        rectangleTwo(graphics, 70,40);
        rectangleThree(graphics,100,40);
        rectangleFour(graphics,40,70);
    }

    public static void rectangleOne(Graphics graphics, int x, int y){
        graphics.setColor(Color.green);
        graphics.drawRect(x,y,30,30);
    }
    public static void rectangleTwo(Graphics graphics, int x, int y){
        graphics.setColor(Color.blue);
        graphics.drawRect(x,y,30,30);
    }
    public static void rectangleThree(Graphics graphics, int x, int y){
        graphics.setColor(Color.black);
        graphics.drawRect(x,y,30,30);
    }
    public static void rectangleFour(Graphics graphics, int x, int y){
        graphics.setColor(Color.orange);
        graphics.drawRect(x,y,30,30);
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