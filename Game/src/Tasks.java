import java.util.Random;
import java.util.Scanner;

public class Tasks {

    static Random diff = new Random();

    public static void fightQuestion(){
        System.out.println("Would you like to fight?");
        Scanner askFight = new Scanner(System.in);
        String fighting = askFight.nextLine();

        if(fighting.equalsIgnoreCase("yes")){
            fight();
        }
        if(fighting.equalsIgnoreCase("no")){
            return;
        }
    }
    public static void fight(){
        System.out.println("Fight!");

        Enemy.randomEnemy();
        askOptions();
    }
    public static void run(){
        if (Enemy.difficulty == 1){
            int rndDiff = diff.nextInt();
            if (rndDiff >= 20){
                System.out.println("You successfully ran away!");
            }
            else{
                MainCharacter.health = 0;
                System.out.println("You are dead!");
            }
        }

            if (Enemy.difficulty == 2){
            int rndDiff = diff.nextInt();
            if (rndDiff >= 30){
                System.out.println("You successfully ran away!");
            }
            else{
                MainCharacter.health = 0;
                System.out.println("You are dead!");
            }
        }

            if (Enemy.difficulty == 3){
            int rndDiff = diff.nextInt();
            if (rndDiff >= 50){
                System.out.println("You successfully ran away!");
            }
            else{
                MainCharacter.health = 0;
                System.out.println("You are dead!");
            }
        }
    }
    public static void askOptions(){
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("You have " + MainCharacter.health + " health!");
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("A - fight ----------------");
        System.out.println("B - drink an HP potion ---");
        System.out.println("C - run (may die) --------");
        System.out.println("--------------------------");
        System.out.println();

        Scanner scn = new Scanner(System.in);
        String answer = scn.nextLine();

        if (answer.equalsIgnoreCase("a")){
            combat();
        }

        if (answer.equalsIgnoreCase("b")){
            Attacks.drinkPotion();
        }

        if (answer.equalsIgnoreCase("c")){
            run();
        }

    }
    public static void combat(){
        System.out.println("In combat!");
        for (int i = 0; i < 100; i++) {
            Attacks.chooseAttack();
            Attacks.enemyAttack();
        }
    }
}
