public class Gnirts implements CharSequence {
    private StringBuilder sb;

    public Gnirts(String string){
        this.sb = new StringBuilder(string);
    }

@Override
    public int length() {

        return sb.length();
    }
@Override
    public char charAt(int index) {

        return sb.charAt(index);
    }



    @Override
    public CharSequence subSequence(int start, int end) {
        return sb.reverse();
    }
}
