import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Attacks {


    public static void baseDmg(int critOrBase){
        Random critRnd = new Random();
        int critChance = critRnd.nextInt(100);
        System.out.println(Enemy.name + " - " + Enemy.health + " HP");
        System.out.println();

        if (critChance <= 50){
            int crit = critOrBase*2;
            Enemy.health -= critOrBase*2;
            System.out.println("Critical hit!");
            System.out.println("You hit " + Enemy.name + " for " + crit + "(" + critOrBase + ")" + " damage!");
        }
        else{
            Enemy.health -= critOrBase;
            System.out.println("You hit " + Enemy.name + " for " + critOrBase + " damage!");
        }
    }

    public static void chooseAttack(){

        System.out.println("How would you like to attack?");
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("A - punch -------------------");
        System.out.println("B - kick --------------------");
        System.out.println("C - throw -------------------");
        System.out.println("-----------------------------");
        System.out.println();

        Scanner scn = new Scanner(System.in);
        String answerAttack = scn.nextLine();
        int dmg = 10;

        if (answerAttack.equalsIgnoreCase("a")){
            baseDmg(dmg);
        }

        if (answerAttack.equalsIgnoreCase("b")){
            baseDmg(dmg+10);
        }

        if (answerAttack.equalsIgnoreCase("c")){
            baseDmg(dmg+20);
        }
        System.out.println();
        System.out.println("The enemy has " + Enemy.health + " HP left!");
    }

    public static void enemyAttack(){
        Random enemyAtt = new Random();
        int whichEnemyAttack = enemyAtt.nextInt(70);

        if(whichEnemyAttack <= 50){
            MainCharacter.health -= 10;
            System.out.println();
            System.out.println(Enemy.name + " punched you for 10!");
            System.out.println();
        }
        if (whichEnemyAttack > 50 && whichEnemyAttack <= 60){
            MainCharacter.health -= 20;
            System.out.println();
            System.out.println(Enemy.name + " kicked you for 20!");
            System.out.println();
        }
        if (whichEnemyAttack > 60 && whichEnemyAttack <= 70){
            MainCharacter.health -= 30;
            System.out.println();
            System.out.println(Enemy.name + " threw a brick at you for 30!");
            System.out.println();
        }
        System.out.println("You have " + MainCharacter.health + " left!");

        try{
            System.out.println("Resuming in 2 seconds!");
            for (int i = 0; i < 2; i++) {
                TimeUnit.SECONDS.sleep(1);
            }
            System.out.println();
        }
        catch(Exception e){
        }
    }

    public static void drinkPotion(){
        MainCharacter.hpPotion--;

        if (MainCharacter.hpPotion <= 0){
            MainCharacter.hpPotion = 0;
        }

        System.out.println("You have " + (MainCharacter.hpPotion - 1) + " HP potion left!");
        if (MainCharacter.hpPotion > 0){
            MainCharacter.health +=30;
        }
        else{
            System.out.println("**You don't have any HP potions left!**");
        }
        Tasks.askOptions();
    }
}
