import characters.Orc;
import characters.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(100);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, orc.getHealthPoints(), 0.0);
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(50);
        assertEquals(50, orc.getHealthPoints(), 0.0);
    }
}
