import characters.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(100);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, troll.getHealthPoints(), 0.0);
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(50);
        assertEquals(50, troll.getHealthPoints(), 0.0);
    }
}

