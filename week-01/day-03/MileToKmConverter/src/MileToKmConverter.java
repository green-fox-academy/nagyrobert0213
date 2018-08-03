import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("Please give me a distance in miles!");
        Scanner scanner = new Scanner(System.in);
        int askKm = scanner.nextInt();
        System.out.println(askKm);
        double resultInMiles = (double) askKm * 1.609344;
        System.out.format("%.3f%n",resultInMiles); System.out.println("KMs");

    }
}
