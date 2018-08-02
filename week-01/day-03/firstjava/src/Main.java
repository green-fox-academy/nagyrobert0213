import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* int intNum = 0;
        intNum++;
        intNum += 5;
        double dub = 1.5;
        boolean bool = true;
        String name = "Robi";
        char firstChar = 'c';
        System.out.println("Szia " + name);
        */
        /* int number = 15;
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("I can be divided by 3 and 5."); */

        /* int i = 0;
        while(i < 10){
            System.out.println("BADBOI is awesome!");
            i++; */
        /* for(int i = 0; i < 10; i++){
            System.out.println("gf");
        }
        int j = 0;
        do{
            System.out.println("hello");
            j++;
        }while(j != 5); */

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a neved!");
        String line = sc.nextLine();
        int number = sc.nextInt();
        System.out.println("Hello " + line + "!");
        System.out.println(number);
    }
}
