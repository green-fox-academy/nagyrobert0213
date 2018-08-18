import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String mainName = name.nextLine();
        Pirate pirate = new Pirate(mainName,100);
        PirateAI pirateTwo = new PirateAI(100,"Sanyi");
        pirate.chooseTask(pirateTwo);
    }
}
