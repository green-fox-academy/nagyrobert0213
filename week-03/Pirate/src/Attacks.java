import java.util.Random;

public class Attacks {


    static int critTimes;
    public static boolean crit = false;


    public static int damageMain(){
        int damageMain = PirateAI.health -= 30;
        return damageMain;
    }

    public static void damage(){
        damageMain();
        criticalChance();
        if(crit == true){
            damageCrit();
            System.out.println("You made a critical strike!");
            critTimes = 0;
        }

    }
    public static void damageAI(){
        Pirate.health -= 10;
        criticalChance();
        if(crit == true){
            damageCritAI();
            System.out.println("The enemy made a critical strike!");
            critTimes = 0;
        }
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
    public static boolean criticalChance(){
        Random critRnd = new Random();
        int criticalChance = critRnd.nextInt(100);
        if (critTimes < 1){
            //for (int i = 0; i < 1;i++) {
                if (criticalChance < 30) {
                    //i++;
                    critTimes++;
                    crit = true;
                }
            //}
        }
        return crit;
    }

    public static void damageCrit(){
        PirateAI.health -= 10;
        crit = false;
    }
    public static void damageCritAI(){
        Pirate.health -= 10;
        crit = false;
    }
}
