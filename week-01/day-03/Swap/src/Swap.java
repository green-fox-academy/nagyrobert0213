public class Swap {
    public static void main (String[] args){
        int a = 123;
        int b = 526;

        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}