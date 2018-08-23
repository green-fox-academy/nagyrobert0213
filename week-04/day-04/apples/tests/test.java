import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class test {

    private String apple = "alma";
    Apple alma;

    @Before
    public void makeApple(){
        alma = new Apple(apple);
    }

    @Test
    public void getApple(){
        assertEquals(apple, "alma");

    }
}
