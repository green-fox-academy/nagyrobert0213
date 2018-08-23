import java.util.ArrayList;

public class Sum {

    Sum() {
    }

    public int elements(){
        ArrayList<Integer> arrays = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < 3 ; i++) {
            arrays.add(i);
        }

        for (int j = 0; j < arrays.size() ; j++) {
            result += arrays.get(j);
        }
        return result;
    }
}
