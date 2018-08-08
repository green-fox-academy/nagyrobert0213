import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare{

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.


        Random rnd = new Random();
        for(int i = 0; i < 3; i++){
            int x = rnd.nextInt(200);
            int y = rnd.nextInt(200);

            squareDrawing(graphics,x,y);
        }
        /*squareDrawing(graphics,x1,y1);

        int x2 = 20;
        int y2 = 20;

        squareDrawing(graphics, x2, y2);

        int x3 = 30;
        int y3 = 30;
        squareDrawing(graphics, x3, y3);
*/


    }

    public static void squareDrawing(Graphics graphics, int x, int y){
        graphics.drawRect(x,y,50,50);

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