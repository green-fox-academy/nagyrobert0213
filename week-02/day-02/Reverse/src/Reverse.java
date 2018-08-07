import java.util.Arrays;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        char[] reversedData = reversed.toCharArray();
       // System.out.println(Arrays.toString(reversedData));
        //System.out.println(reversed.charAt());

        for(int i = reversedData.length - 1; i >= 0; i--){
            System.out.print(reversedData[i]);
        }
    }

    /*public static int reverse(int[] list){
        for (int i = 0; i < reverse

    }*/
}