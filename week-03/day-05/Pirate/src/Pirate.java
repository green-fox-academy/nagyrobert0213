public class Pirate {

    int soberness = 10;
    int drinkRumTimes = 0;
    int health = 100;
    static boolean isPirateAlive = true;


    public void drinkSomeRum(){
        this.soberness--;
        this.drinkRumTimes++;
        if (soberness < 0){
            System.out.println("He is already dead");
            return;
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
}
