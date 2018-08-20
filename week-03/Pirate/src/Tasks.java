import com.sun.corba.se.spi.orb.ParserImplTableBase;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    static int i;
    static String answerCont = "";

    public static void brawl() {
//        int end = PirateAI.health;

        for (i = 0; i < 100 ; i++) {

            if (PirateAI.health <= 0){
                killMobs();
//                    setInt0();
                inCaseDeathOfNPC();
            }
            /*if (Pirate.isPirateAlive == false || PirateAI.isPirateAlive == false){
                System.out.println("end");
                return;
            }*/

            System.out.println("Punch?");
            Scanner attack = new Scanner(System.in);
            String attackM = attack.nextLine();
            if (attackM.equals("yes")){
                Pirate.isPlayerAlive();
                Attacks.punch();
                PirateAI.setNPCHealthToZero();
                //PirateAI.isPlayerAlive();
                System.out.println("The enemy's health is " + PirateAI.health);
                Attacks.critTimes = 0;
//                if (PirateAI.health <= 0){
//                    killMobs();
////                    setInt0();
//                    inCaseDeathOfNPC();
//                }
            }

            if (Pirate.isPlayerAlive() && PirateAI.isPlayerAlive()) {
                Random chance = new Random();
                int chanceInt = chance.nextInt(100);


                if (chanceInt >= 0 && chanceInt <= 32) {
                    Attacks.punchAI();
                    Pirate.isPlayerAlive();
                    PirateAI.isPlayerAlive();
                    System.out.println("Your health is " + Pirate.health);
                }
                if (chanceInt >= 33 && chanceInt <= 65) {
                    Attacks.kickAI();
                    Pirate.isPlayerAlive();
                    PirateAI.isPlayerAlive();
                    System.out.println("Your health is " + Pirate.health);
                }
                if (chanceInt >= 66 && chanceInt <= 100) {
                    Attacks.throwAI();
                    Pirate.isPlayerAlive();
                    PirateAI.isPlayerAlive();
                    System.out.println("Your health is " + Pirate.health);
                }
            }
        }
    }
    /*public static void setInt0(){
        i = 101;
    }*/

    public static void killMobs(){
        Pirate.kill();
        System.out.println(PirateAI.name + " is dead.");
        System.out.println();
        System.out.println("You killed " + Pirate.numberOfKills + " enemies!");
        System.out.println();
        System.out.println(Pirate.xp + " earned!");
        System.out.println();
    }
    public static void inCaseDeathOfNPC() {
        System.out.println("Would you like to continue?");
        Scanner cont = new Scanner(System.in);
        answerCont = cont.nextLine();

        if (answerCont == "yes"){
            i = 0;
            PirateAI.health = 100;
            //Main.continueFight();

        }
        if (answerCont == "no"){
            i = 101;
        }
    }
}
