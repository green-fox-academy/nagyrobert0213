import java.util.Scanner;

public class Sharpie {
//    Create Sharpie class
//    We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//    which decreases inkAmount

        float inkAmount = 100;
        Scanner scn = new Scanner(System.in);
        String color = scn.nextLine();
        float width = scn.nextFloat();

        public Sharpie(){
                System.out.println(this.color);
                System.out.println(this.width);

        }

        public void use(){
            this.inkAmount--;
        }
}
