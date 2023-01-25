import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe();
    }

    @Test
    public void hasDamage(){
        assertEquals(35, axe.attack(), 0.0);
    }
}
