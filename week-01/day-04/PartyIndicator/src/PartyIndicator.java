import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner addNumOfGirls = new Scanner(System.in);
        int numOfGirls = addNumOfGirls.nextInt();

        Scanner addNumOfBoys = new Scanner(System.in);
        int numOfBoys = addNumOfBoys.nextInt();

        if(numOfBoys == numOfGirls && numOfBoys + numOfGirls >= 20) {
            System.out.println("The party is excellent");
        }

        if(numOfBoys != numOfGirls && numOfBoys + numOfGirls >=20){
            System.out.println("Quite cool party");
        }
        if(numOfBoys + numOfGirls < 20){
            System.out.println("Average party");
        }
        if(numOfGirls == 0){
            System.out.println("Sausage party");
        }
    }
}
