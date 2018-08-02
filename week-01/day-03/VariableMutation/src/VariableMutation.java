public class VariableMutation {
    public static void main (String[] args){

        int a = 3;
        System.out.println(a+10);

        int b = 100;
        b = b - 7;
        System.out.println(b);

        int c = 44;
        c = c *2;
        System.out.println(c);

        int d = 125;
        System.out.println(d /5);

        int e = 8;
        System.out.println(e*e);

        int f1 = 123;
        int f2 = 345;
        boolean bigger = f1 > f2;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;
        boolean bigger2 =(double)g2>g1;
        System.out.println(bigger2);

        int h = 135798745;
        boolean divisor = h % 11 == 0;


        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;
        int squared = i2*i2;
        int cubed = i2*i2*i2;
        boolean higher1 = i1>squared;
        boolean lesser1 = i1<cubed;
        System.out.println(higher1);
        System.out.println(lesser1);

        int j =1521;
        boolean div1 = j % 3 == 0;
        boolean div2 = j % 5 == 0;
        System.out.println(div1);
        System.out.println(div2);

        String k1 = "Apple";
        String k = k1 + k1+ k1 + k1;
        System.out.println(k);


    }
}

