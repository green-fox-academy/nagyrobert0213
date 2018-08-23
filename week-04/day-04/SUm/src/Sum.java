import java.util.ArrayList;

public class Sum {
    private ArrayList<Integer> numbers = new ArrayList<>();
    private int result;

    public Sum() {
        numbers();
    }
    public void numbers(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
    }

    public int getResult() {
        return result;
    }

    public void sumNumbs(){
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }
        System.out.println(getResult());
    }

}
