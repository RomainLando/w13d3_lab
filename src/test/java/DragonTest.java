import defence.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon();
    }

    @Test
    public void canDefend(){
        assertEquals(50, dragon.defend(), 0.0);
    }
}
