import Spells.Heal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealTest {

    Heal heal;

    @Before
    public void before(){
        heal = new Heal();
    }

    @Test
    public void canCastEffect(){
        assertEquals(20, heal.cast(), 0.0);
    }
}
