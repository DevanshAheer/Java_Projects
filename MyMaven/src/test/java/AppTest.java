import org.junit.Test;

import static org.example.Main.addition;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void Test()
    {
        assertEquals(10, addition(5,5));
    }

}
