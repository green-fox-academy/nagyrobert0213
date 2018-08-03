import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int addNum1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        int addNum2 = num2.nextInt();

        if(addNum1>addNum2){
            System.out.println(addNum1);
        }
        else{
            System.out.println(addNum2);
        }

    }
}
