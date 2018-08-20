import java.util.Scanner;

public class Main {

    static Scanner name = new Scanner(System.in);
    static String mainName = name.nextLine();
    static Pirate pirate = new Pirate(mainName,100);

    public static void main(String[] args) {
        // Scanner name = new Scanner(System.in);
        // String mainName = name.nextLine();
        // Pirate pirate = new Pirate(mainName,100);
//        PirateAI pirateTwo = new PirateAI(100,"Sanyi");
//        PirateAI pirateThree = new PirateAI(100, "Béla");
        PirateAI pirateTwo = new PirateAI(100,"Sanyi");
        pirate.chooseTask(pirateTwo);
        continueFight();

    }
    public static void continueFight(){
        if (Tasks.answerCont == "true"){
            PirateAI pirateThree = new PirateAI(100, "Béla");
            pirate.chooseTask(pirateThree);
        }
    }
}
