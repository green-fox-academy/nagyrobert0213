import java.util.Random;

public class Pirate {

    static int soberness = 10;
    static int drinkRumTimes = 0;
    int health;
    boolean isPirateAlive = true;

    public Pirate(int health){
        this.health = health;
    }

    public void drinkSomeRum(){
        this.soberness--;
        this.drinkRumTimes++;
        if (soberness < 0){
            System.out.println("He is already dead");
            isPirateAlive = false;
        }


        System.out.println("Your soberness is " + soberness);
        System.out.println("You drank rum " + drinkRumTimes + " times.");
        dieCuzRum();
    }

    public void howItGoingMate(){
        if (drinkRumTimes>=0 && drinkRumTimes<=4){
            System.out.println("Pour me anudder!");
        }
        else{
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }
    public void dieCuzRum(){
        if (soberness == 0){
            this.health = 0;
            System.out.println("He drank too much rum, so he is dead.");
            isPirateAlive = false;
        }
    }
    public boolean isPlayerAlive(){
        return isPirateAlive;
    }

    public void dieNPC(){
        this.health = 0;
        isPirateAlive = false;
    }
    public void brawl(Pirate a){
        if (a.isPlayerAlive() && isPirateAlive){
            Random chance = new Random();
            int chanceInt = chance.nextInt(100);

            if (chanceInt >= 0 && chanceInt <= 32) {
                a.dieNPC();
                System.out.println("Main player wins");
            }
            if (chanceInt >= 33 && chanceInt <= 65) {
                dieNPC();
                System.out.println("NPC wins");
            }
            if (chanceInt >= 66 && chanceInt <= 100) {
                System.out.println("Both pass out");
            }
        }

    }
}
