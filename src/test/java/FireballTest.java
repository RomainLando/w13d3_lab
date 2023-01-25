import Spells.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireballTest {

    Fireball fireball;

    @Before
    public void before(){
        fireball = new Fireball();
    }

    @Test
    public void canCastEffect(){
        assertEquals(-40, fireball.cast(), 0.0);
    }
}
