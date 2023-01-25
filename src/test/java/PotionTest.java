import heal.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;

    @Before
    public void before(){
        potion = new Potion();
    }

    @Test
    public void canHeal(){
        assertEquals(30, potion.heal(), 0.0);
    }
}
