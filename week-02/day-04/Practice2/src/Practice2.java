import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

        System.out.println("What is your name?");
        String name = name();
        validName(name);
        int age = age();
        System.out.println("You are " + age + " old.");



    }


    public static int age(){
        System.out.println("How old are you?");
        Scanner ageInput = new Scanner(System.in);
        int x = ageInput.nextInt();

        return x;
    }

    public static void validName (String y){

        if(y.equals("Robi")){
            accessGranted(y);


        }
        else{
            System.out.println("Access Denied");

            System.exit(0);

        }
    }

    public static void accessGranted(String x){
        System.out.println("Welcome " + x + "!");

    }




    public static String name(){
        Scanner userInput = new Scanner(System.in);
        String x = userInput.nextLine();
        return x;

    }
}
