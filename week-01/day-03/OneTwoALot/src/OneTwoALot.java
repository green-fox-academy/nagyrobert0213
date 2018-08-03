import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int addNum = number.nextInt();
        if (addNum <= 0) {
            System.out.println("Not enough");
        }
        if (addNum == 1) {
            System.out.println("One");
        }
        if (addNum == 2){
            System.out.println("Two");
        }
        if (addNum > 2){
            System.out.println("A lot");
        }
    }
}
