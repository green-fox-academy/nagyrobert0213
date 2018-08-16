public class Animal {
    int hunger = 50;
    int thirst = 50;

    /*Animal(int hunger, int thirst){
        this.hunger = 50;
        this.thirst = 50;
    }*/
    public void drink() {
        this.thirst--;
        System.out.println(thirst);
    }
    public void eat(){
        this.hunger--;
        System.out.println(hunger);
    }
    public void play(){
        this.hunger--;
        this.thirst--;
        System.out.print(hunger + " ");
        System.out.print(thirst);
    }
}
