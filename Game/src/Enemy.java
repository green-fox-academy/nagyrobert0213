import java.util.Random;

public class Enemy {

    static int health = 0;
    static String name = "";
    static int difficulty = 0;

    public Enemy(){
    }

    static void skeleton(){
        name = "Skeleton";
        health = 50;
        System.out.println("Your enemy is a " + name);
        System.out.println("Your enemy has " + health + " hp!");
        difficulty = 1;
    }

    static void spider(){
        name = "Spider";
        health = 80;
        System.out.println("Your enemy is a " + name);
        System.out.println("Your enemy has " + health + " hp!");
        difficulty = 2;
    }

    static void human(){
        name = "John";
        health = 100;
        System.out.println("Your enemy is " + name);
        System.out.println("Your enemy has " + health + " hp!");
        difficulty = 3;
    }

    public static void randomEnemy(){
        Random rnd = new Random();
        int rndEnemy = rnd.nextInt(100);

        if (rndEnemy >= 0 && rndEnemy <= 33){
            skeleton();
        }
        if (rndEnemy >= 34 && rndEnemy <= 66){
            spider();
        }
        if (rndEnemy >= 67 && rndEnemy <= 100){
            human();
        }
    }
}
