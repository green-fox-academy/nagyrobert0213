import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class Tests {

    private Sum szum;
    private int result;


    @Before
    public void test(){
        szum = new Sum();
        result = szum.elements();
    }

    @Test
    public void elements(){
        assertEquals(3,result);

    }
}
