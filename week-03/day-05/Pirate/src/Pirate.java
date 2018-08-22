import java.util.Random;
import java.util.Scanner;

public class Pirate {

    static int soberness = 10;
    static int drinkRumTimes = 0;
    static int health;
    static boolean isPirateAlive = true;
    static String mainCharName;

    public Pirate(String mainCharName, int health) {
        this.health = health;
        System.out.println("What is your name?");
        Scanner charName = new Scanner(System.in);
        this.mainCharName = charName.nextLine();
        if (health <= 0){
            dieMain();
        }
    }

    public void chooseTask(PirateAI b) {
//        System.out.println("What would you like to do?");
//        Scanner tasks = new Scanner(System.in);
//        String chooseTask = tasks.nextLine();
        for (int i = 0; i < 1; i++) {
            System.out.println("What would you like to do?");
            Scanner tasks = new Scanner(System.in);
            String chooseTask = tasks.nextLine();
            if (chooseTask.equals("drink")) {
                drinkSomeRum();
                i = 1;
            }
            if (chooseTask.equals("brawl")) {
                Tasks.brawl(b);
            }
        }
      /*  if (chooseTask.equals("drink")){
            drinkSomeRum();
        }
        if (chooseTask.equals("brawl")){
//            brawl();
        } */
    }

    public void drinkSomeRum() {
        this.soberness--;
        this.drinkRumTimes++;
        if (soberness < 0) {
            System.out.println("He is already dead");
            isPirateAlive = false;
        }


        howItGoingMate();
        System.out.println("Your soberness is " + soberness);
        System.out.println("You drank rum " + drinkRumTimes + " times.");
        dieCuzRum();
    }

    public void howItGoingMate() {
        if (drinkRumTimes >= 0 && drinkRumTimes <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void dieCuzRum() {
        if (soberness == 0) {
            health = 0;
            System.out.println("He drank too much rum, so he is dead.");
            isPirateAlive = false;
        }
    }

    public static boolean isPlayerAlive() {
        if (health <= 0)
        {
            isPirateAlive = false;
            dieMain();
        }
        return isPirateAlive;
    }

    public static void dieMain() {
        health = 0;
        isPirateAlive = false;
        System.out.println(mainCharName + " is dead.");
        System.exit(0);
    }
//    public void brawl(PirateAI a){
//
//
//        if (a.isPlayerAlive() && PirateAI.isPirateAlive){
//            Random chance = new Random();
//            int chanceInt = chance.nextInt(100);
//
//            if (chanceInt >= 0 && chanceInt <= 32) {
//                PirateAI.dieNPC();
//                System.out.println("Main player wins");
//            }
//            if (chanceInt >= 33 && chanceInt <= 65) {
//                dieMain();
//                System.out.println("NPC wins");
//            }
//            if (chanceInt >= 66 && chanceInt <= 100) {
//                System.out.println("Both pass out");
//            }
//        }

}

