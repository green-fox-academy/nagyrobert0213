public class Shifter implements CharSequence{

    String string;

    public Shifter(String string, int a) {
        this.string = string;
    }


    @Override
    public int length() {

        return string.length();
    }
    @Override
    public char charAt(int index) {

        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.substring(string.length() - end, string.length() - start);
    }
}
