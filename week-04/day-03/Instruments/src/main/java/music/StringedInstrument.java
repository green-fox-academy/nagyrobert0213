package main.java.music;

public abstract class StringedInstrument extends Instrument{
    int numberOfStrings;
    String sound;

    public void sound(){
        System.out.println(sound);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
