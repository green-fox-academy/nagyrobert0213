public class Gnirts implements CharSequence {
    private String string;

    public Gnirts(String string){
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



   /* @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }*/

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.substring(string.length() - end, string.length() - start);
    }
}
