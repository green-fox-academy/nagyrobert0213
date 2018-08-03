import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Give me a number!");
        Scanner number = new Scanner(System.in);
        int addNum = number.nextInt();
        if (addNum%2 != 0){
            System.out.println("The number is odd!");

        }
        else{
            System.out.println("The number is even!");
        }

    }
}
