import java.util.Arrays;
import java.util.List;

public class Domino {
    int[] values;

    Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

}