import java.util.Arrays;

public class FunArrays {

    public static void main(String[] args) {

        int[] intArray = new int[5];
        intArray[0] = 5;
        intArray[1] = 6;

        intArray[4] = 0;
        System.out.println(intArray[1]);

        int[] intArray2 = intArray;


        int[][] twoDimArray = new int[2][3];
        twoDimArray[0][0] = 5;

        int[][] twoDimArray2 = new int[][]{{1, 2, 3}, {4, 5}};

        for(int i = 0; i < twoDimArray2.length; i++){
            for(int j = 0; j < twoDimArray2[i].length; j++){
                System.out.print(twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(twoDimArray2[0][1] + ", " + twoDimArray2[1][1]);

        int intArray4[] = {8, 9, 5, 3};




        for(int element : intArray4){
            System.out.println(element);
        }

        Arrays.sort(intArray4);
        System.out.println("Sorted array: ");
        for (int element : intArray4) {
            System.out.println(element);
        }
        //System.out.println(intArray4[0]);

        int[] copiedArray4 = Arrays.copyOf(intArray4, intArray4.length);
        System.out.println("Copy: ");
        System.out.println(Arrays.toString(copiedArray4));

        intArray4[0] = 2;
        System.out.println(copiedArray4[0]);

        int[] arr = {1, 2, 3};
        printElements(arr);

        int[] cop = myCopy(arr);
        System.out.println(Arrays.toString(cop));




       /* int a = 5;
        int b = 6;
        //add(a,b);
        for (int i = 0; i < 5; i++){
            int tmp = add(i, b);
            System.out.println(tmp);*/
        //}

    }

    public static int add(int a, int b) {

        int sum = a + b;
        return sum;

    }
    public static void printElements(int[] toBePrinted){
        System.out.println(Arrays.toString(toBePrinted));
    }

    public static int[] myCopy(int[] toBeCopied){

        int[] copy = new int[toBeCopied.length];

        for(int i = 0; i < toBeCopied.length; i++){
            copy[i] = toBeCopied[i];
        }

        return copy;
    }

}
