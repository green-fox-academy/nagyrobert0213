import javax.swing.*;
import java.lang.String;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

    graphics.setColor(Color.BLUE);
    ArrayList<Color> colorList = new ArrayList<>();
        colorList.add(Color.red);
        colorList.add(Color.orange);
        colorList.add(Color.yellow);
        colorList.add(Color.green);
        colorList.add(Color.blue);
        colorList.add(new Color(111,0,255));
        colorList.add(new Color(128, 0,128));

       /* colors[0] = "red";
        colors[1] = "orange";
        colors[2] = "yellow";
        colors[3] = "green";
        colors[4] = "blue";
        colors[5] = "indigo";
        colors[6] = "violet";*/

        for(int i = colorList.size()-1; i >= 0; i--) {
            graphics.setColor(colorList.get(i));
            drawingFunction(graphics, i * 10);
        }
    }



    public static void drawingFunction(Graphics graphics, int size){
        graphics.fillRect(10,10,size,size);


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