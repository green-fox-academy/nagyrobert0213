import com.sun.corba.se.spi.orb.ParserImplTableBase;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    static int i;

    public static void brawl(PirateAI a) {
//        int end = PirateAI.health;

        for (i = 0; i < 100 ; i++) {

            if (Pirate.isPirateAlive == false && PirateAI.isPirateAlive == false){
                System.out.println("end");
                return;
            }
            if (Pirate.health <= 0 || PirateAI.health <= 0){
                inCaseDeathOfNPC();
            }

            System.out.println("Punch?");
            Scanner attack = new Scanner(System.in);
            String attackM = attack.nextLine();
            if (attackM.equals("yes")){
                Pirate.isPlayerAlive();
                Attacks.punch();
                PirateAI.isPlayerAlive();
                System.out.println("The enemy's health is " + PirateAI.health);
                Attacks.critTimes = 0;
                if (PirateAI.health <= 0){
                    setInt0();
                }
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
    public static void setInt0(){
        i = 101;
    }

    public static void inCaseDeathOfNPC(){
        System.out.println("Move forward!");
    }
}
