<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    static Enemy enemyOne = new Enemy();

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        MainCharacter main = new MainCharacter(name, 100);
       // Enemy enemyOne = new Enemy("mobOne", 30);
        System.out.println(MainCharacter.name + ", you have " +  MainCharacter.health + " HP!");
        main.chooseTask(enemyOne);
    }
}
=======
import java.util.Scanner;

public class Main {
    static Enemy enemyOne = new Enemy();

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        MainCharacter main = new MainCharacter(name, 100);
       // Enemy enemyOne = new Enemy("mobOne", 30);
        System.out.println(MainCharacter.name + ", you have " +  MainCharacter.health + " HP!");
        main.chooseTask(enemyOne);
    }
}
>>>>>>> b2655218302fc1ed0d029ba24d8963dd20adaed6
