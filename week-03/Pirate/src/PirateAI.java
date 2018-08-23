public class PirateAI{
    static int health = 100;
    static boolean isPirateAlive = true;
    static String name;


    public PirateAI(int health, String name) {
        this.health = health;
        this.name = name;
        if (health <= 0){
            dieNPC();
        }
    }
    public static boolean isPlayerAlive(){
        if (health <= 0)
        {
            isPirateAlive = false;
            dieNPC();
        }
        return isPirateAlive;
    }
    public static void dieNPC(){
        health = 0;
        isPirateAlive = false;
    }
    public static int setNPCHealthToZero(){
        if(health <= 0){
            health = 0;
        }
        return health;
    }
}
