public class MainCharacter {
    static int health = 0;
    static String name = "";
    static int hpPotion = 4;

    public MainCharacter(String name, int health){
        this.health = health;
        this.name = name;
    }
    public static void chooseTask(Enemy enemyOne){
        Tasks.fightQuestion();
    }
}
