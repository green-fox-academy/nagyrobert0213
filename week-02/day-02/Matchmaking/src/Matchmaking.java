import java.util.*;

public class Matchmaking{

    public static void girlsAndBoys(ArrayList<String> girlsList, ArrayList<String> boysList, ArrayList<String> list){

        int temp = 0;
        if( girlsList.size() <= boysList.size()){
            temp = girlsList.size();

        }else{
            temp = boysList.size();
        }

        for(int i = 0; temp > i; i++){
            list.add(girlsList.get(i));
            list.add(boysList.get(i));
        }

    }

    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
        ArrayList<String> matches = new ArrayList<>();

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...


        girlsAndBoys(girls,boys,matches);

        System.out.println(matches);
    }
}