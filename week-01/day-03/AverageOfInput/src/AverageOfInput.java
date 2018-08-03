import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner askNum1 = new Scanner(System.in);
        int num1 = askNum1.nextInt();
        Scanner askNum2 = new Scanner(System.in);
        int num2 = askNum2.nextInt();
        Scanner askNum3 = new Scanner(System.in);
        int num3 = askNum3.nextInt();
        Scanner askNum4 = new Scanner(System.in);
        int num4 = askNum4.nextInt();
        Scanner askNum5 = new Scanner(System.in);
        int num5 = askNum5.nextInt();
        System.out.println("Sum: " + (num1 + num2 + num3 + num4 + num5) + " Average: " + ((num1 + num2 + num3 + num4 + num5))/5);
    }
}
