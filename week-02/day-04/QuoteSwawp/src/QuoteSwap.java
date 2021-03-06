import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        quoteSwap(list);

        for (int i = 0; i < 8 ; i++) {
            System.out.print(list.get(i));
            System.out.print(" ");

        }
        // Expected output: "What I cannot create I do not understand."

    }

    public static void quoteSwap(ArrayList list){

        Collections.swap(list,2,5);
    }
}
