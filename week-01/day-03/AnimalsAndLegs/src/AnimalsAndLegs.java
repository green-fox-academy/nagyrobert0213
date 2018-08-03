import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner chicken = new Scanner(System.in);
        int chickenCount = chicken.nextInt();
        System.out.println("This many chickens have " +chickenCount*2 + " legs!");
        int chickenLegs = chickenCount*2;

        Scanner legs = new Scanner(System.in);
        int pigCount = legs.nextInt();
        System.out.println("This many pigs have " +pigCount*4 + " legs!");
        int pigLegs = pigCount*4;

        System.out.println("Altogether they have " + (pigLegs + chickenLegs) + " legs!");
    }
}
