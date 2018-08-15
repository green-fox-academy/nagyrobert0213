import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        List<Domino> dominoesFinal = new ArrayList<>();
        countDominoes(dominoes,dominoesFinal);
        return dominoesFinal;


    }
    public static void countDominoes(List<Domino> dominoes, List<Domino> dominoesFinal){

        dominoesFinal.add(dominoes.remove(0));
        for (int i = 0; i < dominoesFinal.size() ; i++) {
            for (int j = 0; j < dominoes.size() ; j++) {
                if (dominoesFinal.get(dominoesFinal.size()-1).getValues()[1] == dominoes.get(j).getValues()[0]){
                    dominoesFinal.add(dominoes.remove(j));
                }

            }
//            if (i != dominoes.size() + 1) {
//                int tmp = i;
//                dominoesFinal.set()
//                //dominoes.add(i,)
//            }
//            else{
//                System.out.println(dominoes.get(i));
//            }
        }




    }
}
