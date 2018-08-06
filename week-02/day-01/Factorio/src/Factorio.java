import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt();
        System.out.println("The factorial of the number " + numOne + " is " + factorio(numOne));

    }
    public static int factorio(int a){

        int result = 1;
        for (int i = 1; i <= a; i++){
            result=result*i;

        }
        return result;
    }
}
