import java.util.Random;

public class Attacks {

    static int critTimes;

    public static void damage(){
        PirateAI.health -= 10;
        criticalChance();
    }
    public static void damageAI(){
        Pirate.health -= 10;
        criticalChance();
    }

    public static void punch(){
        damage();
    }
    public static void punchAI(){
        damageAI();
    }
    public static void kickAI(){
        damageAI();
    }
    public static void throwAI(){
        damageAI();
    }
    public static void criticalChance(){
        Random critRnd = new Random();
        int criticalChance = critRnd.nextInt(100);
        if (critTimes < 1){
            for (int i = 0; i < 1;i++) {
                if (criticalChance < 70) {
                    damage();
                    System.out.println("Crit!");
                    i++;
                    critTimes++;
                }
            }
        }
    }
}
