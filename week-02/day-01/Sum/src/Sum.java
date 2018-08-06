import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        System.out.println("Enter how many numbers do you want to add!");
        Scanner sc = new Scanner(System.in);
        int numbersToAdd = sc.nextInt();
        System.out.println("Sum : " + sum(numbersToAdd));
    }

    public static int sum(int n){
        int total = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Enter your number!");
            Scanner sc2 = new Scanner(System.in);
            int b = sc2.nextInt();
            total += b;

        }
        return total;
    }
}